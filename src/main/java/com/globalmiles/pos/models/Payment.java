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
    private static final long serialVersionUID = -9094944060620378703L;
    private double payAmount;
    private String paymentType;
    private Integer milesPaymentProvisionId;
    /** GETTER
     * Amount of the payment.
     */
    @JsonGetter("pay_amount")
    public double getPayAmount ( ) { 
        return this.payAmount;
    }
    
    /** SETTER
     * Amount of the payment.
     */
    @JsonSetter("pay_amount")
    public void setPayAmount (double value) { 
        this.payAmount = value;
    }
 
    /** GETTER
     * Type of the payment.
     */
    @JsonGetter("payment_type")
    public String getPaymentType ( ) { 
        return this.paymentType;
    }
    
    /** SETTER
     * Type of the payment.
     */
    @JsonSetter("payment_type")
    public void setPaymentType (String value) { 
        this.paymentType = value;
    }
 
    /** GETTER
     * Provision ID for pay with miles.
     */
    @JsonGetter("miles_payment_provision_id")
    public Integer getMilesPaymentProvisionId ( ) { 
        return this.milesPaymentProvisionId;
    }
    
    /** SETTER
     * Provision ID for pay with miles.
     */
    @JsonSetter("miles_payment_provision_id")
    public void setMilesPaymentProvisionId (Integer value) { 
        this.milesPaymentProvisionId = value;
    }
 
}
 