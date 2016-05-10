/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.control;
import freepass.tampilan.*;
/**
 *
 * @author nufail
 */
public class Utama {
    public static void main(String[] args) {
        new MenuUtama().setVisible(true);
    }

    public void tampilMenuLogin() {
        new FrmLogin(new javax.swing.JFrame(), true).setVisible(true);
    }

    public void tampilMenuUtama() {
        new MenuUtama().setVisible(true);
    }
    public void tampilProses() {
        new FrmProses().setVisible(true);
    }
    public void tampilFrmAbsensiClient(){
        new AbsensiPegawai().setVisible(true);
    }
}
