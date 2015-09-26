package com.github.dev_brutus.bagel_ui.impl;

import com.github.dev_brutus.bagel_ui.api.Coord;
import com.github.dev_brutus.bagel_ui.impl.listener.ComponentListenerImpl;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Просто устройство для вывода
 */
public class DisplayWindowImpl extends JFrame implements DisplayWindow {

    private final BufferedImage image;
    private final DisplayImpl display;


    public DisplayWindowImpl(DisplayImpl display) throws IOException {
        this.display = display;

        InputStream resourceAsStream = DisplayWindowImpl.class.getResourceAsStream("/com/github/dev_brutus/bagel_ui/font.gif");
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

    @Override
    public void setSize(Coord size) {
        setSize(size.x * SYMBOL_WIDTH, size.y * SYMBOL_HEIGHT);
    }
}
