package com.java21days;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    String text;

    TextPanel(String text){
        super();
        this.text = text;
    }

    @Override
    public void paintComponent(Graphics comp){
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.drawString(text, 10, 60);
    }
}
