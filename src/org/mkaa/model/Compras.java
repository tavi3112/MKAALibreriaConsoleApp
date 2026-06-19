package org.mkaa.model;

public class Compras {
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
    private String nombreCompras;
    private int idCompras;
    
    //contructores
    public Compras() {
    }
    
    public Compras (long cui, String nombre, String apellido, String correoElectron)
    {
this.correoElectronico = correoElectronico;
}
    //getter and setters
    
//getter and setter
 
    public int getIdCompras() {
      return idCompras;
    }
 
    public void setIdCompras(int idCompras) {
         this.idCompras = idCompras;
    }
 
    public String getNombreCompras() {
        return nombreCompras;
    }
 
    public void setNombreCompras(String nombreCompras) {
//Formatear a Mayuscula
                //Formatear a Iniciar con Mayuscula
        this.nombreCompras = nombreCompras;
    }
}
