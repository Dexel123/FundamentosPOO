 package org.angelmolina.model;


public class Pato extends Animal{
  private double nadar;
    
    public void nado(){
        System.out.println("El pato: " + super.getNombre()+" esta nadando en el lago");
    }
    
    //set get
    
    public double getNadar(){
        return this.nadar;
    }
    public void setNadar(double nadar){
        this.nadar = nadar;
    }
    
}