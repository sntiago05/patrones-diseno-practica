package factory.estrategy;

import factory.estrategy.factory.Pagofactory;
import factory.estrategy.factory.TipoPago;
import factory.estrategy.strategies.Cliente;

public class Ejemplo {
    public static void main(String[] args) {
        Cliente santiago = new Cliente("santiago");
        santiago.setPago(Pagofactory.crearMetodoPago(TipoPago.CRIPTO));
        santiago.pagar(100);
    }
}
