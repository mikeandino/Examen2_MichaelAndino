/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author henry
 */
public class hilo extends Thread{
    private JLabel tiempo;
    private Cancion cancion;

    public hilo(JLabel tiempo, Cancion cancion) {
        this.tiempo = tiempo;
        this.cancion = cancion;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }
    
    public void run(){
        tiempo.setText(cancion.getDuracion()+"");
        while (cancion.getDuracion()>0) {
            cancion.setDuracion(cancion.getDuracion()-1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            tiempo.setText(cancion.getDuracion()+"");
        }
        JOptionPane.showMessageDialog(null, "Termino");
    }
}
