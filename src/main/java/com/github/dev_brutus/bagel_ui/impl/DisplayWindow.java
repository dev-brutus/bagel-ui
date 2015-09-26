package com.github.dev_brutus.bagel_ui.impl;

import com.github.dev_brutus.bagel_ui.api.Coord;

/**
 *
 */
public interface DisplayWindow {
    int SYMBOL_HEIGHT = 16;
    int SYMBOL_WIDTH = 8;

    void setSize(Coord size);

    public void dispose();
}
