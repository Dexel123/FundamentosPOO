 package org.angelmolina.model;


public class Burro extends Animal{
  private double fuerzPatada;
    
    public void patada(){
        System.out.println("El burro: " + super.getNombre()+" ha pateado");
    }
    
    //set get
    
    public double getFuerzPatada(){
        return this.fuerzPatada;
    }
    public void setFuerzPatada(double fuerzPatada){
        this.fuerzPatada = fuerzPatada;
    }
    
}
