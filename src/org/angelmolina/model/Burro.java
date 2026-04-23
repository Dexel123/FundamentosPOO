/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.angelmolina.model;

/**
 *
 * @author Usuario
 */
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
