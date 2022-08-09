package com.ricardo.restobar.model;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.*;

import com.ricardo.restobar.model.Comida.Comida;

import lombok.Data;

@Data
@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger menu_id;
	
	@Column(name = "menu_plato")
	private List<Comida> plato;

}
