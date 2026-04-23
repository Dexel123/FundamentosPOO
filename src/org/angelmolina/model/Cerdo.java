 package org.angelmolina.model;


public class Cerdo extends Animal{
  private double revolcarseLodo;
    
    public void revolcarse(){
        System.out.println("El cerdo: " + super.getNombre()+" se esta revolcando en el lodo");
    }
    
    //set get
    
    public double getRevolcarseLodo(){
        return this.revolcarseLodo;
    }
    public void setRevolcarseLodo(double revolcarseLodo){
        this.revolcarseLodo = revolcarseLodo;
    }
    
}