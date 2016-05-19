/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.control;

/**
 *
 * @author nufail
 */
public class ControlFreepass {
    private int jmTiket;
    private String nip;
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getNip(){
        return this.nip;
    }
    public void setjmTiket(int jmTiket){
        this.jmTiket = jmTiket;
    }
    public int getjmTiket(){
        return this.jmTiket;
    }
}
