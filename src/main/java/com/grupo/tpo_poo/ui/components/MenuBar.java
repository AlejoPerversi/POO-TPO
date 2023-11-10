package com.grupo.tpo_poo.ui.components;

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
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.grupo.tpo_poo.Main;

public class MenuBar extends JMenuBar implements ActionListener{
    JMenu themeMenu;
    JMenu darkThemes;
    JMenuItem draculaTheme;
    JMenuItem oneDarkTheme;
    JMenuItem gitHubDarkTheme;
    JMenuItem monokaiTheme;
    
    JMenu lightThemes;
    JMenuItem gitHubLightTheme;
    JMenuItem macLightTheme;


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

        monokaiTheme = new JMenuItem("Monokai Pro");
        monokaiTheme.addActionListener(this);

        darkThemes.add(oneDarkTheme);
        darkThemes.add(draculaTheme);
        darkThemes.add(gitHubDarkTheme);
        darkThemes.add(monokaiTheme);



        gitHubLightTheme = new JMenuItem("GitHub Light");
        gitHubLightTheme.addActionListener(this);

        macLightTheme = new JMenuItem("Mac Light");
        macLightTheme.addActionListener(this);

        lightThemes.add(macLightTheme);
        lightThemes.add(gitHubLightTheme);
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

        } else if (e.getSource() == monokaiTheme) {
            try {
                UIManager.setLookAndFeel(new FlatMonokaiProIJTheme());
                SwingUtilities.updateComponentTreeUI(Main.frame);
            } catch (UnsupportedLookAndFeelException exception) {
                exception.printStackTrace();
            }

        } else if (e.getSource() == macLightTheme) {
            try {
                UIManager.setLookAndFeel(new FlatMacLightLaf());
                SwingUtilities.updateComponentTreeUI(Main.frame);
            } catch (UnsupportedLookAndFeelException exception) {
                exception.printStackTrace();
            }

        } else if (e.getSource() == gitHubLightTheme) {
            try {
                UIManager.setLookAndFeel(new FlatGitHubIJTheme());
                SwingUtilities.updateComponentTreeUI(Main.frame);
            } catch (UnsupportedLookAndFeelException exception) {
                exception.printStackTrace();
            }
        } 
    }   
    
}
