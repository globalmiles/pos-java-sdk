/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCustomerInfoRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4850047946992056284L;
    private String readCode;
    private int readCodeType;
    private int totalAmount;
    private int totalVATAmount;
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
    public int getReadCodeType ( ) { 
        return this.readCodeType;
    }
    
    /** SETTER
     * 1: GSM NO, 2: Customer unique identifier, 3: CODE
     */
    @JsonSetter("readCodeType")
    public void setReadCodeType (int value) { 
        this.readCodeType = value;
    }
 
    /** GETTER
     * Total receipt amount.  ex:12.34 TL == 1234
     */
    @JsonGetter("totalAmount")
    public int getTotalAmount ( ) { 
        return this.totalAmount;
    }
    
    /** SETTER
     * Total receipt amount.  ex:12.34 TL == 1234
     */
    @JsonSetter("totalAmount")
    public void setTotalAmount (int value) { 
        this.totalAmount = value;
    }
 
    /** GETTER
     * Total Tax Value. EX:1.34 TL == 134
     */
    @JsonGetter("totalVATAmount")
    public int getTotalVATAmount ( ) { 
        return this.totalVATAmount;
    }
    
    /** SETTER
     * Total Tax Value. EX:1.34 TL == 134
     */
    @JsonSetter("totalVATAmount")
    public void setTotalVATAmount (int value) { 
        this.totalVATAmount = value;
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
 