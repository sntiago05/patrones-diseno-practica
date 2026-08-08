package template.observer;

import template.observer.method.CheckOut;
import template.observer.observers.Analytics;
import template.observer.observers.Auditoria;
import template.observer.observers.Email;

import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {
        CheckOut ck = new CheckOut(List.of(new Email(),new Auditoria(),new Analytics()));

        ck.checkOut(200);
    }
}
