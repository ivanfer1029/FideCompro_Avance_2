package com.mycompany.fidecompro;

import com.mycompany.fidecompro.vistas.FrmLogin;

public class FideCompro {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            FrmLogin login = new FrmLogin();
            login.setVisible(true);
        });
    }
}