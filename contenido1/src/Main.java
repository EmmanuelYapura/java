import Polimorfismo.Animal;
import Polimorfismo.Perro;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Emmanuel", "eyapura96@gmail.com");
        usuario.mostrarInformacion();

        Animal perro = new Perro();
        perro.hacerSonido();
    }
}