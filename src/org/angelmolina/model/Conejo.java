 package org.angelmolina.model;


public class Conejo extends Animal{
  private double alturaSalto;
    
    public void salto(){
        System.out.println("El conejo: " + super.getNombre()+" esta saltando por el campo");
    }
    
    //set get
    
    public double getAlturaSalto(){
        return this.alturaSalto;
    }
    public void setAlturaSalto(double alturaSalto){
        this.alturaSalto = alturaSalto;
    }
    
}
