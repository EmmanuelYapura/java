package Interfaces;

public class WhatsappNotificador implements Notificador{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Whatsapp: "+ mensaje);
    }
}
