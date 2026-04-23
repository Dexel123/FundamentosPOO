 package org.angelmolina.model;


public class Caballo extends Animal{
  private double correr;
    
    public void galopar(){
        System.out.println("El caballo: " + super.getNombre()+" esta galopando por el campo");
    }
    
    //set get
    
    public double getCorrer(){
        return this.correr;
    }
    public void setCorrer(double correr){
        this.correr = correr;
    }
    
}
