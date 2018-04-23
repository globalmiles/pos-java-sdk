/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCustomerInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5671392532134245639L;
    private int returnCode;
    private String returnDesc;
    private int recognitionId;
    private int availablePoint;
    private int loyaltyDiscountedPrice;
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
 
    /** GETTER
     * Session based user identification number
     */
    @JsonGetter("recognitionId")
    public int getRecognitionId ( ) { 
        return this.recognitionId;
    }
    
    /** SETTER
     * Session based user identification number
     */
    @JsonSetter("recognitionId")
    public void setRecognitionId (int value) { 
        this.recognitionId = value;
    }
 
    /** GETTER
     * The available points that the customer can use in this transaction is in USD which is calculated from customer's current miles. EX: 12.56 USD == 1256
     */
    @JsonGetter("availablePoint")
    public int getAvailablePoint ( ) { 
        return this.availablePoint;
    }
    
    /** SETTER
     * The available points that the customer can use in this transaction is in USD which is calculated from customer's current miles. EX: 12.56 USD == 1256
     */
    @JsonSetter("availablePoint")
    public void setAvailablePoint (int value) { 
        this.availablePoint = value;
    }
 
    /** GETTER
     * Loyalty discounted price ex: 90.50 USD == 9050
     */
    @JsonGetter("loyaltyDiscountedPrice")
    public int getLoyaltyDiscountedPrice ( ) { 
        return this.loyaltyDiscountedPrice;
    }
    
    /** SETTER
     * Loyalty discounted price ex: 90.50 USD == 9050
     */
    @JsonSetter("loyaltyDiscountedPrice")
    public void setLoyaltyDiscountedPrice (int value) { 
        this.loyaltyDiscountedPrice = value;
    }
 
}
 