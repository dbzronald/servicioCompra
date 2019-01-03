package com.web.compra.Entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Articulo implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(columnDefinition = "TEXT")
    private String foto;

    private String nombre;

    private String descripcion;

    private int cantidadDisp;

    private float precio;


    public Articulo() {
    }

    public Articulo(String foto, String nombre, String descripcion, int cantidadDisp, float precio) {
        this.foto = foto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisp = cantidadDisp;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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

    public int getCantidadDisp() {
        return cantidadDisp;
    }

    public void setCantidadDisp(int cantidadDisp) {
        this.cantidadDisp = cantidadDisp;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}