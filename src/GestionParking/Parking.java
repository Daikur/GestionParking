package GestionParking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Parking {

    private String nombreparking;
    private String direccion;
    private Map<String, Plaza> plazas = new HashMap<>();

    public Parking(String nombreparking) {
        this.nombreparking = nombreparking;
        Plaza p1 = new Plaza(1, 1);
        p1.setTipo('M');
        p1.setVehiculo(new Moto("1231", "C123512", 3));
        Plaza p2 = new Plaza(1, 2);
        p2.setTipo('M');
        Plaza p3 = new Plaza(1, 3);
        p3.setTipo('C');
        p3.setVehiculo(new Coche("123123", "A123123", "Largo"));
        p3.getVehiculo().setColor("Azul");
        p3.getVehiculo().setModelo("Seat Ibiza");
        Plaza p4 = new Plaza(1, 4);
        p4.setTipo('C');
        Plaza p5 = new Plaza(2, 1);
        p5.setTipo('C');
        p5.setVehiculo(new Coche("31412", "B12312", "Corto"));
        Plaza p6 = new Plaza(2, 2);
        p6.setTipo('C');
        Plaza p7 = new Plaza(2, 3);
        p7.setTipo('C');
        Plaza p8 = new Plaza(2, 4);
        p8.setTipo('M');
        p8.setVehiculo(new Moto("123514", "D123122", 2));
        plazas.put(p1.snn(), p1);
        plazas.put(p2.snn(), p2);
        plazas.put(p3.snn(), p3);
        plazas.put(p4.snn(), p4);
        plazas.put(p5.snn(), p5);
        plazas.put(p6.snn(), p6);
        plazas.put(p7.snn(), p7);
        plazas.put(p8.snn(), p8);
    }

    public String getNombreparking() {
        return nombreparking;
    }

    public void setNombreparking(String nombreparking) {
        this.nombreparking = nombreparking;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<String, Plaza> getPlazas() {
        return plazas;
    }

    public void setPlazas(Map<String, Plaza> plazas) {
        this.plazas = plazas;
    }

    public String alquilar(Vehiculo vehiculo) {
        boolean alquilada = false;
        Plaza aux;
        String resultado = null;

        Iterator<String> it = this.plazas.keySet().iterator();
        while (it.hasNext() && alquilada == false) {
            aux = this.plazas.get(it.next());
            String conversor = ("" + aux.getTipo());
            if (vehiculo instanceof Coche && conversor.equalsIgnoreCase("C") && aux.getVehiculo() == null) {
                aux.setVehiculo(vehiculo);
                alquilada = true;
                resultado = (aux.getSotano() + " " + aux.getNumplaza());
            } else if (vehiculo instanceof Moto && conversor.equalsIgnoreCase("M") && aux.getVehiculo() == null) {
                aux.setVehiculo(vehiculo);
                alquilada = true;
                resultado = (aux.getSotano() + " " + aux.getNumplaza());
            }
        }
        return resultado;
    }

    public int darBaja(int numPlaza) {
        boolean alquilada = false;
        Plaza plaza;
        int resultado = 1;
        String nPlaza = Integer.toString(numPlaza);

        Iterator<String> snn = this.plazas.keySet().iterator();
        while (snn.hasNext() && alquilada == false) {
            plaza = this.plazas.get(snn.next());
            if (plaza.snn().equals(nPlaza)) {
                alquilada = true;
                if (plaza.getVehiculo() != null) {
                    plaza.setVehiculo(null);
                    resultado = 0;
                } else if (plaza.getVehiculo() == null) {
                    resultado = 2;
                }

            }

        }
        return resultado;
    }

    public List<Plaza> listarPlazas(String estado, char tipoVehiculo) {
        Plaza plaza;
        List<Plaza> listaPlazas = new ArrayList<>();
        Iterator<String> it = plazas.keySet().iterator();
        while (it.hasNext()) {
            plaza = plazas.get(it.next());
            if (estado.equalsIgnoreCase("Libres") && plaza.getVehiculo() == null && plaza.getTipo() == tipoVehiculo) {
                listaPlazas.add(plaza);
            }
            if (estado.equalsIgnoreCase("Ocupadas") && plaza.getVehiculo() != null && tipoVehiculo == plaza.getTipo()) {
                listaPlazas.add(plaza);
            }
        }

        return listaPlazas;
    }

    public int ganancias() {
        int cantidadCoches = 0;
        int cantidadMotos = 0;
        for (Plaza listaP : listarPlazas("Ocupadas", 'C')) {
            cantidadCoches += listaP.precio();
        }
        for (Plaza listaP : listarPlazas("Ocupadas", 'M')) {
            cantidadMotos += listaP.precio();
        }

        return cantidadCoches + cantidadMotos;
    }
}
