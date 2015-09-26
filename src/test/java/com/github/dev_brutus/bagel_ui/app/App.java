package com.github.dev_brutus.bagel_ui.app;

import com.github.dev_brutus.bagel_ui.impl.DisplayImpl;

import java.io.IOException;

/**
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        new DisplayImpl().start();
    }
}
