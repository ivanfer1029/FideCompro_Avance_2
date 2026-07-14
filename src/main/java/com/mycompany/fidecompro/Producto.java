//subclase
package com.mycompany.fidecompro;
public class Producto{
    
    //atributos
    private int idProducto;
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadDisponible;
    private String descripcion;
    
    
    
    //constructor 
    public Producto(int idProducto, String nombre,String categoria,double precio,int cantidadDisponible,String descripcion) {
        this.idProducto=idProducto;
        this.nombre=nombre;
        this.categoria=categoria;
        this.precio=precio;
        this.cantidadDisponible=cantidadDisponible;
        this.descripcion=descripcion;
    }

    //getters and setters 
    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodo para mostrar la informacion del producto 
    public String mostrarInformacion(){
        return "Codigo:" + getIdProducto()
                + "Producto" + getNombre()
                + "Precio" + getPrecio()
                + "Existencia" + getCantidadDisponible();
    }
    
    
}
