package com.hk.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class dbConnection {

    private Connection cnx = null;

    public dbConnection() {
        getConnection();
    }

    public Connection getConnection() { 
        try {
            Class.forName("org.sqlite.JDBC");
            cnx = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoSCS\\db\\sistemadb.s3db");
            //cnx = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\klozano\\Documents\\NetBeansProjects\\ProjectoGESTI\\db\\sistemadb.s3db");
        } catch (ClassNotFoundException | SQLException e) {
        } finally {
            try {
                if(cnx != null)
                    cnx.close();
            }catch(SQLException ex){
            }
        }
        return cnx;
    }

    public int connectionStatus() {
        if (cnx == null) {
            return 0;
        }
        return 1;
    }
}
