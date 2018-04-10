/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Payment 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5040667698623368249L;
    private int payAmount;
    private int paymentType;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("payAmount")
    public int getPayAmount ( ) { 
        return this.payAmount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("payAmount")
    public void setPayAmount (int value) { 
        this.payAmount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paymentType")
    public int getPaymentType ( ) { 
        return this.paymentType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paymentType")
    public void setPaymentType (int value) { 
        this.paymentType = value;
    }
 
}
 