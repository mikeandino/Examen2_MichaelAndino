package examen.pkg2;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {

    private String nombre;
    private int edad;
    private String username;
    private String password;
    private ArrayList<Playlist> playlist = new ArrayList();
    private ArrayList<Cancion> favoritos;
    private static final long SerialVersionUID = 4224;

    public Usuario(String nombre, int edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Cancion> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Cancion> favoritos) {
        this.favoritos = favoritos;
    }
}
