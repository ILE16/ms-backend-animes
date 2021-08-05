package com.mx.ile.soft.commons.models.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.mx.ile.soft.commons.models.commons.CommonFields;

import lombok.Data;


@Data
@Entity
@Table(name = "animes")
public class Anime extends CommonFields{
	/**
	 * Nombre del anime.
	 */
	@Column(name = "nombre", length = 45)
	private String nombre;
	/**
	 * Genero del anime.
	 */
	@Column(name = "genero", length = 45)
	private String genero;
	
	
}
