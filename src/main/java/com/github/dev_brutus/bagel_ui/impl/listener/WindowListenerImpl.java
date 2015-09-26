package com.github.dev_brutus.bagel_ui.impl.listener;

import com.github.dev_brutus.bagel_ui.impl.DisplayWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 */
public class WindowListenerImpl implements WindowListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(WindowListenerImpl.class);

    private final DisplayWindow displayWindow;

    public WindowListenerImpl(DisplayWindow displayWindow) {
        this.displayWindow = displayWindow;
    }

    @Override
    public void windowActivated(WindowEvent e) {
        LOGGER.debug("Window activated {}", e);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        LOGGER.debug("Window opened {}", e);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        LOGGER.debug("Window closing {}", e);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        LOGGER.debug("Window closed {}", e);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        LOGGER.debug("Window iconified {}", e);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        LOGGER.debug("Window deiconified {}", e);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        LOGGER.debug("Window deactivated {}", e);
    }
}
