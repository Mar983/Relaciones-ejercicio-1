
package relac1;

import relac1.Servicios.Servicios;
import relac1.atributos.Persona;

public class Relac1 {

    public static void main(String[] args) {
        Persona a = new Persona();
        Servicios x = new Servicios();
        //Ingresamos los dos perros
        for (int i = 0; i < 2; i++) {
            x.crearPerro();
        }
        //Ingresamos las dos personas
        for (int i = 0; i < 2; i++) {
            x.crearPersona();
        }
        for (Persona arg : x.gente) {
            System.out.println(arg);
        }
    }   
}
