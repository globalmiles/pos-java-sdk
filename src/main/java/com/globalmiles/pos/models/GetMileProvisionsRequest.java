/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetMileProvisionsRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5564499883750324383L;
    private String readCode;
    private String readCodeType;
    private String oKCSicilNo;
    /** GETTER
     * Customer Identification Method ; GSM NO, Customer Unique ID or CODE
     */
    @JsonGetter("readCode")
    public String getReadCode ( ) { 
        return this.readCode;
    }
    
    /** SETTER
     * Customer Identification Method ; GSM NO, Customer Unique ID or CODE
     */
    @JsonSetter("readCode")
    public void setReadCode (String value) { 
        this.readCode = value;
    }
 
    /** GETTER
     * 1: GSM NO, 2: Customer unique identifier, 3: CODE
     */
    @JsonGetter("readCodeType")
    public String getReadCodeType ( ) { 
        return this.readCodeType;
    }
    
    /** SETTER
     * 1: GSM NO, 2: Customer unique identifier, 3: CODE
     */
    @JsonSetter("readCodeType")
    public void setReadCodeType (String value) { 
        this.readCodeType = value;
    }
 
    /** GETTER
     * Terminal code.
     */
    @JsonGetter("OKCSicilNo")
    public String getOKCSicilNo ( ) { 
        return this.oKCSicilNo;
    }
    
    /** SETTER
     * Terminal code.
     */
    @JsonSetter("OKCSicilNo")
    public void setOKCSicilNo (String value) { 
        this.oKCSicilNo = value;
    }
 
}
 