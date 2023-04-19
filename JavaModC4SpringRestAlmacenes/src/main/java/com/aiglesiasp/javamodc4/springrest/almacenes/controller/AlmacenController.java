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

import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Almacen;
import com.aiglesiasp.javamodc4.springrest.almacenes.services.AlmacenServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacen(){
		return almacenServiceImpl.listarAlmacen();
	}
	
	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen almacenById(@PathVariable(name="codigo") int codigo) {
		Almacen almacen= new Almacen();
		almacen=almacenServiceImpl.almacenById(codigo);
		System.out.println("Fabricante By ID: "+almacen);
		return almacen;
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo")int codigo,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		almacen_seleccionado= almacenServiceImpl.almacenById(codigo);
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
	
		almacen_actualizado = almacenServiceImpl.actualizarAlmacen(almacen_seleccionado);
		System.out.println("El cliente actualizado es: "+ almacen_actualizado);
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name="codigo")int codigo) {
		almacenServiceImpl.eliminarAlmacen(codigo);
	}

}
