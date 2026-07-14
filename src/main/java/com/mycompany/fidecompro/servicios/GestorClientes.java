package com.mycompany.fidecompro.servicios;

import java.util.ArrayList;
import com.mycompany.fidecompro.excepciones.ClienteDuplicadoExcepcion;
import com.mycompany.fidecompro.excepciones.ClienteNoEncontradoException;
import com.mycompany.fidecompro.Cliente;

public class GestorClientes {
    
    private ArrayList<Cliente> clientes;
    
    public GestorClientes(){
        clientes= new ArrayList<>();
    }
    
    public void registrarCliente (Cliente nuevoCliente)
        throws ClienteDuplicadoExcepcion{
        
        for (Cliente clienteRegistrado: clientes){
            if (clienteRegistrado.getCedula().equalsIgnoreCase(nuevoCliente.getCedula())){
                throw new ClienteDuplicadoExcepcion(
                        "Ya existe un cliente con esa cedula"
                ); 
            }
        }
        
        clientes.add(nuevoCliente);
    }
    
    public Cliente buscarCliente(String cedula)
        throws ClienteNoEncontradoException {
            
        for(Cliente cliente : clientes ){
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                return cliente;
            }
        }
    
    throw new ClienteNoEncontradoException(
            "No se encontró un cliente en la lista indicada"
        );   
    }
    
    public ArrayList<Cliente> obtenerClientes(){
        return clientes;
    }        
}
