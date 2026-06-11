package Herencia;

public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String puesto) {
        super(nombre);
        this.puesto = puesto;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + getNombre() + " y mi puesto es: " + puesto);
    }
}
