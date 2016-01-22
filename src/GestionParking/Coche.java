package GestionParking;

public class Coche extends Vehiculo {

    private String tipo;

    public Coche(String nifpropietario, String matricula, String tipo) {
        super(matricula, nifpropietario);
        if (tipo.equalsIgnoreCase("Largo") || tipo.equalsIgnoreCase("Corto")) {
            this.tipo = tipo;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        boolean valido = false;
        if (tipo.equalsIgnoreCase("Largo") || tipo.equalsIgnoreCase("Corto")) {
            valido = true;
            this.tipo = tipo;
        }
        return valido;
    }
}
