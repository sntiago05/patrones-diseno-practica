package decorator;

public class Ejemplo {
    public static void main(String[] args) {
        Notificador n = new DecoratorSms(new DecoratorEmail(new DecoratorReintentos(new DecoratorCifrado(new DecoradorBase()))));

        n.enviar("h");
    }
}
