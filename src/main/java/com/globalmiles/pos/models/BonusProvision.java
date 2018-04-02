/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BonusProvision 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5694470790632022778L;
    private String bonusPaymentProvisionId;
    private int usedBonusAmount;
    private String dateTime;
    /** GETTER
     * Provision ID
     */
    @JsonGetter("bonusPaymentProvisionId")
    public String getBonusPaymentProvisionId ( ) { 
        return this.bonusPaymentProvisionId;
    }
    
    /** SETTER
     * Provision ID
     */
    @JsonSetter("bonusPaymentProvisionId")
    public void setBonusPaymentProvisionId (String value) { 
        this.bonusPaymentProvisionId = value;
    }
 
    /** GETTER
     * Used Bonus Amount
     */
    @JsonGetter("usedBonusAmount")
    public int getUsedBonusAmount ( ) { 
        return this.usedBonusAmount;
    }
    
    /** SETTER
     * Used Bonus Amount
     */
    @JsonSetter("usedBonusAmount")
    public void setUsedBonusAmount (int value) { 
        this.usedBonusAmount = value;
    }
 
    /** GETTER
     * Date/time
     */
    @JsonGetter("dateTime")
    public String getDateTime ( ) { 
        return this.dateTime;
    }
    
    /** SETTER
     * Date/time
     */
    @JsonSetter("dateTime")
    public void setDateTime (String value) { 
        this.dateTime = value;
    }
 
}
 