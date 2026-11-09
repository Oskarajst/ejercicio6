/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class Certificador extends Integracion implements Documentable, Auditable {
    
    
    
    public Certificador(String id, String nombre, double latencia, boolean conectada,String config) {
        
        super(id, nombre, latencia, conectada, config);
    }

    @Override
    public String generarDocumento(String referencia) {
        return "XML FEL generado para " + referencia + " - " + getNombre();
    }

    
    
    
    @Override
    public void registrarEvento(String evento) {
        System.out.println("Auditoria " + getId() + ": " + evento);
    }
    
}
