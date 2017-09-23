package examen.pkg2;

import java.io.Serializable;
import java.util.ArrayList;

public class Playlist implements Serializable {

    private ArrayList<Cancion> lista = new ArrayList();
    private String nombre;
    private static final long SerialVersionUID = 4224;

    public Playlist() {
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
