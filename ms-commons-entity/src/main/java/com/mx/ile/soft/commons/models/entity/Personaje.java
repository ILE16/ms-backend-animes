package com.mx.ile.soft.commons.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mx.ile.soft.commons.models.commons.CommonFields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author IleSoft
 * @version 1.0 04/08/2021
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "personajes")
public class Personaje extends CommonFields {
	@Column(name = "nombre", length = 45)
	private String nombre;
	
	@Column(name = "actor", length = 45)
	private String actor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idAnime")
	private Anime anime;
}
