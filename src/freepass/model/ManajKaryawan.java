/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.model;

import freepass.tools.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nufail
 */
public class ManajKaryawan {
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    public void Data2Table(JTable Tabel){
        sql = "SELECT * FROM vwdatakaryawan";
        try {
            Connection con = Koneksi.getInstance().getKoneksi();
            Statement sttm = con.createStatement();
            ResultSet rs = sttm.executeQuery(sql);
            Tabel.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ManajPresensi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
