package com.enrashe.myles;

import java.util.ArrayList;
import java.util.Date;
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
        return Trasnporte;
    }

    public void setTrasnporte(String trasnporte) {
        Trasnporte = trasnporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private String descripcion;
    private String precio;
    private String Trasnporte;
    private String fecha;

    public Datos_Eventos(String titulo, String descripcion, String precio, String trasnporte, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        Trasnporte = trasnporte;
        this.fecha = fecha;
    }

    private List<Datos_Eventos>datos_eventos;

    private void initdata(){
        datos_eventos=new ArrayList<>();

        datos_eventos.add(new Datos_Eventos("Scaperoom","Se abre nuestro nuevo scaperoom de ultramarinos","Gratutita","Linea 11","2000-05-14"));
        datos_eventos.add(new Datos_Eventos("Scaperoom","Se abre nuestro nuevo scaperoom de ultramarinos","Gratutita","Linea 11","2000-05-14"));
        datos_eventos.add(new Datos_Eventos("Scaperoom","Se abre nuestro nuevo scaperoom de ultramarinos","Gratutita","Linea 11","2000-05-14"));
    }
}
