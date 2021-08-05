package com.mx.ile.soft.animes.repository;

import org.springframework.data.repository.CrudRepository;

import com.mx.ile.soft.commons.models.entity.Anime;

public interface IAnimeRepository extends CrudRepository<Anime, Long>{

}
