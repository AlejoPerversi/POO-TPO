package com.grupo.tpo_poo;

import com.grupo.tpo_poo.ui.Frame;
import com.grupo.tpo_poo.producto.Catalogo;
import com.grupo.tpo_poo.producto.Ventas;
import com.grupo.tpo_poo.util.ShutdownHook;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;

public class Main { 
    public static Frame frame;
    public static Catalogo catalogo;
    public static Ventas ventas;
    private static ShutdownHook shutdownHook;

    public static void main(String[] args) {
        FlatAtomOneDarkIJTheme.setup();
        frame = new Frame();
        catalogo = new Catalogo();
        ventas = new Ventas();
        shutdownHook  = new ShutdownHook();

    }
}
