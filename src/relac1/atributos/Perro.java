
package relac1.atributos;

import java.util.ArrayList;

public class Perro {
    public String nombre;
    public String raza;
    public Integer edad;
    public String tamanio;
    public ArrayList <Perro> pichus = new ArrayList<>();

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    public ArrayList<Perro> getPichus() {
        return pichus;
    }

    public void setPichus(ArrayList<Perro> pichus) {
        this.pichus = pichus;
    }

    @Override
    public String toString() {
        return (nombre + ", raza: " + raza + ", edad: " + edad + ", tamanio: " + tamanio);
    }
    
    
}
