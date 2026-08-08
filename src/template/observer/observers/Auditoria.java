package template.observer.observers;

public class Auditoria implements Observador {
    @Override
    public void actualizar(String evento) {
        System.out.println("Notificando de auditoria que: " + evento);
    }
}
