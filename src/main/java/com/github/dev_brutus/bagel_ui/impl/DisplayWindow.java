package com.github.dev_brutus.bagel_ui.impl;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class DisplayWindow extends JFrame {
    DisplayImpl display;

    public DisplayWindow(DisplayImpl display) {
        this.display = display;
        setName("Bagel UI");
        setBackground(Color.BLACK);
        setVisible(true);
    }
}
