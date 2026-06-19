package org.mkaa.model;

public class Editorial {
/*
    create table cientes(
    cui bigint primary key,
    nombre_cliente varchar(100)
    apelido_cliente varchar(100)
    correo_electronico varchar(100)
    );
     */
    //atributos de clase
        String correoElectronico;
    private String nombreEditorial;
    private int idEditorial;
    
    //contructores
    public Editorial() {
    }
    
    public Editorial (long cui, String nombre, String apellido, String correoElectron)
    {
this.correoElectronico = correoElectronico;
}
    //getter and setters
    
//getter and setter
 
    public int getIdEditorial() {
      return idEditorial;
    }
 
    public void setIdEditorial(int idEditorial) {
         this.idEditorial = idEditorial;
    }
 
    public String getNombreEditorial() {
        return nombreEditorial;
    }
 
    public void setNombreEditorial(String nombreEditorial) {
//Formatear a Mayuscula
                //Formatear a Iniciar con Mayuscula
        this.nombreEditorial = nombreEditorial;
    }
}
