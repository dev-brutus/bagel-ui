package com.github.dev_brutus.bagel_ui.impl;

import com.github.dev_brutus.bagel_ui.api.Color;
import com.github.dev_brutus.bagel_ui.api.Coord;
import com.github.dev_brutus.bagel_ui.api.Display;
import com.github.dev_brutus.bagel_ui.api.SymbolInfo;

import java.io.IOException;

/**
 *
 */
public class DisplayImpl implements Display {
    private DisplayWindow displayWindow;

    public void start() throws IOException {
        displayWindow = new DisplayWindow(this);
    }

    public void stop() {
        displayWindow.dispose();
    }


    @Override
    public Coord getMinSize() {
        return null;
    }

    @Override
    public void setMinSize(Coord size) {

    }

    @Override
    public Coord getMaxSize() {
        return null;
    }

    @Override
    public void setMaxSize(Coord size) {

    }

    @Override
    public Coord getSize() {
        return null;
    }

    @Override
    public void setSize(Coord size) {

    }

    @Override
    public boolean isSizeable() {
        return false;
    }

    @Override
    public void setSizeable() {

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
    public void setViewPort(Coord coord) {

    }

    @Override
    public Coord getViewPort() {
        return null;
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
