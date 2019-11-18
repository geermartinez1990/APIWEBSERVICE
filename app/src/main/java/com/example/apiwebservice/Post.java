package com.example.apiwebservice;

public class Post {

    //private int userId;
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int IdCiudad;




    public Post(int id, String nombre, String apellido, int edad, int IdCiudad) {
        //this.userId = userId;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad= edad;
        this.IdCiudad= IdCiudad;
    }

    /*public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        IdCiudad = idCiudad;
    }
}
