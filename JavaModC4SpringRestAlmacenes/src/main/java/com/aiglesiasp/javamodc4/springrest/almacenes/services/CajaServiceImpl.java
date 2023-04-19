/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.almacenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springrest.almacenes.dao.ICajaDAO;
import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Caja;

/**
 * @author aitor
 *
 */
@Service
public class CajaServiceImpl implements ICajaService {
	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaById(String numreferencia) {
		return iCajaDAO.findById(numreferencia).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numreferencia) {
		iCajaDAO.deleteById(numreferencia);

	}

}
