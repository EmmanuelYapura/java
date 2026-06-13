import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Hashmap estructura de clave, valor, las claves no se pueden repetir pero los valores si
        // ventaja: buscar un valor a traves de su clave es casi instantaneo
        // desventaja: no mantiene ningun orden en las claves. Permite una clave null
        // ejemplo de uso: un diccionario de traduccion (clave:dog, valor:perro) o buscar los datos de un usuario usando su ID como clave.

        HashMap<String, Integer> frutas = new HashMap<String, Integer>();

        // agregar
        frutas.put("manzana", 5);
        frutas.put("pera", 5);
        frutas.put("banana", 5);

        // mostrar hashmap
        System.out.println("frutas = " + frutas);

        // eliminar elemento
        frutas.remove("manzana");

        System.out.println("frutas = " + frutas);
    }
}
