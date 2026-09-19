package com.mycompany.inventarioalimentos;

import java.time.LocalDateTime;

public class Transaccion {
    private int id;
    private LocalDateTime fecha;
    private int idSucursal;

    public Transaccion(int id, LocalDateTime fecha, int idSucursal) {
        this.id = id;
        this.fecha = fecha;
        this.idSucursal = idSucursal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", idSucursal=" + idSucursal +
                '}';
    }
}
