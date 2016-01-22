package GestionParking;


public class Main {

    public static void main(String[] args) {
        Coche c1 = new Coche("123123", "A123123", "largo" );
        c1.setModelo("Ford Fiesta");
        c1.setColor("Azul");
        Moto c2 = new Moto("1231", "MICASA", 3 );
        Coche c3 = new Coche("31412", "CASA", "hola" );
        System.out.println(c2.getNumruedas());
        System.out.println(c3.getTipo());
        System.out.println(c3.setTipo("Largo"));
        
        Plaza p1 = new Plaza (1, "Primero");
        Plaza p2 = new Plaza (2, "Primero");
        Plaza p3 = new Plaza (3, "Primero");
        Plaza p4 = new Plaza (1, "Segundo");
        Plaza p5 = new Plaza (2, "Segundo");
        Plaza p6 = new Plaza (3, "Segundo");
        
        p4.setVehiculo(c1);
        System.out.println(p4.toString());
    }
    
}
