/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.persistence.caldav.internal;

import java.text.DateFormat;
import java.util.Date;

import org.openhab.core.persistence.HistoricItem;
import org.openhab.core.types.State;
import org.openhab.io.caldav.CalDavEvent;

/**
 * This is a Java bean used to persist item states with timestamps in calDAV.
 *
 * @author Robert Delbrück
 * @since 1.8.0
 *
 */
public class CaldavItem implements HistoricItem {

    private String name;
    private State state;
    private Date timestamp;
    private CalDavEvent event;

    public CaldavItem() {
        super();
    }

    public CaldavItem(String name, State state, Date timestamp) {
        super();
        this.name = name;
        this.state = state;
        this.timestamp = timestamp;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public CalDavEvent getEvent() {
        return event;
    }

    public void setEvent(CalDavEvent event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return DateFormat.getDateTimeInstance().format(timestamp) + ": " + name + " -> " + state.toString();
    }
}
