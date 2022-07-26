package com.ricardo.restobar.model.Usuarios;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;
	
	@Column(name = "nombre_usuario")
	private String nombre;
	
	@Column(name = "tipo_usuario")
	private TipoUsuario tipo;

}
