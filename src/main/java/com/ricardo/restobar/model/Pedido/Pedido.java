package com.ricardo.restobar.model.Pedido;

import java.math.BigInteger;

import javax.persistence.*;

import com.ricardo.restobar.model.Mesa;

import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id_pedido;
	
	@ManyToOne
	@JoinColumn(name = "id_mesa")
	@Column(name = "pedido_mesa")
	private Mesa mesa;
	
	@Column(name = "pedido_contenido")
	private String contenido;
	
	@Column(name = "pedido_hora")
	private BigInteger hora;
	
	@Column(name = "pedido_fecha")
	private BigInteger fecha;
	
	@Column(name = "pedido_estado")
	private EstadoPedido estado;
}
