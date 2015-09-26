package com.github.dev_brutus.bagel_ui.impl.listener;

import com.github.dev_brutus.bagel_ui.impl.DisplayWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 *
 */
public class ComponentListenerImpl implements ComponentListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(ComponentListenerImpl.class);

    private final DisplayWindow displayWindow;

    public ComponentListenerImpl(DisplayWindow displayWindow) {
        this.displayWindow = displayWindow;
    }

    @Override
    public void componentResized(ComponentEvent e) {
        LOGGER.debug("componentResized {}", e);
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        LOGGER.debug("componentMoved {}", e);
    }

    @Override
    public void componentShown(ComponentEvent e) {
        LOGGER.debug("componentShown {}", e);
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        LOGGER.debug("componentHidden {}", e);
    }
}
