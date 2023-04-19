/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.almacenes.services;

import java.util.List;

import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Almacen;

/**
 * @author aitor
 *
 */
public interface IAlmacenService {
	// Metodos del CRUD
	public List<Almacen> listarAlmacen(); // Listar All

	public Almacen guardarAlmacen(Almacen almacen); // Guarda un almacen CREATE

	public Almacen almacenById(int codigo); // Leer datos de un almacen READ

	public Almacen actualizarAlmacen(Almacen almacen); // Actualiza datos del almacen UPDATE

	public void eliminarAlmacen(int codigo);// Elimina el almacen DELETE
}
