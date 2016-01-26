package GestionParking;

import java.util.Scanner;

public class GestionParking {

    public static void main(String[] args) {

        Parking pk1 = new Parking("MCDonald");
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
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }

                        boolean correcto = false;

                        do {
                            Scanner sc1 = new Scanner(System.in);

                            System.out.println("Tipo de vehiculo: ");
                            String tipoVehiculo = sc1.nextLine();
                            if (tipoVehiculo.equalsIgnoreCase("Coche") || tipoVehiculo.equalsIgnoreCase("C")) {
                                correcto = true;
                                tipoVehiculo = "C";
                                char charCoche = tipoVehiculo.charAt(0);
                                if (pk1.listarPlazas("Libres", charCoche).isEmpty() == true) {
                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }
                                    System.out.println("No quedan plazas disponibles para Coches, Parking Completo.");
                                    System.out.println("");
                                } else {
                                    System.out.println("Numero NIF: ");
                                    String nif = sc1.nextLine();
                                    System.out.println("Matricula del vehiculo: ");
                                    String matricula = sc1.nextLine();

                                    System.out.println("Tipo de Coche: ");
                                    String tipoCoche = sc1.nextLine();
                                    boolean comprobacion = false;
                                    if (!tipoCoche.equalsIgnoreCase("Largo") || !tipoCoche.equalsIgnoreCase("Corto")) {
                                        do {
                                            System.out.println("Tipo de Coche: ");
                                            tipoCoche = sc1.nextLine();
                                            if (tipoCoche.equalsIgnoreCase("Largo") || tipoCoche.equalsIgnoreCase("Corto")) {
                                                comprobacion = true;
                                            }
                                        } while (comprobacion == false);
                                    }

                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }

                                    System.out.println("Al coche se le ha asignado la siguiente plaza: ");
                                    System.out.println(pk1.alquilar(new Coche(nif, matricula, tipoCoche)));
                                    System.out.println("");
                                }
                            } else if (tipoVehiculo.equalsIgnoreCase("Moto") || tipoVehiculo.equalsIgnoreCase("M")) {
                                correcto = true;
                                tipoVehiculo = "M";
                                char charMoto = tipoVehiculo.charAt(0);
                                if (pk1.listarPlazas("Libres", charMoto).isEmpty() == true) {
                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }
                                    System.out.println("No quedan plazas disponibles para Motos, Parking Completo.");
                                    System.out.println("");
                                } else {
                                    System.out.println("Numero NIF: ");
                                    String nif = sc1.nextLine();
                                    System.out.println("Matricula del vehiculo: ");
                                    String matricula = sc1.nextLine();
                                    System.out.println("Numero de Ruedas: ");
                                    int numeroRuedas = sc1.nextInt();

                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }

                                    System.out.println("A la Moto se le ha asignado la siguiente plaza: ");
                                    System.out.println(pk1.alquilar(new Moto(nif, matricula, numeroRuedas)));
                                    System.out.println("");
                                }
                            } else {
                                System.out.println("El tipo de vehiculo debe ser un Coche o una Moto");
                                System.out.println("");
                            }
                        } while (correcto == false);

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }

                }
            } while (menu != 4);

        } catch (Exception e) {
            System.out.println("Ha saltado la siguiente excepción" + e);
        }
    }
}
