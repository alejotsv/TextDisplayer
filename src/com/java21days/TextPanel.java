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
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        comp2D.drawString(text, 60, 140);
        Font font = new Font("Comic Sans", Font.BOLD + Font.ITALIC, 14);
        FontMetrics fontMetrics = getFontMetrics(font);
        System.out.println(fontMetrics.getFont().getName());
        System.out.println(fontMetrics.getHeight());
        comp2D.setFont(font);
        comp2D.drawString("With a different font", 60, 40);
    }
}
