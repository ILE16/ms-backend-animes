package com.mx.ile.soft.animes.service;

import java.util.List;

import com.mx.ile.soft.commons.models.entity.Anime;

/**
 * @author IleSoft
 * @version 1.0 04/08/2021
 *
 *          Interface que define los metodos para la logica de negocio de
 *          animes.
 */
public interface IAnimeService {
	/**
	 * Metodo que permite consultar un listado de animes.
	 * 
	 * @return {@link List} animes obtenidos.
	 */
	List<Anime> getAll();

	/**
	 * Metodo que permite obtener un anime.
	 * 
	 * @param id {@link Long} identificador del anime.
	 */
	Anime getOneById(Long id);

	/**
	 * Metodo que permite guardar un anime.
	 * 
	 * @param anime {@link Anime} objeto con el anime a guardar.
	 * @return {@link Anime} anime guardado.
	 */
	Anime createOne(Anime anime);

	/**
	 * Metodo que permite actualizar un anime.
	 * 
	 * @param anime {@link Anime} objeto con el anime a actualizar.
	 * @return {@link Anime} anime actualizado.
	 */
	Anime updateOne(Anime anime);

	/**
	 * Metodo que permite eliminar un anime.
	 * 
	 * @param id {@link Long} identificador del anime.
	 */
	void deleteOneById(Long id);
}
