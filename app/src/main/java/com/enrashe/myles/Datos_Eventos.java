package com.enrashe.myles;

public class Datos_Eventos {

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
        this.trasnporte = trasnporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private String titulo;
    private String descripcion;
    private String precio;
    private String trasnporte;
    private String fecha;
    int idFoto;


    public Datos_Eventos(int idFoto, String titulo, String descripcion, String precio, String trasnporte, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.trasnporte = trasnporte;
        this.fecha = fecha;
        this.idFoto = idFoto;
    }
}
