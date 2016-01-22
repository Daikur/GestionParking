package GestionParking;

public class Plaza {

    private int numplaza;
    private int sotano;
    private char tipo;
    private Vehiculo vehiculo;
 

    public Plaza(int numplaza, int sotano) {
        this.numplaza = numplaza;
        this.sotano = sotano;
        //this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }    

    public int getNumplaza() {
        return numplaza;
    }

    public void setNumplaza(int numplaza) {
        this.numplaza = numplaza;
    }

    public int getSotano() {
        return sotano;
    }

    public void setSotano(int sotano) {
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
                if (c.getTipo().equalsIgnoreCase("Largo") && sotano == 2) {
                    preciofinal = 60;
                } else if (c.getTipo().equalsIgnoreCase("Corto") && sotano == 2) {
                    preciofinal = 45;
                } else if (c.getTipo().equalsIgnoreCase("Largo")) {
                    preciofinal = 55;
                } else if (c.getTipo().equalsIgnoreCase("Corto")) {
                    preciofinal = 40;
                }
            } else if (vehiculo instanceof Moto) {
                Moto m = (Moto) vehiculo;
                if (sotano == 2) {
                    preciofinal = 30;
                } else {
                    preciofinal = 25;
                }
            }
        }
        return preciofinal;
    }

    @Override
    public String toString() {
        return "NºPlaza: " + numplaza + " Sótano: " + sotano + " Vehículo: " + vehiculo.toString() + " Precio: " + precio();
    }

}
