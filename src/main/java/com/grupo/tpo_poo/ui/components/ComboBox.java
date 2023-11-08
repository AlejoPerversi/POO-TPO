package com.grupo.tpo_poo.ui.components;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ComboBox<T> extends JComboBox<T> {
    public ComboBox(T[] items) {
        super(new DefaultComboBoxModel<>(items));
        this.setFont(new Font("Roboto", Font.PLAIN, 15));
    }

    public ComboBox() {
        this.setFont(new Font("Roboto", Font.PLAIN, 15));
    }

}
