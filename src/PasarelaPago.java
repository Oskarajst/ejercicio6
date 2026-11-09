/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class PasarelaPago extends Integracion implements Transaccional, Auditable {
    public PasarelaPago(String id, String nombre, double latencia, boolean conectada,
                        String config) {
        super(id, nombre, latencia, conectada, config);
    }

    
    @Override
    public void cobrar(double monto) {
        System.out.println("Cobro de Q" + monto + " procesado por " + getNombre());
        registrarEvento("Cobro Q" + monto);
    }

    @Override
    public void reintegrar(double monto) {
        System.out.println("Reintegro de Q" + monto + " procesado por " + getNombre());
        registrarEvento("Reintegro Q" + monto);
    }

    @Override
    public void registrarEvento(String evento) {
        System.out.println("Auditoria " + getId() + ": " + evento);
    }
}