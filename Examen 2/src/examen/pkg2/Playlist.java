package examen.pkg2;

import java.io.Serializable;
import java.util.ArrayList;

public class Playlist implements Serializable {

    private ArrayList<Cancion> lista = new ArrayList();
    private static final long SerialVersionUID = 4224;

    public Playlist() {
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }
}
