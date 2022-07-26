package com.ricardo.restobar.model;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;
	
	
}
