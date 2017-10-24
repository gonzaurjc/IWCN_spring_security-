/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.configuration;

/**
 *
 * @author Gonzalo
 */
import com.example.app.entities.Producto;
import com.example.app.entities.User;
import com.example.app.products.ProductRepository;
import com.example.app.users.UserRepository;
import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;



@Service
public class DatabaseLoader implements IProductoService {

	@Autowired
	private ProductRepository productoRepository;
        @Autowired
	private UserRepository userRepository;
	
	@PostConstruct
        @Override
	public void initDatabase() {	
		// User #1: "user", with password "user1" and role "USER"
		GrantedAuthority[] userRoles = { new SimpleGrantedAuthority("ROLE_USER") };  
		userRepository.save(new User("user", "user", Arrays.asList(userRoles)));

		// User #2: "root", with password "root1" and roles "USER" and "ADMIN"  
		GrantedAuthority[] adminRoles = { new SimpleGrantedAuthority("ROLE_USER"),
		new SimpleGrantedAuthority("ROLE_ADMIN") };
		userRepository.save(new User("admin", "admin", Arrays.asList(adminRoles)));
	}
	
        @Override
	public void save(Producto producto) {
                productoRepository.save(producto);
	}

        @Override
	public void delete(int codigo) {
		productoRepository.delete(codigo);
	}

        @Override
	public Producto getProducto(int codigo) {
		return productoRepository.findOne(codigo);
	}
	
        @Override
	public void edit(Producto producto) {
		productoRepository.save(producto);
	}
	
        @Override
	public ArrayList<Producto> findAll() {
		ArrayList<Producto> productos = new ArrayList<>();
	
		for (Producto p : productoRepository.findAll()) {
			productos.add(p);
		}		
		return productos;
	}	
}

