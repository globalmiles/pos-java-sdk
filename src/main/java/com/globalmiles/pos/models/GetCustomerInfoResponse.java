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
public class GetCustomerInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4611362800414048015L;
    private int returnCode;
    private String returnDesc;
    private int recognitionId;
    private double availableMilesAsAmount;
    private double loyaltyDiscountedTotalAmount;
    private String currency;
    /** GETTER
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    @JsonGetter("return_code")
    public int getReturnCode ( ) { 
        return this.returnCode;
    }
    
    /** SETTER
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    @JsonSetter("return_code")
    public void setReturnCode (int value) { 
        this.returnCode = value;
    }
 
    /** GETTER
     * if success return is empty. if unsuccessful it returns error message.
     */
    @JsonGetter("return_desc")
    public String getReturnDesc ( ) { 
        return this.returnDesc;
    }
    
    /** SETTER
     * if success return is empty. if unsuccessful it returns error message.
     */
    @JsonSetter("return_desc")
    public void setReturnDesc (String value) { 
        this.returnDesc = value;
    }
 
    /** GETTER
     * Session based user identification number.
     */
    @JsonGetter("recognition_id")
    public int getRecognitionId ( ) { 
        return this.recognitionId;
    }
    
    /** SETTER
     * Session based user identification number.
     */
    @JsonSetter("recognition_id")
    public void setRecognitionId (int value) { 
        this.recognitionId = value;
    }
 
    /** GETTER
     * The available miles as an amount that the customer can use in this transaction which is calculated from customer's current miles.
     */
    @JsonGetter("available_miles_as_amount")
    public double getAvailableMilesAsAmount ( ) { 
        return this.availableMilesAsAmount;
    }
    
    /** SETTER
     * The available miles as an amount that the customer can use in this transaction which is calculated from customer's current miles.
     */
    @JsonSetter("available_miles_as_amount")
    public void setAvailableMilesAsAmount (double value) { 
        this.availableMilesAsAmount = value;
    }
 
    /** GETTER
     * Loyalty discounted total amount.
     */
    @JsonGetter("loyalty_discounted_total_amount")
    public double getLoyaltyDiscountedTotalAmount ( ) { 
        return this.loyaltyDiscountedTotalAmount;
    }
    
    /** SETTER
     * Loyalty discounted total amount.
     */
    @JsonSetter("loyalty_discounted_total_amount")
    public void setLoyaltyDiscountedTotalAmount (double value) { 
        this.loyaltyDiscountedTotalAmount = value;
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
 
}
