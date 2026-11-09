
import java.util.List;
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskar
 */
public class IntegracionesVista {

    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Catalogo de integraciones ===");
        System.out.println("1. Listar integraciones");
        System.out.println("2. Buscar API por ID");
        System.out.println("3. Ordenar por latencia");
        System.out.println("4. Probar reintegro");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");

        
        
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void mostrarIntegraciones(List<Integracion> integraciones) {
        for (Integracion integracion : integraciones) {
            System.out.println(integracion);
        }
    }

    
    public void mostrarDetalle(Integracion integracion) {
        if (integracion == null) {
            System.out.println("No se encontro la API.");
        } else {
            System.out.println(integracion);
            System.out.println("Configuracion:");
            System.out.println(integracion.getConfiguracion());
        }
    }

    public String pedirId() {
        System.out.print("ID de la API: ");
        return scanner.nextLine();
    }

    public String pedirMonto() {
        System.out.print("Monto del reintegro: Q");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

