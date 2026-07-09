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
        
public class AutorDAOImpl implements AutorDAO{

    @Override
    public boolean insertar(Autor autores) {
        return false;
    }

    @Override
    public List<Autor> listar() {     
        return null;
    }

    @Override
    public Autor buscar(int id_autores) {
           return null;
    }

    @Override
    public boolean actualizar(Autor autores) {
        return false;
    }

    @Override
    public boolean eliminar(int id_autores) {
        return false;
    }
}
