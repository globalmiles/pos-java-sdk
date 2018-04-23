/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CancelMilePaymentResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5521013597462609701L;
    private int returnCode;
    private String returnDesc;
    /** GETTER
     * 0  Success, 1 and bigger than 1 unsuccessful
     */
    @JsonGetter("returnCode")
    public int getReturnCode ( ) { 
        return this.returnCode;
    }
    
    /** SETTER
     * 0  Success, 1 and bigger than 1 unsuccessful
     */
    @JsonSetter("returnCode")
    public void setReturnCode (int value) { 
        this.returnCode = value;
    }
 
    /** GETTER
     * if success return is empty. if unsuccessful it returns error message
     */
    @JsonGetter("returnDesc")
    public String getReturnDesc ( ) { 
        return this.returnDesc;
    }
    
    /** SETTER
     * if success return is empty. if unsuccessful it returns error message
     */
    @JsonSetter("returnDesc")
    public void setReturnDesc (String value) { 
        this.returnDesc = value;
    }
 
}
 