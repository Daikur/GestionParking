package GestionParking;

public class Moto extends Vehiculo {

    private int numruedas;

    public Moto(String nifpropietario, String matricula, int numruedas) {
        super(matricula, nifpropietario);
        this.numruedas = numruedas;
    }

    public int getNumruedas() {
        return numruedas;
    }

    public void setNumruedas(int numruedas) {
        this.numruedas = numruedas;
    }
}
