/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.model;

import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;
import freepass.control.ControlFreepass;
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
public class ManajFreepassing {
    String sql;
    PreparedStatement pst;
    ResultSet rs;
    public void loadData2Tabel(JTable tabel){
        sql = "SELECT * FROM vwdetailtiket";
        try {
            Connection con = Koneksi.getInstance().getKoneksi();
            Statement sttm = con.createStatement();
            ResultSet rs = sttm.executeQuery(sql);
            tabel.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ManajPresensi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addTiket(JTable tabel) throws SQLException{
        sql = "UPDATE `tbfreepassing` SET tglTrx = CURRENT_TIMESTAMP, `totTiket`=`totTiket`+2 WHERE JenisTrx = '0';";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.executeUpdate();
        pst.close();
        loadData2Tabel(tabel);
    }
     public boolean cek_added() {
         boolean kondisi=false;
        try {
            String cek = "select * from tbtambahtiket where Month(tglTambah)=Month(current_date()) group by tglTambah";
            pst = Koneksi.getInstance().getKoneksi().prepareStatement(cek);
            rs = pst.executeQuery();
            kondisi = rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(ManajFreepassing.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kondisi;
    }

    public void ambilTiket(ControlFreepass ctlFreepass)throws SQLException {
        sql = "INSERT INTO tbambiltiket(idKaryawan, jmlAmbil, tglAmbil) values(?,?,CURRENT_TIMESTAMP)";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, ctlFreepass.getNip());
        pst.setString(2, String.valueOf(ctlFreepass.getjmTiket()));
        pst.executeUpdate();
        pst.close();
    }

    public int getJmTiket(ControlFreepass ctlFreepass)throws SQLException {
        int jm_tiket=0;
        sql = "Select totTiket from tbkaryawan where idKaryawan=?";
        pst = Koneksi.getInstance().getKoneksi().prepareStatement(sql);
        pst.setString(1, ctlFreepass.getNip());
        rs = pst.executeQuery();
        while(rs.next())
            jm_tiket=rs.getInt(1);
        return jm_tiket;
    }
}
