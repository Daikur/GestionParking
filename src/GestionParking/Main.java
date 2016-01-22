package GestionParking;


public class Main {

    public static void main(String[] args) {
        Coche c1 = new Coche("123123", "A123123", "largo" );
        Moto c2 = new Moto("1231", "MICASA", 3 );
        Coche c3 = new Coche("31412", "CASA", "hola" );
        System.out.println(c2.getNumruedas());
        System.out.println(c3.getTipo());
        System.out.println(c3.setTipo("Largo"));
        
    }
    
}
