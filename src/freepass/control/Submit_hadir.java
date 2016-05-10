/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.control;

import freepass.model.Pegawe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dendi
 */
public class Submit_hadir {
    
    Pegawe pg = new Pegawe();
    
    public boolean cek_pegawai(Pegawe karyawan) throws SQLException {
        String cek = "SELECT * from tbKaryawan where idKaryawan = ?";
        PreparedStatement pst;
        pst = konek.getKoneksi().prepareStatement(cek);
        pst.setString(1, karyawan.getNIP());
        ResultSet rs;
        rs = pst.executeQuery();
        if(rs.next()) return true;
        return false;
    }
        
   public boolean cek_kehadiran(Pegawe karyawan) throws SQLException {
        String cek = "SELECT * from tbKehadiran where idpegawai=? and tanggal=curdate()";
        PreparedStatement pst = konek.getKoneksi().prepareStatement(cek);
        pst.setString(1, karyawan.getNIP());
        ResultSet rs;
        rs = pst.executeQuery();
        if(rs.next()) return false;
        return true;
    }
   
   public boolean cek_jamMasuk(Pegawe karyawan) throws SQLException {
        String cek = "SELECT  from tbKaryawan where idKaryawan=?";
        PreparedStatement pst = konek.getKoneksi().prepareStatement(cek);
        pst.setString(1, karyawan.getNIP());
        ResultSet rs;
        rs = pst.executeQuery();
        if(rs.next()) return false;
        return true;
    }
        
        
    public List<Pegawe> ambil(Pegawe karyawan) throws SQLException {
        String cek = " SELECT tbKaryawan.idKaryawan, tbKaryawan.Nama, tbKaryawan.Gender, tbKaryawan.No_Telp, tbJabatan.namajabatan, "
                + "tbKaryawan.JamKerja, tbJam.jam_kerja_mulai, tbJam.jam_kerja_selesai, tbKaryawan.Alamat, "
                + "tbJam.jam_masuk_mulai, tbJam.jam_keluar_selesai "
                + "FROM tbKaryawan, tbJabatan, tbJam WHERE tbKaryawan.idKaryawan = ? "
                + "and tbJam.id_jam = tbKaryawan.JamKerja and tbKaryawan.jabatan = tbJabatan.idjabatan "
                + "group by idKaryawan";
        PreparedStatement pst = konek.getKoneksi().prepareStatement(cek);
        pst.setString(1, karyawan.getNIP());
        ResultSet rs;
        rs = pst.executeQuery();
        List<Pegawe> list = new ArrayList<>();
        if(rs.next()){
            pg.setNama(rs.getString("Nama"));
            pg.setAlamat(rs.getString("Alamat"));
            pg.setGender(rs.getString("Gender"));
            pg.setNoTelp(rs.getString("No_Telp"));
            pg.setId_Jam(rs.getString("JamKerja"));
            pg.setJabatan(rs.getString("namajabatan"));
            pg.setMasukStart(rs.getTime("jam_masuk_mulai"));
            pg.setKerjaStart(rs.getTime("jam_kerja_mulai"));
            pg.setKerjaEnd(rs.getTime("jam_kerja_selesai"));
            pg.setKeluarEnd(rs.getTime("jam_keluar_selesai"));
            list.add(pg);
        }        
        return list;
    }
    
    
    public void masuk(String nip) throws SQLException {
        String hadir = "INSERT INTO tbKehadiran(idpegawai, tanggal, jmasuk, jkeluar, id_jam) VALUES( ?, CURDATE(), CURTIME(), ?, ?)";
        PreparedStatement pst = konek.getKoneksi().prepareStatement(hadir);
        pst.setString(1, nip);
        pst.setTime(2, pg.getKeluarEnd());
        pst.setString(3, pg.getId_Jam());
        pst.executeUpdate();     
    }
        
    public void keluar(String nip) throws SQLException {
        String cek = "UPDATE tbKehadiran SET jkeluar=CURTIME() WHERE idpegawai=? and tanggal=curdate()";
        PreparedStatement pst = konek.getKoneksi().prepareStatement(cek);
        pst.setString(1, nip);       
        pst.executeUpdate();       
    }
                            
    
}
