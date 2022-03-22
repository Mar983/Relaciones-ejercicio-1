
package relac1.atributos;

public class Persona {
    public String nombrePersona;
    public String apellidoPersona;
    public Integer edad;
    public Integer DNI;
    public Perro mascota;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellidoPersona, Integer edad, Integer DNI, Perro mascota) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edad = edad;
        this.DNI = DNI;
        this.mascota = mascota;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona: " + nombrePersona + " y su mascota: " + mascota;
    }   
}
