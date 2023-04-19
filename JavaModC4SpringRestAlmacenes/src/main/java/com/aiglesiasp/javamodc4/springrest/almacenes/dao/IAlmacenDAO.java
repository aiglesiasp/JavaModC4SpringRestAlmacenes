/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Almacen;

/**
 * @author aitor
 *
 */
public interface IAlmacenDAO extends JpaRepository<Almacen, Integer> {

}
