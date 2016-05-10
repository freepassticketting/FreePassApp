package freepass.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class konek {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        //cek apakak koneksi null
        if(koneksi == null){
            
            try {
                String url;
                url = "jdbc:mysql://localhost:3306/saygonfreepass";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url,user,password);
            } catch (SQLException t){
                JOptionPane.showMessageDialog(null, "Eror Membuat Koneksi");
            }
        }
        
        return koneksi;
                
    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
