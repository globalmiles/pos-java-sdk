/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CancelBonusPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5037912392605894541L;
    private String bonusPaymentProvisionId;
    private String oKCSicilNo;
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
 