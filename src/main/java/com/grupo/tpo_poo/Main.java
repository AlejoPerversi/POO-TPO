package com.grupo.tpo_poo;

import com.grupo.tpo_poo.ui.Frame;
import com.grupo.tpo_poo.producto.Catalogo;
import com.grupo.tpo_poo.util.FontLoader;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;

public class Main { 
    private static Frame frame;
    public static Catalogo catalogo;
    public static FontLoader fontLoader;

    public static void main(String[] args) {
        FlatAtomOneDarkIJTheme.setup();
        frame = new Frame();
        catalogo = new Catalogo();
        fontLoader = new FontLoader();

    }
}
