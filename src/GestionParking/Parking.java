package GestionParking;

import java.util.HashMap;
import java.util.Map;

public class Parking {
    private String nombreparking;
    private String direccion;
    private Map<String, Plaza> alquiler = new HashMap<>();
    
    public Parking(String nombreparking) {
        this.nombreparking = nombreparking;
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

    public Map<String, Plaza> getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Map<String, Plaza> alquiler) {
        this.alquiler = alquiler;
    } 
}
