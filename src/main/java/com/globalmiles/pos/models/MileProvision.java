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
public class MileProvision 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6540298654490986374L;
    private int milesPaymentProvisionId;
    private double usedMilesAsAmount;
    private String currency;
    private String dateTime;
    /** GETTER
     * Provision ID
     */
    @JsonGetter("miles_payment_provision_id")
    public int getMilesPaymentProvisionId ( ) { 
        return this.milesPaymentProvisionId;
    }
    
    /** SETTER
     * Provision ID
     */
    @JsonSetter("miles_payment_provision_id")
    public void setMilesPaymentProvisionId (int value) { 
        this.milesPaymentProvisionId = value;
    }
 
    /** GETTER
     * Used amount
     */
    @JsonGetter("used_miles_as_amount")
    public double getUsedMilesAsAmount ( ) { 
        return this.usedMilesAsAmount;
    }
    
    /** SETTER
     * Used amount
     */
    @JsonSetter("used_miles_as_amount")
    public void setUsedMilesAsAmount (double value) { 
        this.usedMilesAsAmount = value;
    }
 
    /** GETTER
     * ISO-4217 3-letter currency code.
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * ISO-4217 3-letter currency code.
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * Date time of the mile provision.
     */
    @JsonGetter("date_time")
    public String getDateTime ( ) { 
        return this.dateTime;
    }
    
    /** SETTER
     * Date time of the mile provision.
     */
    @JsonSetter("date_time")
    public void setDateTime (String value) { 
        this.dateTime = value;
    }
 
}
