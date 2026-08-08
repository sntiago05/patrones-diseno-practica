package decorator;

public class DecoradorBase implements Notificador{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}
