package GestionParking;

public class Main {

    public static void main(String[] args) {
        
        Coche c1 = new Coche("123123", "A123123", "largo");
        c1.setModelo("Ford Fiesta");
        c1.setColor("Azul");
        Moto m1 = new Moto("1231", "MICASA", 3);
        Coche c2 = new Coche("31412", "CASA", "hola");
        System.out.println(m1.getNumruedas());
        System.out.println(c2.getTipo());
        System.out.println(c2.setTipo("Corto"));
        System.out.println(c2.getTipo());

        Parking pk1 = new Parking("MCDonald");
        Plaza p1 = new Plaza(1, 1);
        Plaza p2 = new Plaza(1, 2);
        Plaza p3 = new Plaza(1, 3);
        Plaza p4 = new Plaza(1, 4);
        Plaza p5 = new Plaza(2, 1);
        Plaza p6 = new Plaza(2, 2);
        Plaza p7 = new Plaza(2, 3);
        Plaza p8 = new Plaza(2, 4);
        
//        pk1.setAlquiler((String) p1.getSotano()+ (String) p1.getNumplaza(), p1);
        
        
        p2.setVehiculo(c2);
        System.out.println(c1.toString());
        System.out.println(p2.getVehiculo());
        System.out.println(p2.toString());

    }
}
