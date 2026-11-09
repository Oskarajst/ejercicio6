import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class Main {
    public static void main(String[] args) {
        List<Integracion> listaPolimorfica = new ArrayList<>();
        cargarDatosIniciales(listaPolimorfica);
        CatalogoIntegraciones catalogo = new CatalogoIntegraciones(listaPolimorfica);
        Integracioneslol controller = new Integracioneslol(catalogo);
        IntegracionesVista view = new IntegracionesVista();

        boolean activo = true;
        while (activo) {
            int opcion = view.mostrarMenu();
            switch (opcion) {
                
                
                case 1:
                    view.mostrarIntegraciones(controller.listar());
                    break;
                    
                    
                    
                case 2:
                    view.mostrarDetalle(controller.buscar(view.pedirId()));
                    break;
                    
                    
                    
                case 3:
                    controller.ordenar();
                    view.mostrarMensaje("Catalogo ordenado por latencia de menor a mayor");
                    view.mostrarIntegraciones(controller.listar());
                    break;
                    
                    
                case 4:
                    Integracion api = controller.buscar(view.pedirId());
                   
                    if (api == null) {
                        view.mostrarMensaje("No se encontro la API");
                        break;
                    }
                    try {
                        double monto = Double.parseDouble(view.pedirMonto());
                        
                        if (monto > 0 && monto <= 1000000) {
                            controller.procesarReintegro(api, monto);
                            
                        } else {
                            view.mostrarMensaje("El monto debe ser mayor a 0 y menor o igual a 1000000");
                        }
                    } catch (NumberFormatException e) {
                        view.mostrarMensaje("Monto no valido");
                    }
                    break;
                case 0:
                    activo = false;
                    break;
                default:
                    view.mostrarMensaje("Opcion no valida");
            }
        }
        view.mostrarMensaje("Programa finalizado");
    }

    private static void cargarDatosIniciales(List<Integracion> lista) {
        lista.add(new PasarelaPago("PAY01", "VisaNet", 120, true, "tipo: tarjeta; entorno: prueba"));
        lista.add(new PasarelaPago("PAY02", "Mastercard", 145, true, "tipo: tarjeta; entorno: prueba"));
        lista.add(new PasarelaPago("PAY03", "TransferGT", 210, true, "tipo: transferencia; entorno: prueba"));
        lista.add(new PasarelaPago("PAY04", "BilleteraGo", 98, true, "tipo: billetera; entorno: prueba"));
        lista.add(new ProveedorLogistico("LOG01", "CargoExpreso", 260, true, "region: nacional; entorno: prueba"));
        lista.add(new ProveedorLogistico("LOG02", "DHL", 310, true, "region: internacional; entorno: prueba"));
        lista.add(new ProveedorLogistico("LOG03", "EntregaYa", 175, false, "region: urbana; entorno: prueba"));
        lista.add(new Certificador("FEL01", "Infile", 230, true, "formato: XML; entorno: prueba"));
        lista.add(new Certificador("FEL02", "Megaprint", 190, true, "formato: XML; entorno: prueba"));
        lista.add(new ServicioConsulta("QRY01", "TipoCambioGT", 80, true, "dato: tipo de cambio; entorno: prueba"));
    }

}
