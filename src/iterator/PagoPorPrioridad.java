package iterator;
import modelo.Pago;
import java.util.*;

public class PagoPorPrioridad implements IteratorPago {

    private ArrayList<Pago> pagosOrdenados;
    private int posicion;

    public PagoPorPrioridad(ArrayList<Pago> pagos) {
        pagosOrdenados = new ArrayList<>();

        for (Pago p : pagos) {
            if (p.getEstado().equalsIgnoreCase("Vencido")) {
                pagosOrdenados.add(p);
            }
        }

        for (Pago p : pagos) {
            if (p.getEstado().equalsIgnoreCase("Pendiente")) {
                pagosOrdenados.add(p);
            }
        }

        for (Pago p : pagos) {
            if (p.getEstado().equalsIgnoreCase("Pagado")) {
                pagosOrdenados.add(p);
            }
        }

        posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < pagosOrdenados.size();
    }

    @Override
    public Pago next() {
        return pagosOrdenados.get(posicion++);
    }
}