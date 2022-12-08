package com.itsdev.spring.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itsdev.spring.app.productos.models.dao.ProductoDao;
import com.itsdev.spring.app.productos.models.entity.Producto;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private ProductoDao producto;
	
	@Override
	@Transactional( readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) producto.findAll();
	}

	@Override
	@Transactional( readOnly = true)
	public Producto findById(Long id) {
		return producto.findById(id).orElse(null);
	}

}
