package modelo;

public class Pago {

    private Cliente cliente;
    private double monto;
    private String fechaPago;
    private String estado;

    public Pago(Cliente cliente, double monto, String fechaPago,String estado) {
        this.cliente = cliente;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public String getEstado() {
        return estado;
    }
}