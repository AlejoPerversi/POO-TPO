package com.grupo.tpo_poo.util;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class FontLoader {
    public static Font roboto;

    public FontLoader() {

        try {
            roboto = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/resources/fonts/Roboto-Regular.ttf"));
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

    }

}
