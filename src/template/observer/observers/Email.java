package template.observer.observers;

public class Email implements Observador {
    @Override
    public void actualizar(String evento) {
        System.out.println("Notificando desde email que: " + evento);
    }
}
