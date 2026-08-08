package decorator;

public class DecoratorReintentos implements Notificador {
    Notificador wrap;

    public DecoratorReintentos(Notificador wrap) {
        this.wrap = wrap;
    }

    @Override
    public void enviar(String mensaje) {
        enviarConReintentos(mensaje, 1);
    }

    private void enviarConReintentos(String mensaje, int intentos) {
        try {
            if (intentos < 3) throw new RuntimeException("Error de envio");
            wrap.enviar(mensaje);
        } catch (RuntimeException e) {
            /*if (intentos >= 3) {
                throw e;
            }*/
            System.out.println("Reintentando enviar mensaje, intento n" + intentos);
            enviarConReintentos(mensaje, intentos + 1);
        }
    }
}
