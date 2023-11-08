package com.grupo.tpo_poo.ui.components;

import javax.swing.JCheckBox;
import java.awt.Font;

public class CheckBox extends JCheckBox {
    public CheckBox(String text) {
        super(text);
        this.setFont(new Font("Roboto", Font.PLAIN, 15));
        this.setSelected(true);
    }
}
