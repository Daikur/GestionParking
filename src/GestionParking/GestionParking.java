package GestionParking;

import java.util.Scanner;

public class GestionParking {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int menu;
            do {

                //Menú
                System.out.println("<--------------------------------->");
                System.out.println("<-------! Gestion Parking !------->");
                System.out.println("<--------------------------------->");
                System.out.println("<      1. Alguiler de Plaza       >");
                System.out.println("<      2. Dar de Baja Plaza       >");
                System.out.println("<        3. Dinero ganado         >");
                System.out.println("<            4 Ciere              >");
                System.out.println("<--*--*--*--*--*-*-*--*--*--*--*-->");

                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:

                }
            } while (menu != 4);

        } catch (Exception e) {
            System.out.println("Ha saltado la siguiente excepción" + e);
        }
    }
}
