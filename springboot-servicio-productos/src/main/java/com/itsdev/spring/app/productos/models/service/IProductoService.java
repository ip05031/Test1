package com.itsdev.spring.app.productos.models.service;

import java.util.List;

import com.itsdev.spring.app.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	
	
}
