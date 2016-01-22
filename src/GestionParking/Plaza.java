package GestionParking;

public class Plaza {

    private int numplaza;
    private String sotano;
    private char tipo;
    private Vehiculo vehiculo;

    public Plaza(int numplaza, String sotano) {
        this.numplaza = numplaza;
        this.sotano = sotano;
        //this.vehiculo = vehiculo;
    }

    public int getNumplaza() {
        return numplaza;
    }

    public void setNumplaza(int numplaza) {
        this.numplaza = numplaza;
    }

    public String getSotano() {
        return sotano;
    }

    public void setSotano(String sotano) {
        this.sotano = sotano;
    }

    public char getTipo() {
        return tipo;
    }

    public boolean setTipo(char tipo) {
        boolean valido = false;
        if (tipo == 'C' || tipo == 'M') {
            valido = true;
            this.tipo = tipo;
        }
        return valido;
    }

    public int precio() {
        int preciofinal = 0;
        if (vehiculo != null) {
            if (vehiculo instanceof Coche) {
                Coche c = (Coche) vehiculo;
                if (c.getTipo().equals("Largo") && sotano.equalsIgnoreCase("Segundo")) {
                    preciofinal = 60;
                } else if (c.getTipo().equals("Corto") && sotano.equalsIgnoreCase("Segundo")) {
                    preciofinal = 45;
                } else if (c.getTipo().equals("Largo")) {
                    preciofinal = 55;
                } else if (c.getTipo().equals("Corto")) {
                    preciofinal = 40;
                }
            } else if (vehiculo instanceof Moto) {
                Moto m = (Moto) vehiculo;
                if (sotano.equalsIgnoreCase("Segundo")) {
                    preciofinal = 30;
                } else {
                    preciofinal = 25;
                }
            }
        }
        return preciofinal;
    }
}
