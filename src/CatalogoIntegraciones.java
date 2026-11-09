import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */


public class CatalogoIntegraciones {
    private final List<Integracion> integraciones;

    public CatalogoIntegraciones(List<Integracion> integraciones) {
        this.integraciones = integraciones;
    }

    public void agregar(Integracion integracion) { integraciones.add(integracion); }

    public Integracion buscarApi(String id) {
        for (Integracion integracion : integraciones) {
            if (integracion.getId().equalsIgnoreCase(id)) return integracion;
        }
        return null;
    }

    
    public Integracion buscarApi(String id, boolean distinguirMayusculas) {
        if (!distinguirMayusculas) return buscarApi(id);
        for (Integracion integracion : integraciones) {
            if (integracion.getId().equals(id)) return integracion;
        }
        return null;
    }

    
    
    
    public List<Integracion> obtenerTodas() { return integraciones; }

    public void ordenarPorLatencia() { Collections.sort(integraciones); }
}
