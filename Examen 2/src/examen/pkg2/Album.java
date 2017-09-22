package examen.pkg2;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable {
    private String nombre;
    private String artista;
    private ArrayList<Cancion> lista = new ArrayList<>();
    private static final long SerialVersionUID = 4224;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
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

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }
}
