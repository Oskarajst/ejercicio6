/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class ProveedorLogistico extends Integracion implements Documentable, Auditable {
    public ProveedorLogistico(String id, String nombre, double latencia, boolean conectada,
                              String config) {
        super(id, nombre, latencia, conectada, config);
    }

    public String consultarEstado(String codigo) {
        return "Paquete " + codigo + " en transito con " + getNombre();
    }

    @Override
    public String generarDocumento(String referencia) {
        return "Guia de envio para " + referencia + " - " + getNombre();
    }

    
    @Override
    public void registrarEvento(String evento) {
        System.out.println("Auditoria " + getId() + ": " + evento);
    }
    
    
    
    
    
    
    
}