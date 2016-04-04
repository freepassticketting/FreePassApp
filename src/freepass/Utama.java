/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass;
import freepass.UI.*;
import freepass.dialog.FormLogin;
/**
 *
 * @author nufail
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new FormLogin(new javax.swing.JFrame(), true).setVisible(true);
    }

    public void tampilMenuLogin() {
        new FormLogin(new javax.swing.JFrame(), true).setVisible(true);
    }

    public void tampilMenuUtama() {
        new MenuUtama().setVisible(true);
    }
    public void tampilProses() {
        new FrmProses().setVisible(true);
    }
}
