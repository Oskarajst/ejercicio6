/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class Integracion implements Comparable<Integracion> {
    private final String id;
    private final String nombre;
    private final double latenciaMs;
    private final boolean conectada;
    private final String configuracion;

    
    protected Integracion(String id, String nombre, double latenciaMs, boolean conectada,String configuracion) {
        this.id = id;
        this.nombre = nombre;
        this.latenciaMs = latenciaMs;
        this.conectada = conectada;
        this.configuracion = configuracion;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getLatenciaMs() { return latenciaMs; }
    public boolean isConectada() { return conectada; }
    public String getConfiguracion() { return configuracion; }

    
    
    @Override
    public int compareTo(Integracion otra) {
        if (latenciaMs < otra.latenciaMs) {
            return -1;
            
        } else if (latenciaMs > otra.latenciaMs) {
            return 1;
            
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String estado = "Desconectada";
        if (conectada) {
            estado = "Conectada";
        }
        return id + " " + nombre + " " + estado + " " + latenciaMs  + " ms";
    } 

}