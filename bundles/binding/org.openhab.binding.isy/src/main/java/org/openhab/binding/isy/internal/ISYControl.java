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
package org.openhab.binding.isy.internal;

/**
 * UDControls that the ISY nodes understand. The ISY has a lot more commands for
 * node types that openHAB does not understand (yet)
 * 
 * @author Tim Diekmann
 * @since 1.10.0
 */
public enum ISYControl {
    ST,
    DON,
    DOF,
    OL,
    CLIMD,
    CLISPH,
    CLIHUM,
    CLIFRS,
    CLIFSO,
    CLIEMD,
    CLISPC,
    SEISMAG,
    ROTATE,
    PPW,
    USRNUM,
    ERR,
    WEIGHT,
    RESET,
    UOM,
    ELECRES,
    ADRPST,
    BUSY,
    BRT,
    CO2LVL,
    SECMD,
    RAINRT,
    LUMIN,
    SVOL,
    RR,
    CLIFS,
    CLITEMP,
    GPV,
    MOIST,
    DFON,
    BMAN,
    SOILT,
    WVOL,
    TANKCAP,
    DFOF,
    UAC,
    CPW,
    ANGLPOS,
    VOCLVL,
    SOLRAD,
    CLIHCS,
    TIMEREM,
    AIRFLOW,
    BATLVL,
    WATERT,
    WINDDIR,
    PULSCNT,
    DIM,
    CLISMD,
    PF,
    CV,
    TIDELVL,
    DISTANC,
    SPEED,
    UV,
    CC,
    BARPRES,
    SMAN,
    DEWPT,
    ATMPRES,
    TPW,
    GVOL,
    BEEP,
    SEISINT,
    ELECCON,
    ALARM,
    UNDEFINED
}
