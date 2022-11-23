package com.java21days;

import javax.swing.*;
import java.awt.*;

public class TextDisplayer extends JFrame {
    Dimension dim = new Dimension(300, 300);

    TextDisplayer(String text){
        super("Text Displayer");
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }
}
