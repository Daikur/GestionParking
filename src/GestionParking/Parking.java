package GestionParking;

import java.util.HashMap;
import java.util.Iterator;
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
        plazas.put("11", p1);
        plazas.put("12", p2);
        plazas.put("13", p3);
        plazas.put("14", p4);
        plazas.put("21", p5);
        plazas.put("22", p6);
        plazas.put("23", p7);
        plazas.put("24", p8);
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

//    public String alquilar(Vehiculo vehiculo) {
//
//        do {
//            Iterator<String> it = plazas.keySet().iterator();
//            while(it.hasNext()) {
//                String ssn = it.next();
//                
//            }
//            
//        } while (plazas.get(Plaza) != null);
//    }
}
