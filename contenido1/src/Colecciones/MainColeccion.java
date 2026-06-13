package Colecciones;

import java.util.*;

public class MainColeccion {
    public static void main(String[] args) {
        // array list. Lectura rapida, uso general
        List<String> nombres = new ArrayList<>();

        // agregar
        nombres.add("Juan");

        // buscar
        nombres.get(0);

        // LinkedList, nodo -> nodo -> nodo
        // inserciones frecuentes, tienen busquedas lentas

        // HashSet no permite duplicados. Ideal para validaciones, tags, permisos
        Set<String> tecnologias = new HashSet<>();

        // HashMap clave->valor, muy usado en caches, configuraciones, busquedas rapidas.
        Map<Long, String> usuarios = new HashMap<>();

        usuarios.put(1L, "Emmanuel");
        usuarios.get(1L);

    }
}
