//subclase, gereda de Persona
package com.mycompany.fidecompro;
public class Factura {
    
    //atributos
    private int idFactura;
    private Cliente cliente;
    private Usuario usuario;
    private String fecha;
    private double subtotal;
    private double impuesto;
    private double total;
    
    
    //constructor
    public Factura(int idFactura,Cliente cliente,Usuario usuario,String fecha,double subtotal,double impuesto,double total) {
        this.idFactura=idFactura;
        this.cliente=cliente;
        this.usuario=usuario;
        this.fecha=fecha;
        this.subtotal=subtotal;
        this.impuesto=impuesto;
        this.total=total;
    }

    //getteres and setters 
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
