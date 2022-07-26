package com.ricardo.restobar.model;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "mesa")
public class Mesa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;
	
	@Column(name = "numero_mesa")
	private Integer numero;
	
	

}
