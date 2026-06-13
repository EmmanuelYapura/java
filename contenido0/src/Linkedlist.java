import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        // LinkedList, lista doblemente enlazada
        // cada nodo conoce su elemento anterior y siguiente
        // Ventaja: insertar o eliminar un nodo es rapido ya que solo cambian los enlaces de los nodos
        // Desventaja: buscar un elemento por su indice es lento porque java debe recorrer la lista hasta encontrar el elemento, consume mas memoria por los enlaces.
        // ejemplo de uso: implementar una fila de procesos pendientes (Cola/Queue) donde constantemente añades al final y eliminas al principio.
        LinkedList<String> nombres = new LinkedList<>();

        // agregar
        nombres.add("Manu");
        nombres.add("Juan");
        nombres.add("Leo");
        nombres.add("Teo");

        // eliminar
        nombres.remove("Leo");

        // Iterar sobre la lista
        for(String nombre: nombres){
            System.out.println(nombre);
        }
    }
}
