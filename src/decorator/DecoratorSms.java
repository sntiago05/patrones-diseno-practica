package decorator;

public class DecoratorSms implements Notificador {
    Notificador wrap;

    public DecoratorSms(Notificador wrap) {
        this.wrap = wrap;
    }

    @Override
    public void enviar(String mensaje) {
        wrap.enviar(mensaje);
        System.out.println("Enviando de sms");
    }
}
