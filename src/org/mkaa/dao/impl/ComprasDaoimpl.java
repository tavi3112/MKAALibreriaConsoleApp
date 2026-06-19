package org.mkaa.dao.impl;

import org.key.util.Conexion;
import org.key.model.Compras;
        import org.key.dao.Compra;

import java.util.List;
import java.util.Arraylist;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ComprasDaoimpl implements ComprasDAO{
    
    @Override
    public boolean insertar(Cliente cliente){
        return false;
    }
    
    @Override
    public Cliente buscar(long cui){
        return null;
    }
    
}
