package edu.teamrocket.bicipalma.estacion;

import edu.teamrocket.bicipalma.bicicleta.Bicicleta;
import edu.teamrocket.bicipalma.tarjetaUsuario.TarjetaUsuario;

public class Estacion {

    private int id;
    private String direccion;
    private Bicicleta[] anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Bicicleta[numAnclajes];
    }

    public void consultarEstacion() {
        System.out.println("id: " + id);
        System.out.println("direccion: " + direccion);
        System.out.println("numeroAnclajes: " + anclajes.length);
    }

    public int anclajesLibres() {
        int libres = 0;
        for (Bicicleta b : anclajes) {
            if (b == null) libres++;
        }
        return libres;
    }

    public void anclarBicicleta(Bicicleta bicicleta) {
        for (int i = 0; i < anclajes.length; i++) {
            if (anclajes[i] == null) {
                anclajes[i] = bicicleta;
                System.out.println("bicicleta " + bicicleta.getId() + " anclada en el anclaje " + (i + 1));
                break;
            }
        }
    }

    public void consultarAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            if (anclajes[i] != null) {
                System.out.println("Anclaje " + (i + 1) + " " + anclajes[i].getId());
            } else {
                System.out.println("Anclaje " + (i + 1) + " libre");
            }
        }
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjeta) {
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjeta) {
        if (!leerTarjetaUsuario(tarjeta)) {
            System.out.println("Tarjeta de usuario inactiva");
        } else {
            for (int i = 0; i < anclajes.length; i++) {
                if (anclajes[i] != null) {
                    System.out.println("bicicleta retirada: " + anclajes[i].getId() + " del anclaje: " + (i + 1));
                    anclajes[i] = null;
                    break;
                }
            }
        }
    }
}