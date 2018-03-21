
package Modelo;

/**
 *
 * @author Alexis
 */
public class Cuentas {
    
    private int numero_cuenta;
    private String cliente;
    private String tipo_cuenta;
    private String movimiento;
    private String Fecha;
    private String Saldo;

    public Cuentas() {
    }

    public Cuentas(int numero_cuenta, String cliente, String tipo_cuenta, String movimiento, String Fecha, String Salgo) {
        this.numero_cuenta = numero_cuenta;
        this.cliente = cliente;
        this.tipo_cuenta = tipo_cuenta;
        this.movimiento = movimiento;
        this.Fecha = Fecha;
        this.Saldo = Salgo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "numero_cuenta=" + numero_cuenta + ", cliente=" + cliente + ", tipo_cuenta=" + tipo_cuenta + ", movimiento=" + movimiento + ", Fecha=" + Fecha + ", Salgo=" + Saldo + '}';
    }

    
            
}
