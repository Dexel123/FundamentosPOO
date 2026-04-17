package org.alvarocalderon.model;


public class Perro extends Animal {
    private boolean entrenado;
    
    public void traerPelota(){
        System.out.println("El perro "+super.getNombre()+" Trae la pelota");
    }
    
    //get y set
    
    public boolean getEntrenado(){
        return this.entrenado;
    }
    public void setEntrenado(boolean entrenado){
        this.entrenado = entrenado;
    }
}
