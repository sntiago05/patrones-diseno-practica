package template.observer.observers;

public class Analytics implements Observador {
    @Override
    public void actualizar(String evento) {
        System.out.println("Notificando desde anlaitycs que: " + evento);
    }
}
