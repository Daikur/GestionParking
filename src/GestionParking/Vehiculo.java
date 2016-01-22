package GestionParking;

public abstract class Vehiculo {

    protected String matricula;
    protected String modelo;
    protected String color;
    protected String nifpropietario;
    protected String telefono;

    public Vehiculo(String nifpropietario, String matricula) {
        this.matricula = matricula;
        this.nifpropietario = nifpropietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNifpropietario() {
        return nifpropietario;
    }

    public void setNifpropietario(String nifpropietario) {
        this.nifpropietario = nifpropietario;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean setTelefono(String telefono) {
        boolean valido = false;
        if (telefono.length() == 9) {
            valido = true;
            this.telefono = telefono;
        }
        return valido;
    }

    @Override
    public String toString() {
        return matricula + " " + modelo + " " + color;
    }
}
