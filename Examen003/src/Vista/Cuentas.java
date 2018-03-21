/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Alexis
 */
@Entity
@Table(name = "CUENTAS", catalog = "", schema = "ADMINISTRADOR")
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c")
    , @NamedQuery(name = "Cuentas.findByNumeroCuenta", query = "SELECT c FROM Cuentas c WHERE c.numeroCuenta = :numeroCuenta")
    , @NamedQuery(name = "Cuentas.findByCliente", query = "SELECT c FROM Cuentas c WHERE c.cliente = :cliente")
    , @NamedQuery(name = "Cuentas.findByTipoCuenta", query = "SELECT c FROM Cuentas c WHERE c.tipoCuenta = :tipoCuenta")
    , @NamedQuery(name = "Cuentas.findByMovimiento", query = "SELECT c FROM Cuentas c WHERE c.movimiento = :movimiento")
    , @NamedQuery(name = "Cuentas.findByFecha", query = "SELECT c FROM Cuentas c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cuentas.findBySaldo", query = "SELECT c FROM Cuentas c WHERE c.saldo = :saldo")})
public class Cuentas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_CUENTA")
    private Integer numeroCuenta;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private String cliente;
    @Basic(optional = false)
    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;
    @Basic(optional = false)
    @Column(name = "MOVIMIENTO")
    private String movimiento;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "SALDO")
    private String saldo;

    public Cuentas() {
    }

    public Cuentas(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cuentas(Integer numeroCuenta, String cliente, String tipoCuenta, String movimiento, Date fecha, String saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.movimiento = movimiento;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        Integer oldNumeroCuenta = this.numeroCuenta;
        this.numeroCuenta = numeroCuenta;
        changeSupport.firePropertyChange("numeroCuenta", oldNumeroCuenta, numeroCuenta);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        String oldTipoCuenta = this.tipoCuenta;
        this.tipoCuenta = tipoCuenta;
        changeSupport.firePropertyChange("tipoCuenta", oldTipoCuenta, tipoCuenta);
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        String oldMovimiento = this.movimiento;
        this.movimiento = movimiento;
        changeSupport.firePropertyChange("movimiento", oldMovimiento, movimiento);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        String oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroCuenta != null ? numeroCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.numeroCuenta == null && other.numeroCuenta != null) || (this.numeroCuenta != null && !this.numeroCuenta.equals(other.numeroCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vista.Cuentas[ numeroCuenta=" + numeroCuenta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
