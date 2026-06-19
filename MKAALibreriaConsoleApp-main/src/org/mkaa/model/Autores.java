package org.mkaa.model;

public class Autores { 
    
    private int id_autor;
    private String nombre_autor;
    private String apellido_autor;
    private String nacionalidad;
    private String biografia;
 
    // Constructor Vacío
    public Autores() {
    }
 
    // Constructor con parámetros (Cambiado el nombre al del nuevo constructor)
    public Autores(int id_autor, String nombre_autor, String apellido_autor, String nacionalidad, String biografia) {
        this.id_autor = id_autor;
        this.nombre_autor = nombre_autor;
        this.apellido_autor = apellido_autor;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }
 
    // Los getters y setters se quedan igual...
    public int getId_autor() { return id_autor; }
    public void setId_autor(int id_autor) { this.id_autor = id_autor; }
 
    public String getNombre_autor() { return nombre_autor; }
    public void setNombre_autor(String nombre_autor) { this.nombre_autor = nombre_autor; }
 
    public String getApellido_autor() { return apellido_autor; }
    public void setApellido_autor(String apellido_autor) { this.apellido_autor = apellido_autor; }
 
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
 
    public String getBiografia() { return biografia; }
    public void setBiografia(String biografia) { this.biografia = biografia; }
}