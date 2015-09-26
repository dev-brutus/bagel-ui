package com.github.dev_brutus.bagel_ui.impl.listener;

import com.github.dev_brutus.bagel_ui.impl.DisplayWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 */
public class PropertyChangeListenerImpl implements PropertyChangeListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyChangeListenerImpl.class);

    private final DisplayWindow displayWindow;

    public PropertyChangeListenerImpl(DisplayWindow displayWindow) {
        this.displayWindow = displayWindow;
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        LOGGER.debug("Property change {}: {}", event.getPropertyName(), event);
    }
}
