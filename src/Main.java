//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import coleccion.*;
import iterator.*;
import modelo.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColeccionPagos pagos = new ColeccionPagos();

        Cliente c1 = new Cliente(
                "71234567",
                "Ana Terrones",
                "987654321");

        Cliente c2 = new Cliente(
                "74561234",
                "Carlos Perez",
                "956321478");

        Cliente c3 = new Cliente(
                "78945612",
                "Juan Lopez",
                "945678123");

        pagos.agregarPago(new Pago(c1, 1500, "01/01/2026", "Vencido"));
        pagos.agregarPago(new Pago(c1, 1500, "01/02/2026", "Pagado"));
        pagos.agregarPago(new Pago(c1, 1500, "01/03/2026", "Pendiente"));
        pagos.agregarPago(new Pago(c1, 1500, "01/04/2026", "Pagado"));
        pagos.agregarPago(new Pago(c1, 1500, "01/05/2026", "Vencido"));
        pagos.agregarPago(new Pago(c2, 1800, "05/01/2026", "Pendiente"));
        pagos.agregarPago(new Pago(c2, 1800, "05/02/2026", "Pagado"));
        pagos.agregarPago(new Pago(c2, 1800, "05/03/2026", "Vencido"));
        pagos.agregarPago(new Pago(c2, 1800, "05/04/2026", "Pagado"));
        pagos.agregarPago(new Pago(c2, 1800, "05/05/2026", "Pendiente"));pagos.agregarPago(new Pago(c3, 1200, "10/01/2026", "Pagado"));
        pagos.agregarPago(new Pago(c3, 1200, "10/02/2026", "Pagado"));
        pagos.agregarPago(new Pago(c3, 1200, "10/03/2026", "Pendiente"));
        pagos.agregarPago(new Pago(c3, 1200, "10/04/2026", "Vencido"));
        pagos.agregarPago(new Pago(c3, 1200, "10/05/2026", "Pagado"));

        int op;
        do {
            System.out.println("\n================================");
            System.out.println("      LOS PORTALES SAC");
            System.out.println(" Sistema de Gestion Financiera");
            System.out.println("================================");
            System.out.println("1. Ver pagos por prioridad");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op) {

                case 1:

                    IteratorPago iterator = pagos.crearIterator();
                    String clienteActual = "";
                    System.out.println("\n===== PAGOS ORDENADOS POR PRIORIDAD =====");

                    while (iterator.hasNext()) {

                        Pago pago = iterator.next();
                        String nombreCliente = pago.getCliente().getNombre();

                        if (!nombreCliente.equals(clienteActual)) {
                            clienteActual = nombreCliente;
                            System.out.println("\n================================");
                            System.out.println("Cliente: " + nombreCliente);
                            System.out.println("DNI: " + pago.getCliente().getDni());
                            System.out.println("Telefono: " + pago.getCliente().getTelefono());
                            System.out.println("================================");
                        }

                        System.out.println( "Fecha: " + pago.getFechaPago() + " | Estado: " + pago.getEstado() + " | Monto: S/" + pago.getMonto());
                    }
                    break;

                case 2:

                    System.out.println( "\nGracias por utilizar el sistema.");
                    break;

                default:

                    System.out.println( "\nOpcion no valida.");
            }

        } while (op != 2);

        sc.close();
    }
}