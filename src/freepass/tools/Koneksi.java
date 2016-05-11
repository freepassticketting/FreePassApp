/*
 * Copyright (C) 2016 cahya
 *
 * Program ini adalah Aplikasi Gratis, Anda dapat Mengembangkan atau
 * merubah sebagian atau seluruh kode, dengan seizin pengembang.
 *
 * Program ini dikembangkan dengan harapan agar bermanfaat,
 * tapi tanpa GARANSI apapun.
 */
package freepass.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * Koneksi digunakan untuk mendapatkan instance koneksi ke database.
 *
 * @author cahya
 */
public class Koneksi {

    private final String NAMA_FILE = "config.properties";

    private Koneksi() {
    }

    public static Koneksi getInstance() {
        return KoneksiHolder.INSTANCE;
    }

    private static class KoneksiHolder {

        private static final Koneksi INSTANCE = new Koneksi();
    }

    public Connection getKoneksi() {
        File file = new File(NAMA_FILE);
        Connection conn = null;
        String driver = "com.mysql.jdbc.Driver";

        if (file.exists()) {
            FileInputStream fis;
            try {
                fis = new FileInputStream(NAMA_FILE);
                Properties properti = new Properties();
                properti.load(fis);

                Class.forName(driver);
                conn = DriverManager.getConnection("jdbc:mysql://"
                        + properti.getProperty("host") + ":"
                        + properti.getProperty("port")
                        + "/" + properti.getProperty("database"),
                        properti.getProperty("user"),
                        properti.getProperty("password"));
            } catch (SQLException | ClassNotFoundException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return conn;
    }
}
