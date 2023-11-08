package com.grupo.tpo_poo.ui.input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.grupo.tpo_poo.Main;


public class MenuBar extends JMenuBar implements ActionListener{

    JMenu themeMenu;
    JMenu darkThemes;
    JMenu lightThemes;
    JMenuItem draculaTheme;
    JMenuItem oneDarkTheme;
    JMenuItem gitHubDarkTheme;
    JMenuItem materialTheme;

    public MenuBar() {
        themeMenu = new JMenu("Theme");
        this.add(themeMenu);

        darkThemes = new JMenu("Dark");
        lightThemes = new JMenu("Light");

        themeMenu.add(darkThemes);
        themeMenu.add(lightThemes);

        draculaTheme = new JMenuItem("Dracula");
        draculaTheme.addActionListener(this);

        oneDarkTheme = new JMenuItem("One Dark");
        oneDarkTheme.addActionListener(this);

        gitHubDarkTheme = new JMenuItem("GitHub Dark");
        gitHubDarkTheme.addActionListener(this);

        materialTheme = new JMenuItem("Material Darker");
        materialTheme.addActionListener(this);

        darkThemes.add(draculaTheme);
        darkThemes.add(oneDarkTheme);
        darkThemes.add(gitHubDarkTheme);
        darkThemes.add(materialTheme);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == draculaTheme) {
            try {
                UIManager.setLookAndFeel(new FlatDraculaIJTheme());
                SwingUtilities.updateComponentTreeUI(Main.frame);
            } catch (UnsupportedLookAndFeelException exception) {
                exception.printStackTrace();
            }

        } else if (e.getSource() == oneDarkTheme) {
            try {
                UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
                SwingUtilities.updateComponentTreeUI(Main.frame);
            } catch (UnsupportedLookAndFeelException exception) {
                exception.printStackTrace();
            }

        } else if (e.getSource() == gitHubDarkTheme) {
            try {
                UIManager.setLookAndFeel(new FlatGitHubDarkIJTheme());
                SwingUtilities.updateComponentTreeUI(Main.frame);
            } catch (UnsupportedLookAndFeelException exception) {
                exception.printStackTrace();
            }

        } else if (e.getSource() == materialTheme) {
            try {
                UIManager.setLookAndFeel(new FlatMaterialDarkerIJTheme());
                SwingUtilities.updateComponentTreeUI(Main.frame);
            } catch (UnsupportedLookAndFeelException exception) {
                exception.printStackTrace();
            }
        }
    }   
    
}
