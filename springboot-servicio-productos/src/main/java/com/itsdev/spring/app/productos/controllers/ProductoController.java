package com.itsdev.spring.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itsdev.spring.app.productos.models.entity.Producto;
import com.itsdev.spring.app.productos.models.service.IProductoService;
import com.itsdev.spring.app.productos.models.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService servicio;
		
	@GetMapping("/listar")
	public List<Producto> listar(){
		return servicio.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return servicio.findById(id);
	}
	
}
