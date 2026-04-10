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
        System.out.println("id: " + this.id + ", direccion: " + this.direccion + ", anclaje: " + this.anclajes.length);
    }

    public int anclajesLibres() {
        int libres = anclajes.length;
        for (Bicicleta b: anclajes) {
            if (b != null) libres--;
        }
        return libres;
    }

}
