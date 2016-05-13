/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.control;

import java.sql.Time;

/**
 *
 * @author Dendi
 */
public class ControlKaryawan {
    private String NIP;
    private String Nama;
    private String Jabatan;
    private String Alamat;
    private String id_Jam;
    private String NoTelp;
    private String Gender;
    private String NIK;
    private Time MasukStart;
    private Time KerjaStart;
    private Time KerjaEnd;
    private Time KeluarEnd;
    
    //NIP
    public void setNIP(String nip){
        this.NIP = nip;
    }
    public String getNIP(){
        return NIP;
    }
    
    //Nama
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    //Jabatan
    public String getJabatan() {
        return Jabatan;
    }
    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }
    
    //Alamat
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    //ID Jam
    public String getId_Jam() {
        return id_Jam;
    }
    public void setId_Jam(String id_Jam) {
        this.id_Jam = id_Jam;
    }
    
    //No Telpon
    public String getNoTelp() {
        return NoTelp;
    }
    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }
    
    //Gender
    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    public void setMasukStart(Time jam){
        this.MasukStart = jam;
    }
    public Time getMasukStart(){
        return MasukStart;
    }
    public Time getKerjaStart() {
        return KerjaStart;
    }
    public void setKerjaStart(Time KerjaStart) {
        this.KerjaStart = KerjaStart;
    }
    public Time getKerjaEnd() {
        return KerjaEnd;
    }
    public void setKerjaEnd(Time KerjaEnd) {
        this.KerjaEnd = KerjaEnd;
    }
    public Time getKeluarEnd() {
        return KeluarEnd;
    }
    public void setKeluarEnd(Time KeluarEnd) {
        this.KeluarEnd = KeluarEnd;
    }
}
