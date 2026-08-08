package adapter;

public class Adapter implements Consumer{

    private LibreriaExterna lb = new LibreriaExterna();

    @Override
    public boolean consumir(String a) {
        try {
            return  lb.consumir(a).equals("ok");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
