package com.github.dev_brutus.bagel_ui.app;

import com.github.dev_brutus.bagel_ui.api.Display;
import com.github.dev_brutus.bagel_ui.api.DisplayBuilder;

import java.io.IOException;

import static com.github.dev_brutus.bagel_ui.api.Coord.coord;

/**
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        Display display = new DisplayBuilder().setSize(coord(10, 5)).build();
        display.start();
    }
}
