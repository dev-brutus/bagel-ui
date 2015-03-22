package com.github.dev_brutus.bagel_ui.api;

/**
 *
 */
public class SymbolInfo {
    final byte symbol;
    final Color color;
    final Color backgroundColor;
    final boolean isBlink;

    public SymbolInfo(byte symbol, Color color, Color backgroundColor, boolean isBlink) {
        this.symbol = symbol;
        this.color = color;
        this.backgroundColor = backgroundColor;
        this.isBlink = isBlink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SymbolInfo that = (SymbolInfo) o;

        if (isBlink != that.isBlink) return false;
        if (symbol != that.symbol) return false;
        if (backgroundColor != that.backgroundColor) return false;
        if (color != that.color) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) symbol;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (backgroundColor != null ? backgroundColor.hashCode() : 0);
        result = 31 * result + (isBlink ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SymbolInfo{" +
                "symbol=" + symbol +
                ", color=" + color +
                ", backgroundColor=" + backgroundColor +
                ", isBlink=" + isBlink +
                '}';
    }
}
