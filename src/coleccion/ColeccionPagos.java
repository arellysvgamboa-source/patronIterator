package coleccion;

import iterator.*;
import modelo.Pago;

import java.util.ArrayList;

public class ColeccionPagos {

    private ArrayList<Pago> pagos;

    public ColeccionPagos() {
        pagos = new ArrayList<>();
    }

    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

    public IteratorPago crearIterator() {
        return new PagoPorPrioridad(pagos);
    }
}