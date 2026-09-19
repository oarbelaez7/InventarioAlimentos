package com.mycompany.inventarioalimentos;

import java.util.HashMap;
import java.util.Map;

public class CacheBranch {
    private Map<Integer, String> cache;

    public CacheBranch() {
        this.cache = new HashMap<>();
    }

    public void agregarSucursal(int id, String nombre) {
        cache.put(id, nombre);
        System.out.println("Sucursal agregada al caché: ID=" + id + ", Nombre=" + nombre);
    }

    public String obtenerSucursal(int id) {
        String sucursal = cache.get(id);
        if (sucursal != null) {
            System.out.println("Sucursal obtenida del caché: " + sucursal);
        } else {
            System.out.println("Sucursal NO encontrada en caché: ID=" + id);
        }
        return sucursal;
    }

    public void actualizarSucursal(int id, String nombre) {
        if (cache.containsKey(id)) {
            cache.put(id, nombre);
            System.out.println("Sucursal actualizada en caché: ID=" + id + ", Nombre=" + nombre);
        }
    }

    public void eliminarSucursal(int id) {
        if (cache.remove(id) != null) {
            System.out.println("Sucursal eliminada del caché: ID=" + id);
        }
    }

    public void limpiarCache() {
        cache.clear();
        System.out.println("Caché de sucursales limpiado");
    }

    public Map<Integer, String> obtenerTodasLasSucursales() {
        return new HashMap<>(cache);
    }
}
