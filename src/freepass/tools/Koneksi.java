package freepass.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Koneksi {
    private final String NAMA_FILE = "config.properties";
    private Koneksi() {}
    public static Koneksi getInstance() {
        return KoneksiHolder.INSTANCE;
    }

    private static class KoneksiHolder {
        private static final Koneksi INSTANCE = new Koneksi();
    }

    public Connection getKoneksi() {
        File file = new File(NAMA_FILE);
        Connection mySqlKonek = null;
        String driver = "com.mysql.jdbc.Driver";

        if (file.exists()) {
            FileInputStream fis;
            try {
                //membaca file config.properties
                fis = new FileInputStream(NAMA_FILE);
                Properties properti = new Properties();
                properti.load(fis);
                
                //string dbnya : "jdbc:mysql://localhost:3306/saygonfreepass"
                String DB = "jdbc:mysql://"
                        + properti.getProperty("host") + ":"
                        + properti.getProperty("port")
                        + "/" + properti.getProperty("database");
                String user =properti.getProperty("user");
                String password = properti.getProperty("password");
                Class.forName(driver);
                
                //koneksinya
                mySqlKonek = DriverManager.getConnection(DB,user,password);
            } catch (SQLException | ClassNotFoundException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return mySqlKonek;
    }
}
