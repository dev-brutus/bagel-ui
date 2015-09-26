package com.github.dev_brutus.bagel_ui.api;

/**
 *
 */
public class Coord {
    public final int x;
    public final int y;
    private String s;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coord coord(int x, int y) {
        return new Coord(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coord coord = (Coord) o;

        if (x != coord.x) return false;
        if (y != coord.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        if (s == null) {
            s = "(" + x + "; " + y + ')';
        }

        return s;
    }
}
