/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class VolumeBola {
    public static void main (String[] args) {
        System.out.println("Program untuk perhitungan bola : ");
        String jari = "";
        jari = JOptionPane.showInputDialog("Masukkan Jari-jari : ");
        int r = Integer.parseInt(jari);
        System.out.println("Jari-jari = "+(r));
        System.out.println("Luas Permukaan = "+((3.14*r*r)*4));
        System.out.println("Volume = "+(((3.14*r*r*r)*4)/3));
    }
}
