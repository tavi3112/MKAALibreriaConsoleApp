package org.mkaa.dao.impl;

import org.mkaa.util.Conexion;
import org.mkaa.model.Autor;
import org.mkaa.dao.AutorDAO;

import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class AutorDAOImpl implements AutorDAO {

    @Override
    public boolean insertar(Autor autor) {
        return false;
    }

    @Override
    public List<Autor> listarTodos() {
        // Renombrado a listaAutores para mayor claridad
        List<Autor> listaAutores = new ArrayList<>();
        
        String consulta = "{call sp_listarautores()}";

        try (Connection conexion = Conexion.getInstancia().conectar();
             CallableStatement consultaCall = conexion.prepareCall(consulta);
             ResultSet tablaResultado = consultaCall.executeQuery()) {

            while (tablaResultado.next()) {
                listaAutores.add(new Autor(
                    tablaResultado.getInt("id_autor"),
                    tablaResultado.getString("nombre_autor"),
                    tablaResultado.getString("apellido_autor"),
                    tablaResultado.getString("nacionalidad"),
                    tablaResultado.getString("biografia")
                ));
            }
        } catch (Exception e) {
            System.out.println("ERROR al listar Autores: " + e.getMessage());
        }

        // IMPORTANTE: Ahora retornamos la lista cargada, no null
        return listaAutores;
    }

    @Override
    public Autor buscar(int id_autor) {
        return null;
    }

    @Override
    public boolean actualizar(Autor autor) {
        return false;
    }

    @Override
    public boolean eliminar(int id_autor) {
        return false;
    }
}