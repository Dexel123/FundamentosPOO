 package org.angelmolina.model;


public class Pollo extends Animal{
  private double sonido;
    
    public void piar(){
        System.out.println("El pollo: " + super.getNombre()+" dice pio pio");
    }
    
    //set get
    
    public double getSonido(){
        return this.sonido;
    }
    public void setSonido(double sonido){
        this.sonido = sonido;
    }
    
}
