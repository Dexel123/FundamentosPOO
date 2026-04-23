 package org.angelmolina.model;


public class Vaca extends Animal{
  private double fuerzaSonido;
    
    public void mugido(){
        System.out.println("La vaca: " + super.getNombre()+" ha mugido");
    }
    
    //set get
    
    public double getFuerzaSonido(){
        return this.fuerzaSonido;
    }
    public void setFuerzaSonido(double fuerzaSonido){
        this.fuerzaSonido =fuerzaSonido;
    }
    
}
