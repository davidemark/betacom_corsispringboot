package com.torino.corsi.businesscomponent.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Corso implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -3245269256696581996L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codcorso;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Date dataInizio;
	
	@Column(nullable = false)
	private Date dataFine;
	
	@Column(nullable = false)
	private Double costo;
	
	@Column(nullable = false)
	private String commento;
	
	
	private long coddocente;
}
