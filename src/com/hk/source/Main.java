package com.hk.source;

import com.hk.dbc.dbConnection;
import com.hk.gui.guiMainMenu;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        dbConnection dbs = new dbConnection();          // Intanciar un objeto de conexion con la db

        if (dbs.connectionStatus() == 1) {              // Comprobar si hay una conexxion con la db
            guiMainMenu mm = new guiMainMenu();         // Instanciar un objeto de la clase MenuPrincipal
            mm.setVisible(true);                      // Hacer visible la ventana
        } else
            JOptionPane.showMessageDialog(null, "Hubo un error al conectar con la Base de Datos", "Error", 2);
    }
}
