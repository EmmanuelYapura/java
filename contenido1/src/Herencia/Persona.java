package Herencia;

// En la clase persona vamos a ver la herencia
public class Persona {
    // atributos
    private String nombre;

    // constructor
    public  Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void saludar(){
        System.out.println("Hola: ");
    }
}
