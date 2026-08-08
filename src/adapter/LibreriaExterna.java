package adapter;

public class LibreriaExterna {

    public LibreriaExterna() {
    }
    public  String consumir(String consume){
            if (consume.equals("timeout"))throw new RuntimeException("TimeOut");
            if (consume.equals("error"))throw new RuntimeException("error");
            return "ok";
    }
}
