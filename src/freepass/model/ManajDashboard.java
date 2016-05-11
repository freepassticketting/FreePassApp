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
public class ManajDashboard {
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    public void loadData2Tabel(JTable tabel){
        String sql = "SELECT * FROM vwrekapabsen";
        try {
            Connection con = Koneksi.getInstance().getKoneksi();
            Statement sttm = con.createStatement();
            ResultSet rs = sttm.executeQuery(sql);
            /*ListTableModel model = ListTableModel
                    .createModelFromResultSet(rs);
            tbDataKaryawan.setModel(model);*/
            tabel.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Submit_hadir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getJmPegawai() throws SQLException{
        sql = "SELECT Count(*) as jumlah_pegawai FROM tbkaryawan;";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        rs = pst.executeQuery(sql);
        while(rs.next()) return rs.getInt("jumlah_pegawai");
        return 0;
    }
    public int getTotalHadir() throws SQLException{
        sql = "SELECT count(*) as total_hadir FROM tbkehadiran;";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        rs = pst.executeQuery(sql);
        while(rs.next()) return rs.getInt("total_hadir");
        return 0;
    }
    public int getTotalHari() throws SQLException{
        sql = "SELECT tanggal as tanggal_kerja FROM tbkehadiran group by tanggal;";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        rs = pst.executeQuery(sql);
        int jumlah_hari = 0;
        while(rs.next()) jumlah_hari++;
        return jumlah_hari;
    }
}
