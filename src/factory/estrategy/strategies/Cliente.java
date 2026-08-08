package factory.estrategy.strategies;


public class Cliente {
    private String nombre;
    private Pago pago;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void pagar(double monto) {
        double pagado = pago.pagar(monto);
        System.out.println(this.nombre + ", total pagado:" + pagado);
    }
}
