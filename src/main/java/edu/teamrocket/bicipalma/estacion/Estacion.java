package edu.teamrocket.bicipalma.estacion;

public class Estacion {
    
    private int id;
    private String direccion;
    private int numAnclajes;
     
    
    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numAnclajes= numAnclajes;

    }

    public void consultarEstacion() {
        System.out.println("id: " + this.id + ", direccion: " + this.direccion + ", anclaje: " + this.numAnclajes);
    }

    

}
