//Superclase
package com.mycompany.fidecompro;
public abstract class Persona {
    
    //Atributos
    
    private int id;
    private String nombre;
    
    //Constructor
    
    public Persona (int id, String nombre){
    
    this.id= id;
    this.nombre= nombre;
    
    }
    
    
    //metodo abstracto para mostar informacion
    public abstract String mostrarInformacion();
    

    
    //getters and setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    
}
