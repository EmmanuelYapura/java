package Errores;

public class Exceptions {
    public static void main(String[] args) {
        try{
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e){
            System.out.println("El error es: "+ e.getMessage());
        }
    }
}
