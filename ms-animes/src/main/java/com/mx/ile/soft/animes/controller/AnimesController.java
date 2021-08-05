package com.mx.ile.soft.animes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ile.soft.animes.service.IAnimeService;
import com.mx.ile.soft.commons.models.entity.Anime;

@RestController
@RequestMapping("/ms")
@CrossOrigin(origins="http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class AnimesController {

	@Autowired
	private IAnimeService animeService;

	@GetMapping("/animes")
	public ResponseEntity<?> getAll() {
		List<Anime> animes = this.animeService.getAll();
		return animes.size() == 0 ? ResponseEntity.noContent().build() : ResponseEntity.ok(animes);
	}

	@GetMapping("/anime/{id}")
	public ResponseEntity<?> findOneById(@PathVariable Long id) {
		Anime anime = this.animeService.getOneById(id);
		return anime == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(anime);
	}

	@PostMapping("/anime")
	public ResponseEntity<?> saveOne(@RequestBody Anime anime) {
		return ResponseEntity.ok(this.animeService.createOne(anime));
	}

	@PutMapping("/anime")
	public ResponseEntity<?> updateOne(@RequestBody Anime anime) {
		return ResponseEntity.ok(this.animeService.updateOne(anime));
	}

	@DeleteMapping("/anime/{id}")
	public ResponseEntity<?> deleteOneById(@PathVariable Long id) {
		this.animeService.deleteOneById(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
