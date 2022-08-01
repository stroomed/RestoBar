package com.ricardo.restobar.model;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.*;

import com.ricardo.restobar.model.Pedido.Pedido;
import com.ricardo.restobar.model.Usuarios.Usuario;

import lombok.Data;

@Data
@Entity
@Table(name = "mesa")
public class Mesa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id_mesa;
	
	@Column(name = "numero_mesa")
	private BigInteger numero;
	
	@Column(name = "mesa_clientes")
	private Integer nclientes;
	
	@Column(name = "mesa_garzon")
	private Usuario garzon;
	
	@Column(name = "mesa_estado")
	private Boolean estado;
	
	@OneToMany(mappedBy = "mesa")
	@Column(name = "mesa_pedido")
	private List<Pedido> orden;

}
