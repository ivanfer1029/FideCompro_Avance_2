package com.mycompany.fidecompro.servicios;

import java.util.ArrayList;
import com.mycompany.fidecompro.Producto;
import com.mycompany.fidecompro.excepciones.ProductoNoEncontradoException;
import com.mycompany.fidecompro.excepciones.ProductoDuplicadoException;

public class GestorProductos {
    
    private ArrayList<Producto> productos;
    
    public GestorProductos(){
    productos = new ArrayList<>();
    }
    
    public void registrarProducto(Producto nuevoProducto)
            throws ProductoDuplicadoException{
        
        for (Producto productoRegistrado : productos){
            if (productoRegistrado.getIdProducto()
                    == nuevoProducto.getIdProducto()){
                throw new ProductoDuplicadoException (
                        "Ya existe un producto con ese código"
                );            
            }
        }
    
        productos.add(nuevoProducto);
    
    }
    
    public Producto buscarProducto (int idProducto)
            throws ProductoNoEncontradoException{
        
        for (Producto productoRegistrado : productos){
            if (productoRegistrado.getIdProducto() == idProducto){
                return productoRegistrado;
            }
        }
    
    throw new ProductoNoEncontradoException(
            "No se encontró un producto con el código indicado"
        );    
    } 
    
    public ArrayList<Producto> obtenerProductos(){
        return productos;
    }
    
}
