package Interfaces;

public class EmailNotificador implements Notificador{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Email: "+ mensaje);
    }
}
