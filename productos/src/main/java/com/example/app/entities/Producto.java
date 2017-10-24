/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.entities;

/**
 *
 * @author Gonzalo
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Producto {

	@Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        //PONIENDO ID AL CODIGO ME CASCA (SUPONGO QUE ES POR EL @Id...
	private int codigo;

    @Size(min = 2, max = 45, message = "el nombre debe tener minimo 2 letras y maximo 45")
	private String nombre;
    
    @Size(min = 4, max = 45, message = "la descripcion debe tener minimo 4 letras y maximo 45")
    private String descripcion;

    @Min(0)
    private float precio;
	
	public Producto() {
                this.codigo = codigo;
		this.nombre = "";
		this.descripcion = "";
		this.precio = 0;
	}
	
	public Producto(int codigo, String name, String descripcion, float precio) {		
		this.nombre = name;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}

