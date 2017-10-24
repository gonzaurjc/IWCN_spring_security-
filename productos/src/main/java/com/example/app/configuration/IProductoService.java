/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.configuration;

import com.example.app.entities.Producto;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public interface IProductoService {
    public void initDatabase();
    public void save(Producto producto);
    public void delete(int codigo);
    public Producto getProducto(int codigo);
    public void edit(Producto producto);
    public ArrayList<Producto> findAll();
}
