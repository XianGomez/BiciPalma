package edu.teamrocket.bicipalma.estacion;

import edu.teamrocket.bicipalma.bicicleta.Bicicleta;

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
}