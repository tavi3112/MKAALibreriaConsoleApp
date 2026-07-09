package org.rocka.dao.impl;

import org.rocka.model.Compras;
import org.rocka.dao.ComprasDAO;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import org.mkaa.model.Compras;

public class ComprasDAOImpl extends ComprasDAO {

    public boolean insertar(Compras compras) {
        // Aquí implementarás la lógica para insertar una compra
        return false;
    }

    @Override
    public List<Compras> listarTodos() {
        List<Compras> listaCompras = new ArrayList<>();
        String consulta = "{call sp_listarcompras()}";

        try (Connection conexion = Conexion.getInstancia().conectar();
             CallableStatement consultaCall = conexion.prepareCall(consulta);
             ResultSet resultado = consultaCall.executeQuery()) {

while (resultado.next()) {
        listaCompras.add(new Compras(
            resultado.getLong("cui"),
            resultado.getString("nombre_cliente"),
            resultado.getString("apellido_cliente"),
            resultado.getString("correo_electronico")
        ));
    }

        } catch (Exception e) {
System.err.print("Error al listar Cleintes: " + e.getMessage());
        }

        return listaCompras;
    }

    @Override
    public Compras buscar(int id_compras) {
        // Aquí implementarás la lógica para buscar una compra por ID
        return null;
    }

    @Override
    public boolean actualizar(Compras compras) {
        // Aquí implementarás la lógica para actualizar una compra
        return false;
    }

    @Override
    public boolean eliminar(int id_compras) {
        // Aquí implementarás la lógica para eliminar una compra
        return false;
    }
}