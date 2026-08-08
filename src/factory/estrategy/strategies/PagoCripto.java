package factory.estrategy.strategies;

public class PagoCripto implements Pago {
    @Override
    public double pagar(double monto) {

        System.out.println("..Pagando por cripto tu comision es de 5%s");
        return monto * 0.05 +monto;
    }
}
