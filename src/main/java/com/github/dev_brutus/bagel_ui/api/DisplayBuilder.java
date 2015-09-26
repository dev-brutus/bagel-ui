package com.github.dev_brutus.bagel_ui.api;

import com.github.dev_brutus.bagel_ui.impl.DisplayImpl;

/**
 *
 */
public class DisplayBuilder {
    private Coord size;
    private Coord maxSize;
    private Coord minSize;

    public DisplayBuilder setSize(Coord size) {
        this.size = size;
        return this;
    }

    public DisplayBuilder setMaxSize(Coord size) {
        this.maxSize = size;
        return this;
    }

    public DisplayBuilder setMinSize(Coord size) {
        this.minSize = size;
        return this;
    }

    public Display build() {
        DisplayImpl result = new DisplayImpl();
        if (size != null) {
            result.setSize(size);
        }
        if (maxSize != null) {
            result.setMaxSize(maxSize);
        }
        if (minSize != null) {
            result.setMinSize(minSize);
        }
        return result;
    }
}
