package com.enrashe.myles;

import java.util.ArrayList;
import java.util.List;

public class Datos_Eventos {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTrasnporte() {
        return trasnporte;
    }

    public void setTrasnporte(String trasnporte) {
        trasnporte = trasnporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private String descripcion;
    private String precio;
    private String trasnporte;
    private String fecha;

    public Datos_Eventos(String titulo, String descripcion, String precio, String trasnporte, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.trasnporte = trasnporte;
        this.fecha = fecha;
    }
}
