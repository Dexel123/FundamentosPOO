package org.alvarocalderon.system;
import org.alvarocalderon.model.Perro;
/**
 *
 * @author Alvaro Calderon
 */
public class Principal {
    //main
    public static void main(String[] args) {
        //sout
        System.out.println("HOla mundo estoy en Kinal");
        Perro perro1 = new Perro();
        perro1.setNombre("Chuleta");
        System.out.println("El nombre del perro: " + perro1.getNombre());
        
        perro1.traerPelota();
    }
}
