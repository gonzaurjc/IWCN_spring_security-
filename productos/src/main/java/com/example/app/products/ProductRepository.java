/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.products;

/**
 *
 * @author Gonzalo
 */
import com.example.app.entities.Producto;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Producto, Integer> {
	
}
