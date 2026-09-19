package com.mycompany.inventarioalimentos;

import java.util.HashMap;
import java.util.Map;

public class CacheProduct {
    private Map<Integer, String> cache;

    public CacheProduct() {
        this.cache = new HashMap<>();
    }

    public void agregarProducto(int id, String nombre) {
        cache.put(id, nombre);
        System.out.println("Producto agregado al caché: ID=" + id + ", Nombre=" + nombre);
    }

    public String obtenerProducto(int id) {
        String producto = cache.get(id);
        if (producto != null) {
            System.out.println("Producto obtenido del caché: " + producto);
        } else {
            System.out.println("Producto NO encontrado en caché: ID=" + id);
        }
        return producto;
    }

    public void actualizarProducto(int id, String nombre) {
        if (cache.containsKey(id)) {
            cache.put(id, nombre);
            System.out.println("Producto actualizado en caché: ID=" + id + ", Nombre=" + nombre);
        }
    }

    public void eliminarProducto(int id) {
        if (cache.remove(id) != null) {
            System.out.println("Producto eliminado del caché: ID=" + id);
        }
    }

    public void limpiarCache() {
        cache.clear();
        System.out.println("Caché de productos limpiado");
    }

    public Map<Integer, String> obtenerTodosLosProductos() {
        return new HashMap<>(cache);
    }
}
