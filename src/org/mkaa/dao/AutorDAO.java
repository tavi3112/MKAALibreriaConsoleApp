package org.mkaa.dao;

import java.util.List;
import org.mkaa.model.Autor;
public interface AutorDAO {
   //FIRMAS DE METODOS
    //CRUD
   
  
    boolean insertar(Autor autores);
    List<Autor> listar();
    Autor buscar(int id_autores);
    boolean actualizar(Autor autores);
    boolean eliminar(int id_autores);
    
    
  
}
