package com.ricardo.restobar.model.Pedido;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.*;

import com.ricardo.restobar.model.Mesa;
import com.ricardo.restobar.model.Comida.Comida;

import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger pedido_id;
	
	@ManyToOne
	@JoinColumn(name = "mesa_id")
	@Column(name = "pedido_mesa")
	private Mesa mesa;
	
	@Column(name = "pedido_contenido")
	private List<Comida> contenido;
	
	@Column(name = "pedido_comentarios")
	private List<String> comentarios;
	
	@Column(name = "pedido_hora")
	private BigInteger hora;
	
	@Column(name = "pedido_fecha")
	private BigInteger fecha;
	
	@Column(name = "pedido_estado")
	private EstadoPedido estado;
}
