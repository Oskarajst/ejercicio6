/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class ServicioConsulta extends Integracion implements Auditable {
    
    
    public ServicioConsulta(String id, String nombre, double latencia, boolean conectada,String config) {
        super(id, nombre, latencia, conectada, config);
    }

    
    public String consultar(String dato) {
        return "Consulta de " + dato + " realizada por " + getNombre();
    }

    @Override
    public void registrarEvento(String evento) {
        System.out.println("Auditoria " + getId() + ": " + evento);
    }
    
}
