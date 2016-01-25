package GestionParking;

import java.util.Scanner;

public class GestionParking {

    public static void main(String[] args) {

        Parking pk1 = new Parking("MCDonald");
        Coche c4 = new Coche("123123", "A123123", "Largo");
        Coche c5 = new Coche("123123", "A123123", "Largo");
        Coche c6 = new Coche("123123", "A123123", "Largo");
        Coche c7 = new Coche("123123", "A123123", "Largo");
        Coche c8 = new Coche("123123", "A123123", "Largo");
        Moto m4 = new Moto("1231", "C123512", 3);
        Moto m5 = new Moto("1231", "C123512", 3);
        Moto m6 = new Moto("1231", "C123512", 3);
        Moto m7 = new Moto("1231", "C123512", 3);
        System.out.println(pk1.alquilar(c4));
        System.out.println(pk1.alquilar(c5));
        System.out.println(pk1.alquilar(c6));
        System.out.println(pk1.alquilar(c7));
        System.out.println("");
        System.out.println(pk1.alquilar(m4));
        System.out.println(pk1.alquilar(m5));
        System.out.println(pk1.alquilar(m6));
        System.out.println(pk1.alquilar(m7));
        System.out.println(pk1.alquilar(c8));
//        try {
//            Scanner sc = new Scanner(System.in);
//            int menu;
//            do {
//
//                //Menú
//                System.out.println("<--------------------------------->");
//                System.out.println("<-------! Gestion Parking !------->");
//                System.out.println("<--------------------------------->");
//                System.out.println("<      1. Alguiler de Plaza       >");
//                System.out.println("<      2. Dar de Baja Plaza       >");
//                System.out.println("<        3. Dinero ganado         >");
//                System.out.println("<            4 Ciere              >");
//                System.out.println("<--*--*--*--*--*-*-*--*--*--*--*-->");
//
//                menu = sc.nextInt();
//                switch (menu) {
//                    case 1:
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    default:
//
//                }
//            } while (menu != 4);
//
//        } catch (Exception e) {
//            System.out.println("Ha saltado la siguiente excepción" + e);
//        }
    }
}
