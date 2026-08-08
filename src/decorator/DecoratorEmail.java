package decorator;

public class DecoratorEmail implements Notificador {
    Notificador wrap;

    public DecoratorEmail(Notificador wrap) {
        this.wrap = wrap;
    }

    @Override
    public void enviar(String mensaje) {
        wrap.enviar(mensaje);
        System.out.println("enviando mensaje desde email: " + mensaje);
    }
}
