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
    private static final long serialVersionUID = -4852218439974569178L;
    private int returnCode;
    private String returnDesc;
    private int milesPaymentProvisionId;
    private boolean otpNeeded;
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
     * Provision ID for the payment.
     */
    @JsonGetter("miles_payment_provision_id")
    public int getMilesPaymentProvisionId ( ) { 
        return this.milesPaymentProvisionId;
    }
    
    /** SETTER
     * Provision ID for the payment.
     */
    @JsonSetter("miles_payment_provision_id")
    public void setMilesPaymentProvisionId (int value) { 
        this.milesPaymentProvisionId = value;
    }
 
    /** GETTER
     * Is a one-time password required?
     */
    @JsonGetter("otp_needed")
    public boolean getOtpNeeded ( ) { 
        return this.otpNeeded;
    }
    
    /** SETTER
     * Is a one-time password required?
     */
    @JsonSetter("otp_needed")
    public void setOtpNeeded (boolean value) { 
        this.otpNeeded = value;
    }
 
}
 