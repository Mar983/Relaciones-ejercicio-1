
package relac1.Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relac1.atributos.Perro;
import relac1.atributos.Persona;

public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList <Persona> gente = new ArrayList<>();
    ArrayList <Perro> perro = new ArrayList<>();
    
    public void crearPersona(){
        System.out.println("Nombre, Apellido, Edad y DNI:");
        String nombre = leer.next();
        String apellido = leer.next();
        int edad = leer.nextInt();
        int dni = leer.nextInt();
        //cuando cargamos los datos de la persona, directamente se le pedira elegir un perro
        gente.add(new Persona(nombre,apellido,edad,dni,asignarPerro(nombre)));      
    }
    
    public void crearPerro(){
        System.out.println("Nombre, raza, edad, tamanio:");
        String nombre= leer.next();
        String raza = leer.next();
        int edad= leer.nextInt();
        String tamanio = leer.next();
        perro.add(new Perro(nombre,raza,edad,tamanio));
    }
    
    public Perro asignarPerro(String nombre){
        for (Perro perro2 : perro) {
            System.out.println(perro2.toString());
        }
        System.out.println("Para la persona " +nombre+" Ingrese el nombre del perro:");
        String respuesta = leer.next();
        for (Perro perro1 : perro) {
            if (respuesta.toLowerCase().equals(perro1.nombre)) {
                perro.remove(perro1);
                return perro1;             
            }
        } return null;
    } 
}
