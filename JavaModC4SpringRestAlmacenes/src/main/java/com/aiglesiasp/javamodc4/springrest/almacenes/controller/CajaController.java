/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Caja;
import com.aiglesiasp.javamodc4.springrest.almacenes.services.CajaServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;;

	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServiceImpl.listarCajas();
	}

	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.guardarCaja(caja);
	}

	@GetMapping("/cajas/{numreferencia}")
	public Caja cajaById(@PathVariable(name = "numreferencia") String numreferencia) {
		Caja caja = new Caja();
		caja = cajaServiceImpl.cajaById(numreferencia);
		System.out.println("Fabricante By ID: " + caja);
		return caja;
	}

	@PutMapping("/cajas/{numreferencia}")
	public Caja actualizarCaja(@PathVariable(name = "numreferencia") String numreferencia, @RequestBody Caja caja) {

		Caja caja_seleccionado = new Caja();
		Caja caja_actualizado = new Caja();
		caja_seleccionado = cajaServiceImpl.cajaById(numreferencia);
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());

		caja_actualizado = cajaServiceImpl.actualizarCaja(caja_seleccionado);
		return caja_actualizado;
	}

	@DeleteMapping("/cajas/{numreferencia}")
	public void eliminarCaja(@PathVariable(name = "numreferencia") String numreferencia) {
		cajaServiceImpl.eliminarCaja(numreferencia);
	}

}
