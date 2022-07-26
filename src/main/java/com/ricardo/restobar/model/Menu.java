package com.ricardo.restobar.model;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;
}
