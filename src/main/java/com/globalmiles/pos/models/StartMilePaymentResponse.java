/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartMilePaymentResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5543306627490420469L;
    private int returnCode;
    private String returnDesc;
    private String bonusPaymentProvisionId;
    private boolean oTPNeeded;
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
     * Provision ID for the payment
     */
    @JsonGetter("bonusPaymentProvisionId")
    public String getBonusPaymentProvisionId ( ) { 
        return this.bonusPaymentProvisionId;
    }
    
    /** SETTER
     * Provision ID for the payment
     */
    @JsonSetter("bonusPaymentProvisionId")
    public void setBonusPaymentProvisionId (String value) { 
        this.bonusPaymentProvisionId = value;
    }
 
    /** GETTER
     * Is a one-time password required?
     */
    @JsonGetter("OTPNeeded")
    public boolean getOTPNeeded ( ) { 
        return this.oTPNeeded;
    }
    
    /** SETTER
     * Is a one-time password required?
     */
    @JsonSetter("OTPNeeded")
    public void setOTPNeeded (boolean value) { 
        this.oTPNeeded = value;
    }
 
}
 