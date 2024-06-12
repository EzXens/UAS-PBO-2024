package com.uas.pbo;


public class Uass {

    public static void main(String[] args) {
        // Create and display the login form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }
}
    