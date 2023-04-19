/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.almacenes.services;

import java.util.List;

import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Caja;

/**
 * @author aitor
 *
 */
public interface ICajaService {
	// Metodos del CRUD
	public List<Caja> listarCajas(); // Listar All

	public Caja guardarCaja(Caja caja); // Guarda un caja CREATE

	public Caja cajaById(String numreferencia); // Leer datos de un caja READ

	public Caja actualizarCaja(Caja caja); // Actualiza datos del caja UPDATE

	public void eliminarCaja(String numreferencia);// Elimina el caja DELETE

}
