package com.grupo.tpo_poo;

import com.grupo.tpo_poo.ui.Frame;
import com.grupo.tpo_poo.producto.Catalogo;
import com.grupo.tpo_poo.util.ShutdownHook;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;

public class Main { 
    public static Frame frame;
    public static Catalogo catalogo;
    private static ShutdownHook shutdownHook;

    public static void main(String[] args) {
        FlatDraculaIJTheme.setup();
        frame = new Frame();
        catalogo = new Catalogo();
        shutdownHook  = new ShutdownHook();
        
    }
}
