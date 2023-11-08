package com.grupo.tpo_poo.ui.input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import com.grupo.tpo_poo.ui.TabbedPane;

public class MenuBar extends JMenuBar implements ActionListener{

    JMenu goMenu;
    JMenuItem irCatalogo;
    JMenuItem irVentas;

    public MenuBar() {
        goMenu = new JMenu("Go");
        this.add(goMenu);

        irCatalogo = new JMenuItem("Catalogo");
        irVentas = new JMenuItem("Ventas");
        irCatalogo.addActionListener(this);
        irVentas.addActionListener(this);
        goMenu.add(irCatalogo);
        goMenu.add(irVentas);

    }

    public void actionPerformed(ActionEvent e) {

    }
    
}
