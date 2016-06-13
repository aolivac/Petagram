package com.example.xoff.mascotas;

/**
 * Created by XOFF on 12/06/2016.
 */
public class Mascota {

    private String nombre;
    private String raza;
    private int    foto;
    private String    numLikes;


    public Mascota(int foto, String nombre, String raza,String numLikes) {
        this.nombre   = nombre;
        this.raza     = raza;
        this.foto     = foto;
        this.numLikes = numLikes;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
  public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(String numLikes) {
        this.numLikes = numLikes;
    }


}