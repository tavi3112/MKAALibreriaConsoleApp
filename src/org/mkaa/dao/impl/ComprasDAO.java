package org.mkaa.dao.impl;

import java.util.List;

public interface ComprasDAO {
    //firmas de metodos
    //CRUD
    boolean insertar(Compras compras);
    List<Compras> listar();
    Compras buscar(long cui);
    boolean actualizar(Compras compras);
    boolean eliminar(long cui);

    public static class Compras {

        public Compras() {
        }
    }

}
