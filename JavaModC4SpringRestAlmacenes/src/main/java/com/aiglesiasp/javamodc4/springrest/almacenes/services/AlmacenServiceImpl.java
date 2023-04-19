/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.almacenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springrest.almacenes.dao.IAlmacenDAO;
import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Almacen;

/**
 * @author aitor
 *
 */
@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacen() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenById(int codigo) {
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int codigo) {
		iAlmacenDAO.deleteById(codigo);

	}

}
