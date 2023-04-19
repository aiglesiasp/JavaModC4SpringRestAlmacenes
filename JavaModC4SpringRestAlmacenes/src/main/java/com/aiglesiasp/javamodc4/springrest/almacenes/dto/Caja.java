/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.almacenes.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "cajas")
public class Caja {
	@Id
	@Column(name = "numreferencia")
	private String numreferencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	// CONTRUCTORES
	public Caja() {

	}

	public Caja(String numreferencia, String contenido, int valor, Almacen almacen) {
		this.numreferencia = numreferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// GETTERS Y SETTERS
	public String getNumreferencia() {
		return numreferencia;
	}

	public void setNumreferencia(String numreferencia) {
		this.numreferencia = numreferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Caja [numreferencia=" + numreferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

}
