package com.grupo.tpo_poo.ui;

import javax.swing.JFrame;

import com.grupo.tpo_poo.ui.input.MenuBar;

public class Frame extends JFrame {
    public static final int WIDTH = 750;
    public static final int HEIGHT = 600;
    public static TabbedPane tabbedPane;
    MenuBar menuBar;

    public Frame() {
        tabbedPane = new TabbedPane();
        menuBar = new MenuBar();

        this.setTitle("Market All");
        this.setSize(new java.awt.Dimension(WIDTH, HEIGHT));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.add(tabbedPane);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
}
