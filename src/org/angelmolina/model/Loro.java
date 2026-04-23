 package org.angelmolina.model;


public class Loro extends Animal{
  private double hablando;
    
    public void repetir(){
        System.out.println("El loro: " + super.getNombre()+" esta repitiendo su nombre");
    }
    
    //set get
    
    public double getHablando(){
        return this.hablando;
    }
    public void setHablando(double hablando){
        this.hablando = hablando;
    }
    
}