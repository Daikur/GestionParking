package GestionParking;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                System.out.println("<         3. Beneficios           >");
                System.out.println("<           4 Submenu             >");
                System.out.println("<            5 Cierre             >");
                System.out.println("<--*--*--*--*--*-*-*--*--*--*--*-->");

                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }                              //

                        boolean correcto = false;

                        do {
                            Scanner sc1 = new Scanner(System.in);

                            System.out.print("Tipo de vehiculo: ");
                            String tipoVehiculo = sc1.nextLine();
                            if (tipoVehiculo.equalsIgnoreCase("Coche") || tipoVehiculo.equalsIgnoreCase("C")) {
                                correcto = true;
                                tipoVehiculo = "C";
                                char charCoche = tipoVehiculo.charAt(0);
                                if (pk1.listarPlazas("Libres", charCoche).isEmpty() == true) {
                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //
                                    System.out.println("No quedan plazas disponibles para Coches, Parking Completo.");
                                    System.out.println("");
                                } else {

                                    boolean comprobacion2 = false;
                                    String nif;
                                    do {
                                        System.out.print("Numero NIF: ");
                                        nif = sc1.nextLine();
                                        Pattern dniPattern = Pattern.compile("(\\d{8})([TRWAGMYFPDXBNJZSQVHLCKE])");
                                        Matcher m = dniPattern.matcher(nif);
                                        if (m.matches()) {
                                            comprobacion2 = true;
                                        }
                                    } while (comprobacion2 == false);

                                    boolean comprobacion3 = false;
                                    String matricula;
                                    do {
                                        System.out.print("Matricula del Coche: ");
                                        matricula = sc1.nextLine();
                                        Pattern matriculaPattern = Pattern.compile("(\\d{4})([TRWAGMYFPDXBNJZSQVHLCKE]{3})");
                                        Matcher m = matriculaPattern.matcher(matricula);
                                        if (m.matches()) {
                                            comprobacion3 = true;
                                        }
                                    } while (comprobacion3 == false);

                                    String tipoCoche = null;
                                    boolean comprobacion = false;
                                    do {
                                        System.out.print("Tipo de Coche: ");
                                        tipoCoche = sc1.nextLine();
                                        if (tipoCoche.equalsIgnoreCase("Largo") || tipoCoche.equalsIgnoreCase("Corto")) {
                                            comprobacion = true;
                                        }
                                    } while (comprobacion == false);

                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //

                                    System.out.print("Al coche se le ha asignado la siguiente plaza: ");
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
                                    }                              //
                                    System.out.println("No quedan plazas disponibles para Motos, Parking Completo.");
                                    System.out.println("");
                                } else {

                                    String nif;
                                    boolean comprobacion = false;
                                    do {
                                        System.out.print("Numero NIF: ");
                                        nif = sc1.nextLine();
                                        Pattern dniPattern = Pattern.compile("(\\d{8})([TRWAGMYFPDXBNJZSQVHLCKE])");
                                        Matcher m = dniPattern.matcher(nif);
                                        if (m.matches()) {
                                            comprobacion = true;
                                        }
                                    } while (comprobacion == false);

                                    boolean comprobacion2 = false;
                                    String matricula;
                                    do {
                                        System.out.print("Matricula de la Moto: ");
                                        matricula = sc1.nextLine();
                                        Pattern matriculaPattern = Pattern.compile("(\\d{4})([TRWAGMYFPDXBNJZSQVHLCKE]{3})");
                                        Matcher m = matriculaPattern.matcher(matricula);
                                        if (m.matches()) {
                                            comprobacion2 = true;
                                        }
                                    } while (comprobacion2 == false);

                                    System.out.print("Numero de Ruedas: ");
                                    int numeroRuedas = sc1.nextInt();

                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //

                                    System.out.print("A la Moto se le ha asignado la siguiente plaza: ");
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
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }                              //
                        Scanner sc1 = new Scanner(System.in);
                        int darbaja;
                        System.out.println("Plaza para dar de baja: ");
                        darbaja = sc1.nextInt();
                        if (pk1.darBaja(darbaja) == 0) {
                            for (int i = 0; i < 50; ++i) { //
                                System.out.println();      //Limpiado de pantalla
                            }                              //
                            System.out.println("Se ha dado de baja la plaza correctamente");
                            System.out.println("");
                        } else if (pk1.darBaja(darbaja) == 2) {
                            for (int i = 0; i < 50; ++i) { //
                                System.out.println();      //Limpiado de pantalla
                            }                              //
                            System.out.println("Dicha plaza esta libre y no se puede dar de baja.");
                            System.out.println("");
                        } else {
                            for (int i = 0; i < 50; ++i) { //
                                System.out.println();      //Limpiado de pantalla
                            }                              //
                            System.out.println("Dicha plaza no existe.");
                            System.out.println("");
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }                              //
                        System.out.println("!-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-!");
                        System.out.print("!-*-  Ganancias actuales: ");
                        System.out.printf("%-7s", pk1.ganancias() + "€");
                        System.out.println("-*-!");
                        System.out.println("!-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-!");
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 4:
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }                              //

                        Scanner sc2 = new Scanner(System.in);
                        int menu2;
                        do {
                            System.out.println("<--------------------------------->");
                            System.out.println("<-----------! Reforma !----------->");
                            System.out.println("<--------------------------------->");
                            System.out.println("<        1. Añadir plaza          >");
                            System.out.println("<        2. Excluir Plaza         >");
                            System.out.println("<        3. Volver al Menu        >");
                            System.out.println("<--*--*--*--*--*-*-*--*--*--*--*-->");

                            menu2 = sc2.nextInt();

                            switch (menu2) {
                                case 1:
                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //

                                    Scanner sc3 = new Scanner(System.in);
                                    Scanner sc4 = new Scanner(System.in);
                                    int numsotano,
                                     numplaza;
                                    String tipoVehiculo;
                                    System.out.println(" Que plaza desea añadir ");
                                    System.out.println("------------------------");
                                    System.out.print("Numero de Sotano: ");
                                    numsotano = sc3.nextInt();
                                    System.out.print("Numero de Plaza: ");
                                    numplaza = sc3.nextInt();
                                    Plaza p = new Plaza(numsotano, numplaza);
                                    pk1.plazas.put(p.snn(), p);
                                    boolean comprobacion = false;
                                    do {
                                        System.out.print("Tipo de vehiculo Coche(C) o Moto(M): ");
                                        tipoVehiculo = sc4.nextLine();
                                        if (tipoVehiculo.equalsIgnoreCase("Coche") || tipoVehiculo.equalsIgnoreCase("C")) {
                                            p.setTipo('C');
                                            comprobacion = true;
                                        } else if (tipoVehiculo.equalsIgnoreCase("Moto") || tipoVehiculo.equalsIgnoreCase("M")) {
                                            p.setTipo('M');
                                            comprobacion = true;
                                        } else {
                                            System.out.println("Este tipo de vehiculo no es admitido");
                                        }
                                    } while (comprobacion == false);
                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //

                                    System.out.println("Plaza añadida correctamente.");
                                    System.out.println("");
                                    break;
                                case 2:
                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //

                                    Scanner sc5 = new Scanner(System.in);
                                    String plaza;
                                    System.out.println(" Que plaza desea excluir");
                                    System.out.println("------------------------");
                                    System.out.print("Identificacion de plaza:");
                                    plaza = sc5.nextLine();
                                    pk1.plazas.remove(plaza);

                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //

                                    System.out.println("Plaza excluida correctamente.");
                                    System.out.println("");
                                    break;
                                case 3:
                                    break;
                                default:
                                    for (int i = 0; i < 50; ++i) { //
                                        System.out.println();      //Limpiado de pantalla
                                    }                              //
                            }
                        } while (menu2 != 3);
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }                              //
                        break;
                    case 5:
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }
                        
                        LocalDate hoy = LocalDate.now();
                        String respuesta_C = "";
                        String respuesta_M = "";
                        int totalCoche = 0;
                        int totalMoto = 0;
                        List<Plaza> auxiliarCoche;
                        List<Plaza> auxiliarMoto;
                        auxiliarCoche = pk1.listarPlazas("Libres", 'C');
                        auxiliarMoto = pk1.listarPlazas("Libres", 'M');
                        for (Plaza plaza : auxiliarCoche) {
                            respuesta_C += "\t" + "Nº Plaza: " + plaza.getNumplaza() + " Sótano: " + plaza.getSotano() + "\n";
                            totalCoche++;
                        }
                        for (Plaza plaza : auxiliarMoto) {
                            respuesta_M += "\t" + "Nº Plaza: " + plaza.getNumplaza() + " Sótano: " + plaza.getSotano() + "\n";
                            totalMoto++;
                        }
                        int total = totalCoche + totalMoto;
                        System.out.println("Listado de plazas libres de Coche a fecha " + hoy.toString());
                        System.out.println(respuesta_C);
                        System.out.println("Listado de plazas libres de Moto a fecha " + hoy.toString());
                        System.out.println(respuesta_M);
                        System.out.println("Total: " + total);
                        break;
                    default:
                        for (int i = 0; i < 50; ++i) { //
                            System.out.println();      //Limpiado de pantalla
                        }                              //
                }

            } while (menu != 5);

        } catch (Exception e) {
            System.out.println("Ha saltado la siguiente excepción: " + e);
        }
    }
}
