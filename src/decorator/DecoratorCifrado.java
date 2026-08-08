package decorator;

public class DecoratorCifrado implements Notificador{

    private Notificador wrap;

    public DecoratorCifrado(Notificador wrap) {
        this.wrap = wrap;
    }

    @Override
    public void enviar(String mensaje) {
        wrap.enviar(mensaje);
        System.out.println("Cifrando mensaje....");
    }
}
