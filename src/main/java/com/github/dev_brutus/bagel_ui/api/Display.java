package com.github.dev_brutus.bagel_ui.api;

/**
 * Основной интерфейс дисплея
 */
public interface Display {
    Coord getMinSize();

    void setMinSize(Coord size);

    Coord getMaxSize();

    void setMaxSize(Coord size);

    Coord getSize();

    void setSize(Coord size);

    boolean isSizeable();

    void setSizeable();

    byte getSymbol(Coord position);

    Color getSymbolColor(Coord position);

    Color getSymbolBackgroundColor(Coord position);

    SymbolInfo getSymbolInfo(Coord position);

    SymbolInfo[] getSymbolsInfo(Coord positionFrom, Coord positionTo);

    void setSymbol(Coord position, byte symbol);

    void setSymbolColor(Coord position, Color color);

    void setSymbolBackgroundColor(Coord position, Color backgroundColor);

    void setSymbolInfo(Coord position, SymbolInfo symbolInfo);

    void clearSymbol(Coord coord);

    void clearSymbol(Coord positionFrom, Coord positionTo);

    void clearUp(int y);

    void clearDown(int y);

    void clearLeft(int x);

    void clearRight(int x);

    void clearInvisible();

    void setViewPort(Coord coord);

    Coord getViewPort();

    void moveViewPortUp(int d);

    void moveViewPortDown(int d);

    void moveViewPortLeft(int d);

    void moveViewPortRight(int d);
}
