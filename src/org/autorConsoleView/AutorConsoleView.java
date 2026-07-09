package org.autorConsoleView;

import java.util.Scanner;
import java.util.List;
import org.mkaa.model.Autor; // Asegúrate de que esta ruta coincida con tu paquete

public class AutorConsoleView {

    private final Scanner leer = new Scanner(System.in);

    // método para mostrar las opciones de este menú
    public int mostrarMenu(){
        int opcion = 0;

        System.out.println("-------Gestion de Autores---------");
        System.out.println("-1 CREAR NUEVO AUTOR-");
        System.out.println("-2 LISTAR AUTORES-");
        System.out.println("-3 BUSCAR AUTOR POR ID-");
        System.out.println("-4 MODIFICAR AUTOR-");
        System.out.println("-5 ELIMINAR AUTOR-");
        System.out.println("-6 REGRESAR MENU PRINCIPAL-");
        System.out.println("-Seleccione una opción-");
        opcion = Integer.parseInt(leer.nextLine());
        return opcion;
    }

    public long solicitarCUI(){
        System.out.println("ingrese el CUI del autor");
        return Long.parseLong(leer.nextLine());
    }

    public String solicitarNombreAutor(){
        System.out.println("ingrese el Nombre del autor");
        String nombre;
        nombre = leer.nextLine();
        return nombre;
    }

    public String solicitarApellidoAutor(){
        System.out.println("ingrese el Apellido del autor");
        return leer.nextLine();
    }

    public String solicitarCorreoElectronico(){
        System.out.println("ingrese el correo electronico");
        return leer.nextLine();
    }

    // mostrar el detalle de un AUTOR
    public void mostrarAutor(Autor autor){
        System.out.println("--- DATOS DEL AUTOR ---");
        System.out.println("CUI: " + autor.getCui());
        System.out.println("NOMBRE: " + autor.getNombre());
        System.out.println("APELLIDO: " + autor.getApellido());
        System.out.println("CORREO: " + autor.getCorreoElectronico());
    }

    // mostrar la lista de AUTORES
    public void mostrarListaAutores(List<Autor> autores){
        System.out.println("--LISTA DE AUTORES ---");
        System.out.println("|CUI   |   NOMBRE  |   APELLIDO   |  CORREO ELECTRÓNICO  |");
        System.out.printf("%-10s %-10s %-10s %-10s", "CUI","NOMBRE","APELLIDO","CORREO");

        for (Autor autor : autores) {
            System.out.printf("%-10s %-10s %-10s %-10s", 
                    autor.getCui(), autor.getNombre(), autor.getApellido(), autor.getCorreoElectronico());
        }
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}