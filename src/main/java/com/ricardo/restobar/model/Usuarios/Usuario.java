package com.ricardo.restobar.model.Usuarios;

import java.math.BigInteger;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id_usuario;
	
	@Column(name = "usuario_nombre")
	private String nombre;
	
	@Column(name = "usuario_apellido")
	private String apellido;
	
	@Column(name = "usuario_rut")
	private String rut;
	
	@Column(name = "usuario_telefono")
	private String telefono;
	
	@Column(name = "usuario_correo")
	private String correo;
	
	@Column(name = "usuario_tipo")
	private TipoUsuario tipo;

}
