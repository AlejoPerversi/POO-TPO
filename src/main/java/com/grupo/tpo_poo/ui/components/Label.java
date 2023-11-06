package com.grupo.tpo_poo.ui.components;

import javax.swing.JLabel;
import com.grupo.tpo_poo.util.FontLoader;

public class Label extends JLabel {
    
    public Label(String text) {
        this.setText(text);
        this.setFont(FontLoader.roboto);
    }

}
