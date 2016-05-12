/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.control;

import java.util.Date;

/**
 *
 * @author Dendi
 */
public class ControlAbsensi {
    private int no;
    private String nip;
    private String tanggal;
    private String absen;
    private String keterangan;    
    
    public void setNip(String nip){
        this.nip = nip;
    }

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @return the absen
     */
    public String getAbsen() {
        return absen;
    }

    /**
     * @param absen the absen to set
     */
    public void setAbsen(String absen) {
        this.absen = absen;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }
    
}