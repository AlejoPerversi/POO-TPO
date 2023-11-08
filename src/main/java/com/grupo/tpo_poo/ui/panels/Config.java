package com.grupo.tpo_poo.ui.panels;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.grupo.tpo_poo.ui.components.CheckBox;

public class Config extends JPanel {
    public static CheckBox clearFields;
    public static CheckBox guardarAlSalir;

    public Config() {
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        clearFields = new CheckBox("Borrar campos al agregar");
        guardarAlSalir = new CheckBox("Guardar a csv al salir");

        this.add(clearFields);
        this.add(guardarAlSalir);
    }

}
