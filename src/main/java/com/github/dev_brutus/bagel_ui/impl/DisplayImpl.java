package com.github.dev_brutus.bagel_ui.impl;

import com.github.dev_brutus.bagel_ui.api.Color;
import com.github.dev_brutus.bagel_ui.api.Coord;
import com.github.dev_brutus.bagel_ui.api.Display;
import com.github.dev_brutus.bagel_ui.api.SymbolInfo;

import java.io.IOException;

import static com.github.dev_brutus.bagel_ui.api.Coord.coord;

/**
 *  Релизует всё логику
 */
public class DisplayImpl implements Display {
    private DisplayWindow displayWindow = new DisplayWindowStub();
    private Coord size = coord(40, 25);
    private Coord minSize;
    private Coord maxSize;
    private boolean isResizable = true;

    @Override
    public void start() throws IOException {
        displayWindow = new DisplayWindowImpl(this);
        displayWindow.setSize(size);
    }

    @Override
    public void stop() {
        displayWindow.dispose();
    }

    @Override
    public Coord getSize() {
        return size;
    }

    @Override
    public void setSize(Coord size) {
        if (isResizable) {
            int x = size.x;
            int y = size.y;
            if (minSize != null) {
                x = Math.max(minSize.x, x);
                y = Math.max(minSize.y, y);
            }
            if (maxSize != null) {
                x = Math.min(maxSize.x, x);
                y = Math.min(maxSize.y, y);
            }

            this.size = coord(x, y);
            displayWindow.setSize(this.size);
        }
    }

    @Override
    public boolean isResizable() {
        return isResizable;
    }

    @Override
    public void setResizable(boolean isResizable) {
        this.isResizable = isResizable;
    }

    @Override
    public Coord getMaxSize() {
        return maxSize;
    }

    @Override
    public void setMaxSize(Coord maxSize) {
        this.maxSize = maxSize;
        if (maxSize != null) {
            this.size = (coord(Math.min(size.x, maxSize.x), Math.min(size.y, maxSize.y)));
            displayWindow.setSize(this.size);
        }
    }

    @Override
    public Coord getMinSize() {
        return minSize;
    }

    @Override
    public void setMinSize(Coord minSize) {
        this.minSize = minSize;
        if (minSize != null) {
            this.size = (coord(Math.max(size.x, minSize.x), Math.max(size.y, minSize.y)));
            displayWindow.setSize(this.size);
        }
    }

    @Override
    public byte getSymbol(Coord position) {
        return 0;
    }

    @Override
    public Color getSymbolColor(Coord position) {
        return null;
    }

    @Override
    public Color getSymbolBackgroundColor(Coord position) {
        return null;
    }

    @Override
    public SymbolInfo getSymbolInfo(Coord position) {
        return null;
    }

    @Override
    public SymbolInfo[] getSymbolsInfo(Coord positionFrom, Coord positionTo) {
        return new SymbolInfo[0];
    }

    @Override
    public void setSymbol(Coord position, byte symbol) {

    }

    @Override
    public void setSymbolColor(Coord position, Color color) {

    }

    @Override
    public void setSymbolBackgroundColor(Coord position, Color backgroundColor) {

    }

    @Override
    public void setSymbolInfo(Coord position, SymbolInfo symbolInfo) {

    }

    @Override
    public void clearSymbol(Coord coord) {

    }

    @Override
    public void clearSymbol(Coord positionFrom, Coord positionTo) {

    }

    @Override
    public void clearUp(int y) {

    }

    @Override
    public void clearDown(int y) {

    }

    @Override
    public void clearLeft(int x) {

    }

    @Override
    public void clearRight(int x) {

    }

    @Override
    public void clearInvisible() {

    }

    @Override
    public Coord getViewPort() {
        return null;
    }

    @Override
    public void setViewPort(Coord coord) {

    }

    @Override
    public void moveViewPortUp(int d) {

    }

    @Override
    public void moveViewPortDown(int d) {

    }

    @Override
    public void moveViewPortLeft(int d) {

    }

    @Override
    public void moveViewPortRight(int d) {

    }
}
