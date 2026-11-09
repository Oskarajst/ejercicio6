
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class Integracioneslol {
    
    
    
private final CatalogoIntegraciones catalogo;

    public Integracioneslol(CatalogoIntegraciones catalogo) {
        this.catalogo = catalogo;
    }

    public List<Integracion> listar() { return catalogo.obtenerTodas(); }
    public Integracion buscar(String id) { return catalogo.buscarApi(id); }
    public void ordenar() { catalogo.ordenarPorLatencia(); }

    
    public void procesarPago(Transaccional servicio, double monto) {
        servicio.cobrar(monto);
    }

    
    public void procesarReintegro(Integracion integracion, double monto) {
        if (integracion instanceof Transaccional) {
            ((Transaccional) integracion).reintegrar(monto);
        } else {
            System.out.println("Reintegro ignorado " + integracion.getNombre()
                    + " sin operaciones financieras.");
        }
    }
}