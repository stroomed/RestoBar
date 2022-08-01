package com.ricardo.restobar.model;

import java.math.BigInteger;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;
	
	private String titulo;
	
	private String descripcion;
	
	private BigInteger valor;
}
