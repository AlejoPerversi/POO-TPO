package com.grupo.tpo_poo.ui;

import javax.swing.JFrame; 
import com.grupo.tpo_poo.ui.components.MenuBar;
import com.grupo.tpo_poo.ui.panels.TabbedPane;

public class Frame extends JFrame {
    public static final int WIDTH = 770;
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
        this.add(tabbedPane);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
}
