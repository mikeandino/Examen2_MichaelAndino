package examen.pkg2;

import java.io.Serializable;

public class Cancion implements Serializable{

    private String nombre;
    private String artista;
    private int duracion;
    private String genero;
    private static final long SerialVersionUID = 4224;

    public Cancion(String nombre, String artista, int duracion, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
