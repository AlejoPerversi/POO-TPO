package com.grupo.tpo_poo.ui;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    TabbedPane tabbedPane;

    public Frame() {
        tabbedPane = new TabbedPane();

        this.setTitle("Market All");
        this.setSize(new java.awt.Dimension(WIDTH, HEIGHT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(tabbedPane);

        this.setVisible(true);
    }
}
