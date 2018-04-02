/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetBonusProvisionsRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4996629725074722154L;
    private String readCode;
    private String readCodeType;
    private String oKCSicilNo;
    /** GETTER
     * Müşteri tanıma tercihi, Telefon numarası, QR code gibi
     */
    @JsonGetter("readCode")
    public String getReadCode ( ) { 
        return this.readCode;
    }
    
    /** SETTER
     * Müşteri tanıma tercihi, Telefon numarası, QR code gibi
     */
    @JsonSetter("readCode")
    public void setReadCode (String value) { 
        this.readCode = value;
    }
 
    /** GETTER
     * 1: Telefon numarası, 2: Müşteri unique identifier, 3: Diğer
     */
    @JsonGetter("readCodeType")
    public String getReadCodeType ( ) { 
        return this.readCodeType;
    }
    
    /** SETTER
     * 1: Telefon numarası, 2: Müşteri unique identifier, 3: Diğer
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
 