import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        // HashSet No permiten elementos duplicados, ideal para asegurar unicidad
        // Ventajas: las operaciones de añadir, borrar y buscar si un elemento existe son extremedamente rapidas, tiempo constante.
        // Desventajas: no tienen orden
        // ejemplo de uso: almacenar los documentos de identidad de los empleados para asegurar que ninguno se repita

        Set<String> colores = new HashSet<>();

        // Agregar elementos
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        // Intentar agregar un duplicado
        colores.add("Rojo"); // No se agregará

        // Verificar si contiene un elemento
        System.out.println("¿Contiene Verde? " + colores.contains("Verde"));

        // Mostrar elementos
        System.out.println("Colores: " + colores);

        // eliminar
        colores.remove("Azul");

        System.out.println("Colores: " + colores);

    }
}
