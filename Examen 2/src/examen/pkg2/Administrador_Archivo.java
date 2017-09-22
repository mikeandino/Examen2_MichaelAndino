/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author henry
 */
public class Administrador_Archivo {

    private File archivo = null;
    private ArrayList<Usuario> u = new ArrayList<>();
    private ArrayList<Album> a = new ArrayList<>();
    private ArrayList guardar = new ArrayList<>();

    public Administrador_Archivo() {
    }

    public Administrador_Archivo(String path) {
        archivo = new File(path);
        cargarArchivo();
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getU() {
        return u;
    }

    public void setU(ArrayList<Usuario> u) {
        this.u = u;
    }

    public ArrayList<Album> getA() {
        return a;
    }

    public void setA(ArrayList<Album> a) {
        this.a = a;
    }

    public ArrayList getGuardar() {
        return guardar;
    }

    public void setGuardar(ArrayList guardar) {
        this.guardar = guardar;
    }

    public void escribirArchivo() throws IOException {
        guardar.add(0, u);
        guardar.add(1, a);
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object o : guardar) {
                bw.writeObject(o);
            }
            bw.flush();
        } catch (Exception e) {
        }
        fw.close();
        bw.close();
    }

    public void cargarArchivo() {
        try {
            guardar = new ArrayList();
            Object temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = objeto.readObject()) != null) {
                        getGuardar().add(temp);
                    }
                } catch (EOFException e) {
                }
                u = (ArrayList<Usuario>) guardar.get(0);
                a = (ArrayList<Album>) guardar.get(1);
                entrada.close();
                objeto.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
