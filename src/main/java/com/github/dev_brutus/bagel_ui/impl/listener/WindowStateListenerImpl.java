package com.github.dev_brutus.bagel_ui.impl.listener;

import com.github.dev_brutus.bagel_ui.impl.DisplayWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/**
 *
 */
public class WindowStateListenerImpl implements WindowStateListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(WindowStateListenerImpl.class);

    private final DisplayWindow displayWindow;

    public WindowStateListenerImpl(DisplayWindow displayWindow) {
        this.displayWindow = displayWindow;
    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        LOGGER.debug("Change state {}", e);
    }
}
