package factory.estrategy.strategies;

public class PagoEfectivo implements Pago {

    @Override
    public double pagar(double monto) {
        System.out.println("Pagando con efectivo no tienes comision");
        return monto;
    }
}
