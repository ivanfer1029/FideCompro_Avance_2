//sibclase, hereda de persona 
package com.mycompany.fidecompro;
public class Cliente extends Persona {
    
    
    private String cedula;
    private String telefono;
    private String correo;
    private String direccion;
    
    
    
    
    //constructor 
    public Cliente(int id, String nombre,String cedula,String telefono,String correo,String direccion) {
        super(id, nombre);
        this.cedula=cedula;
        this.telefono=telefono;
        this.correo=correo;
        this.direccion=direccion;
    }

    //getter and setter
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodo que sobrescribe el de mostrar informacion que creamos en clase persona  
    @Override
    public String mostrarInformacion() {
        return "ID:" + getId()
                + "Nombre:" + getNombre()
                + "Cedula:" + getCedula()
                + "Telefono:" + getTelefono()
                + " Correo:" + getCorreo()
                + "Direccion" + getDireccion();
    }
    
    
    
}
