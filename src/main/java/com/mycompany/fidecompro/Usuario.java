//subclase, hereda de Persona 
package com.mycompany.fidecompro;
public class Usuario extends Persona {
    
    private String usuario;
    private String contrasena;
    private String rol;
    
    //Constructor 
    public Usuario(int id, String nombre,String usuario,String contrasena,String rol) {
        super(id, nombre);
        this.usuario=usuario;
        this.contrasena=contrasena;
        this.rol=rol;
    }

    //getters and setters 
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    //Metodo que sobrescribe el de mostrar informacion que creamos en clase persona  
    @Override
    public String mostrarInformacion() {
        return "ID" + getId()
                + "Nombre" + getNombre()
                + "Usuario" + getUsuario()
                + "Roll" + getRol();
        
    }

   
    
    
    
    
    
    
    
}
