package com.grupo.tpo_poo.ui.components;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.grupo.tpo_poo.util.FontLoader;

public class Button extends JButton {
    
    public Button(String text, String tooltip, ActionListener actionListener) {
        this.setText(text);
        this.addActionListener(actionListener);
        this.setFocusable(false);
        this.setToolTipText(tooltip);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setFont(FontLoader.roboto);
    }

}
