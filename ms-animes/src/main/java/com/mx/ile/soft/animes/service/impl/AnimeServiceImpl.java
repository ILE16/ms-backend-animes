package com.mx.ile.soft.animes.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.mx.ile.soft.animes.repository.IAnimeRepository;
import com.mx.ile.soft.animes.service.IAnimeService;
import com.mx.ile.soft.commons.models.entity.Anime;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimeServiceImpl implements IAnimeService {

	private final IAnimeRepository repository;

	@Override
	public List<Anime> getAll() {
		List<Anime> animes = StreamSupport.stream(this.repository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return animes;
	}

	@Override
	public Anime getOneById(Long id) {

		return this.repository.findById(id).orElse(null);
	}

	@Override
	public Anime createOne(Anime anime) {
		anime.setFechaCreacion(LocalDateTime.now());
		return this.repository.save(anime);
	}

	@Override
	public Anime updateOne(Anime anime) {
		return this.repository.save(anime);
	}

	@Override
	public void deleteOneById(Long id) {
		this.repository.deleteById(id);
	}

}
