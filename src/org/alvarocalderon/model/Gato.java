
package org.alvarocalderon.model;

public class Gato extends Animal {
    private double largoGarras;
    
    public void arrañazo(){
        System.out.println("El gato: " + super.getNombre()+" ha arañado");
    }
    
    //set get
    
    public double getLargoGarras(){
        return this.largoGarras;
    }
    public void setLargoGarras(double largoGarras){
        this.largoGarras = largoGarras;
    }
    
}
