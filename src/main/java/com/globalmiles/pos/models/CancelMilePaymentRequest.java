/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CancelMilePaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 102560435036281197L;
    private String terminalId;
    /** GETTER
     * Terminal ID.
     */
    @JsonGetter("terminal_id")
    public String getTerminalId ( ) { 
        return this.terminalId;
    }
    
    /** SETTER
     * Terminal ID.
     */
    @JsonSetter("terminal_id")
    public void setTerminalId (String value) { 
        this.terminalId = value;
    }
 
}
 