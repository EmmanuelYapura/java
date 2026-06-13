import java.util.ArrayList;

public class Arraylist {
    //En este archivo se veran las colecciones basicas con sus respectivos usos
    public static void main(String[] args) {
        // ArrayList
        // Permiten duplicados y mantienen el orden de insercion
        // Ventaja: Acceso rapido a los elementos por sus indices. Ideal para leer datos constantemente
        // Desventaja: Si necesitas insetar o borrar elementos en medio de la lista es lento, ya que deben moverse todos los elementos un lugar.
        // Ejemplos de uso: Listar los productos de un carrito de compras o los usuarios activos de un chat

        ArrayList<String> colores = new ArrayList<>();
        // agregar colores
        colores.add("rojo");
        colores.add("blanco");
        colores.add("negro");

        System.out.println("colores = " + colores);

        // obtener un elemento
        String primerColor = colores.get(0);
        System.out.println("primerColor = " + primerColor);

        // reemplazar un valor en lugar concreto
        colores.set(1, "verde");
        System.out.println("colores = " + colores);

        // eliminar por indice o por valor
        colores.remove(0);
        colores.remove("negro");
        System.out.println("colores = " + colores);
        
        // obtener el total
        int cantidad = colores.size();
        System.out.println("cantidad = " + cantidad);

        // verificar si un elemento existe, devuelve true o false
        colores.add("gris");
        colores.add("azul");
        colores.add("naranja");
        if (colores.contains("azul")){
            System.out.println("El color existe en la lista");
        }

        colores.forEach(color -> System.out.println(color));

    }
}