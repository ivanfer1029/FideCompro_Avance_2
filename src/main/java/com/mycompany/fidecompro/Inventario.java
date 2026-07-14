//subclasem esta no tiuene herencia 
package com.mycompany.fidecompro;

import java.util.ArrayList;

public class Inventario {
    
    //atributos 
    private ArrayList <Producto> listaProductos;
    private int cantidadMinima;
    private String fechaActualizada;
    
    //constructor
    
    public Inventario(int cantidadMinima,String fechaActualizada){        
        this.cantidadMinima=cantidadMinima;
        this.listaProductos= new ArrayList<> ();
        this.fechaActualizada=fechaActualizada;
    }
    
    //Getters and setters 

    public ArrayList <Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList <Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public String getFechaActualizada() {
        return fechaActualizada;
    }

    public void setFechaActualizada(String fechaActualizada) {
        this.fechaActualizada = fechaActualizada;
    }


    
    
    
    
    
}
