package org.angelmolina.system;
import org.angelmolina.model.Burro;
import org.angelmolina.model.Cerdo;
import org.angelmolina.model.Conejo;
import org.angelmolina.model.Gallo;
import org.angelmolina.model.Gato;
import org.angelmolina.model.Pato;
import org.angelmolina.model.Perro;
import org.angelmolina.model.Vaca;


/**
 *
 * @author Angel Molina
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
        
        System.out.println("");
        
        System.out.println("----------------GATO-----------------");
        //dato del gato
        Gato gato1 = new Gato();
        gato1.setNombre("Minino");
        gato1.arrañazo();
        
        
        System.out.println("");
        
        
        System.out.println("----------------GALLO-----------------");
        //dato del gallo
        Gallo gallo1 = new Gallo();
        gallo1.setNombre("Claudio");
        gallo1.cacareo();
        
        System.out.println("");
        
        
        System.out.println("----------------BURRO-----------------");
        //dato del burro
        Burro burro1 = new Burro();
        burro1.setNombre("Eugenio");
        burro1.patada();
        
        System.out.println("");
        
        
        System.out.println("----------------VACA-----------------");
        //dato de la vaca
        Vaca vaca1 = new Vaca();
        vaca1.setNombre("Lola");
        vaca1.mugido();
        
        System.out.println("");
        
        
        System.out.println("----------------CERDO-----------------");
        //dato del cerdo
        Cerdo cerdo1 = new Cerdo();
        cerdo1.setNombre("Beacon");
        cerdo1.revolcarse();
        
        
        System.out.println("");
        
        System.out.println("----------------CONEJO-----------------");
        //dato del conejo
        Conejo conejo1 = new Conejo();
        conejo1.setNombre("Bugs");
        conejo1.salto();
        
         System.out.println("");
        
        System.out.println("----------------PATO-----------------");
        //dato del pato
        Pato pato1 = new Pato();
        pato1.setNombre("Lucas");
        pato1.nado();
        
    }
}
