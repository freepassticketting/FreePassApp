/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.model;

import freepass.control.ControlKaryawan;
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

    public boolean cekPegawai(ControlKaryawan ctrpg) throws SQLException{
        sql = "SELECT * from tbkaryawan where idkaryawan = ?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, ctrpg.getNIP());
        rs = pst.executeQuery();
        return rs.next();
    }

    public void updatePegawai(ControlKaryawan ctrpg) throws SQLException{
        sql = "UPDATE tbkaryawan SET Nama = ?, Alamat = ?, No_Telp=? , Jabatan=?, "+
                "Gender=?, JamKerja=?  WHERE idkaryawan=?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, ctrpg.getNama());
        pst.setString(2, ctrpg.getAlamat());
        pst.setString(3, ctrpg.getNoTelp());
        pst.setString(4, ctrpg.getJabatan());
        pst.setString(5, ctrpg.getGender());
        pst.setString(6, ctrpg.getId_Jam());
        pst.setString(7, ctrpg.getNIP());
        pst.executeUpdate();
        pst.close();
    }
    
    public void hapusKaryawan(String idKaryawan) throws SQLException{
        sql = "DELETE FROM tbkaryawan WHERE idkaryawan= ?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, idKaryawan);
        pst.executeUpdate();
        pst.close();
    }
    public void tambahPegawai(ControlKaryawan ctrpg) throws SQLException{
        sql = "INSERT INTO tbkaryawan values(?, ?, ?, ?, ?, ?, ?)";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        
        pst.setString(1, ctrpg.getNIP());
        pst.setString(2, ctrpg.getNama());
        pst.setString(3, ctrpg.getAlamat());
        pst.setString(4, ctrpg.getNoTelp());
        pst.setString(5, ctrpg.getJabatan());
        pst.setString(6, ctrpg.getGender());
        pst.setString(7, ctrpg.getId_Jam());

        pst.executeUpdate();
        pst.close();
    }
}
