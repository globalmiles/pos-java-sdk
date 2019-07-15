/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CompleteMilePaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 3571759528671590136L;
    private String terminalId;
    private String otp;
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
 
    /** GETTER
     * One time password that sends to customer phone.
     */
    @JsonGetter("otp")
    public String getOtp ( ) { 
        return this.otp;
    }
    
    /** SETTER
     * One time password that sends to customer phone.
     */
    @JsonSetter("otp")
    public void setOtp (String value) { 
        this.otp = value;
    }
 
}
