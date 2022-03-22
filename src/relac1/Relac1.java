
package relac1;

import java.util.Scanner;
import relac1.Servicios.Servicios;
import relac1.atributos.Perro;
import relac1.atributos.Persona;

public class Relac1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona a = new Persona();
        Perro b = new Perro();
        Servicios x = new Servicios();
     
        System.out.println("Cuantas mascotas desea ingresar?:");
        int mascotas = leer.nextInt();
        for (int i = 0; i < mascotas; i++) {
            x.crearPerro(b);
        }
        System.out.println("");
        System.out.println("--------MASCOTAS--------");
        for (Perro can : b.getPichus()) {
            System.out.println("Mascota: "+can.toString());
        }  
        System.out.println("");
        System.out.println("Cuantas personas desea ingresar?:");
        int personas = leer.nextInt();
        for (int i = 0; i < personas; i++) {
            x.crearPersona(b);
            System.out.println("");
        }      
        System.out.println("-----LISTA DE PERSONAS CON SUS RESPECTIVAS MASCOTAS-----");
        for (Persona arg : x.gente) {
            System.out.println(arg);
        }
    }   
}
