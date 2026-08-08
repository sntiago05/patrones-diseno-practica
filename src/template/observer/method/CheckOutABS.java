package template.observer.method;

import template.observer.observers.Observador;
import template.observer.observers.Subject;

import java.util.ArrayList;
import java.util.List;

public abstract class CheckOutABS  extends Subject {
    public CheckOutABS() {

    }

    public final void checkOut(double monto){
            capturar(monto);
            validar(monto);
            notificar();
    }
    protected abstract void capturar(double monto);
    protected abstract void validar(double monto);
    public abstract void notificar();

}
