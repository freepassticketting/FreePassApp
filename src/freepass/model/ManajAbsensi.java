package freepass.model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import freepass.control.ControlAbsensi;
import freepass.tools.Koneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class ManajAbsensi {
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    public boolean cekPegawai(ControlAbsensi moda) throws SQLException {
        sql = "SELECT * from tbkaryawan where idkaryawan = ?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, moda.getNip());
        rs = pst.executeQuery();

        if(rs.next()) return true;
        else return false;
    }
    public boolean cekDuplikasi(ControlAbsensi moda) throws SQLException {
        sql = "SELECT * from tbabsen where idpegawai = ? and tanggal = ?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, moda.getNip());
        pst.setString(2, moda.getTanggal());
        rs = pst.executeQuery();

        if(rs.next()) return true;
        else return false;
    }
    public int getRec(ControlAbsensi moda) throws SQLException {
        sql = "SELECT * from tbabsen where idpegawai = ? and tanggal = ?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, moda.getNip());
        pst.setString(2, moda.getTanggal());
        rs = pst.executeQuery();

        if(rs.next()) return rs.getInt("no");
        else return 0;
    }
    public void ubahAbsen(ControlAbsensi moda) throws SQLException {
        sql = "UPDATE tbabsen SET idpegawai = ?, tanggal = ?, izin=?, keterangan=?  "
                            + "WHERE no=?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, moda.getNip());
        pst.setDate(2, java.sql.Date.valueOf(moda.getTanggal()));
        pst.setString(3, moda.getAbsen());
        pst.setString(4, moda.getKeterangan());
        pst.setInt(5, moda.getNo());
        pst.executeUpdate();
        pst.close();
    
    }
    public void hapusPegawai(ControlAbsensi moda) throws SQLException {
        sql = "DELETE FROM tbabsen where no=?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setInt(1, moda.getNo());

        pst.executeUpdate();
        pst.close();
    }
    public void loadData2Tabel(JTable tabel){
        sql = "SELECT tbabsen.no as 'No.', tbabsen.tanggal as 'Tanggal', tbabsen.idpegawai as 'NIP', tbkaryawan.Nama, tbjabatan.namajabatan, tbabsen.izin, tbabsen.keterangan FROM `tbabsen`, tbkaryawan, tbjabatan\n" +
               "WHERE tbkaryawan.idKaryawan = tbabsen.idpegawai and tbkaryawan.Jabatan = tbjabatan.idJabatan";
        try {
            Connection con = Koneksi.getInstance().getKoneksi();
            Statement sttm = con.createStatement();
            ResultSet rs = sttm.executeQuery(sql);
            tabel.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ManajPresensi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void tambahAbsen(ControlAbsensi moda) throws SQLException {
        sql = "INSERT INTO tbabsen (idpegawai, izin, tanggal, keterangan) VALUES( ?, ?, ?, ?)";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, moda.getNip());
        pst.setString(2, moda.getAbsen());
        pst.setDate(3, java.sql.Date.valueOf(moda.getTanggal()));
        pst.setString(4, moda.getKeterangan());

        pst.executeUpdate();
        pst.close();        
    }
}
