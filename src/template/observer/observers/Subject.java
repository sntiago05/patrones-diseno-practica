package template.observer.observers;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observador> observadores = new ArrayList<>();

    public void subscribir(Observador o) {
        observadores.add(o);
    }

    public void subscribir(List<Observador> o) {
        observadores.addAll(o);
    }


    public void deSubscribir(Observador o) {
        observadores.remove(o);
    }

    public void actualizar(String evento) {
        this.observadores.forEach(o -> o.actualizar(evento));
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

}
