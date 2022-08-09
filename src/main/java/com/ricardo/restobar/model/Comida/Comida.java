package com.ricardo.restobar.model.Comida;

import java.math.BigInteger;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "comida")
public class Comida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger comida_id;
	
	@Column(name = "comida_tipo")
	private TipoComida tipo;
	
	@Column(name = "comida_titulo")
	private String titulo;
	
	@Column(name = "comida_descripcion")
	private String descripcion;
	
	@Column(name = "comida_valor")
	private BigInteger valor;
	
	@Column(name = "comida_imagen")
	private String imagen;

}
