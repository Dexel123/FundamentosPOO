
package org.alvarocalderon.model;

public class Gallo extends Animal {
    private double cantoMañana;
    
    public void cacareo(){
        System.out.println("El gallo: " + super.getNombre()+" ha cantado");
    }
    
    //set get
    
    public double getCantoMañana(){
        return this.cantoMañana;
    }
    public void setCantoMañana(double cantoMañana){
        this.cantoMañana = cantoMañana;
    }
    
}
