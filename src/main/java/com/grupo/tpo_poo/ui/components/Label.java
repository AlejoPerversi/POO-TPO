package com.grupo.tpo_poo.ui.components;

import java.awt.Font;
import javax.swing.JLabel;

public class Label extends JLabel {
    
    public Label(String text) {
        this.setText(text);
        this.setFont(new Font("Roboto", Font.PLAIN, 15));
    }

}
