package template.observer.method;

import template.observer.observers.Observador;

import java.util.List;

public class CheckOut extends CheckOutABS {

    public CheckOut(List<Observador> obs) {
        super.subscribir(obs);
    }

    @Override
    protected void capturar(double monto) {
        System.out.println("Capturando monto" + monto);
    }

    @Override
    protected void validar(double monto) {
        System.out.println("Validando Monto: " + monto);
    }

    @Override
    public void notificar() {
        System.out.println("Notificando de checkout");
        super.actualizar("checkout completo");
    }
}
