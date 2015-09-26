package com.github.dev_brutus.bagel_ui.impl;

import com.github.dev_brutus.bagel_ui.impl.listener.ComponentListenerImpl;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 */
public class DisplayWindow extends JFrame {
    public static final int SYMBOL_HEIHGT = 16;
    public static final int SYMBOL_WIDTH = 8;

    private final BufferedImage image;
    private final DisplayImpl display;


    public DisplayWindow(DisplayImpl display) throws IOException {
        this.display = display;

        InputStream resourceAsStream = DisplayWindow.class.getResourceAsStream("/com/github/dev_brutus/bagel_ui/font.gif");
        image = ImageIO.read(resourceAsStream);
        resourceAsStream.close();

        addComponentListener(new ComponentListenerImpl(this));
//        addWindowListener(new WindowListenerImpl(this));
//        addWindowStateListener(new WindowStateListenerImpl(this));
//        addPropertyChangeListener(new PropertyChangeListenerImpl(this));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setName("Bagel UI");
        setBackground(Color.BLACK);
        setVisible(true);
    }
}
