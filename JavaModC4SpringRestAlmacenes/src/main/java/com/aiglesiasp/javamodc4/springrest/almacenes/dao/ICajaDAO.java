package com.aiglesiasp.javamodc4.springrest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springrest.almacenes.dto.Caja;

public interface ICajaDAO extends JpaRepository<Caja, String> {

}
