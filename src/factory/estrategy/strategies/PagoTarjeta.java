package factory.estrategy.strategies;

public class PagoTarjeta implements Pago {
    @Override
    public double pagar(double monto) {
        System.out.println("Pagando Con tarjeta tu comision es del 9%");
        return monto * 0.09 + monto;
    }
}
