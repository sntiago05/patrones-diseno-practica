package factory.estrategy.factory;

import factory.estrategy.strategies.Pago;
import factory.estrategy.strategies.PagoCripto;
import factory.estrategy.strategies.PagoEfectivo;
import factory.estrategy.strategies.PagoTarjeta;

public class Pagofactory {
    private Pagofactory() {
    }

    public static Pago crearMetodoPago(TipoPago tipo) {
        switch (tipo) {
            case CRIPTO -> {
                return new PagoCripto();
            }
            case TARJETA -> {
                return new PagoTarjeta();
            }
            case EFECTIVO -> {
                return new PagoEfectivo();
            }
            case null, default -> {
                return null;
            }
        }

    }
}
