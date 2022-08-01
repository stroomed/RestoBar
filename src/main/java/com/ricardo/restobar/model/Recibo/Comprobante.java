package com.ricardo.restobar.model.Recibo;

import java.math.BigInteger;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "comprobante")
public class Comprobante {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id_comprobante;
	
	@Column(name = "comprobante_tipo")
	private TipoComprobante tipo;
	
	@Column(name = "comprobante_monto")
	private BigInteger monto;
	
	@Column(name = "comprobante_hora")
	private BigInteger hora;
	
	@Column(name = "comprobante_fecha")
	private BigInteger fecha;
}
