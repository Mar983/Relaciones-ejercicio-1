
package relac1.Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relac1.atributos.Perro;
import relac1.atributos.Persona;

public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList <Persona> gente = new ArrayList<>();
    ArrayList <Perro> mascotasAdoptadas = new ArrayList();
    
    public void crearPerro(Perro x){
        System.out.println("Nombre, raza, edad, tamanio:");
        String nombre= leer.next();
        String raza = leer.next();
        int edad= leer.nextInt();
        String tamanio = leer.next();
        x.pichus.add(new Perro(nombre,raza,edad,tamanio));
    }
    
    public void crearPersona(Perro b){
        System.out.println("Nombre, Apellido, Edad y DNI:");
        String nombre = leer.next();
        String apellido = leer.next();
        int edad = leer.nextInt();
        int dni = leer.nextInt();
        //cuando cargamos los datos de la persona, directamente se le pedira elegir un pichu
        gente.add(new Persona(nombre,apellido,edad,dni,asignarPerro(b))); 
    }

    public Perro asignarPerro(Perro b){
        System.out.println("");
        System.out.println("Mascotas disponibles:");
        for (Perro can : b.getPichus()) {
            System.out.println("Mascota: "+can.toString());
        }
        System.out.println("");
        System.out.println("Elija la mascota para esta persona: (ingrese el nombre de la mascota)");
        String respuesta = leer.next();
        String error = "";
        for (Perro aux : b.pichus) {
            if (respuesta.equals(aux.getNombre())){              
                b.pichus.remove(aux);
                return aux;
            } else {
                error = ("No esta disponible esa mascota");
            }              
        }
        System.out.println(error);
        return null;
    }
}
