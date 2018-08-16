/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartMilePaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -2253620305047936440L;
    private double totalReceiptAmount;
    private double usedMilesAsAmount;
    private String currency;
    private int recognitionId;
    private String terminalId;
    /** GETTER
     * Total receipt amount.
     */
    @JsonGetter("total_receipt_amount")
    public double getTotalReceiptAmount ( ) { 
        return this.totalReceiptAmount;
    }
    
    /** SETTER
     * Total receipt amount.
     */
    @JsonSetter("total_receipt_amount")
    public void setTotalReceiptAmount (double value) { 
        this.totalReceiptAmount = value;
    }
 
    /** GETTER
     * Used amount that has been used in the shopping.
     */
    @JsonGetter("used_miles_as_amount")
    public double getUsedMilesAsAmount ( ) { 
        return this.usedMilesAsAmount;
    }
    
    /** SETTER
     * Used amount that has been used in the shopping.
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
     * Terminal ID.
     */
    @JsonGetter("terminal_id")
    public String getTerminalId ( ) { 
        return this.terminalId;
    }
    
    /** SETTER
     * Terminal ID.
     */
    @JsonSetter("terminal_id")
    public void setTerminalId (String value) { 
        this.terminalId = value;
    }
 
}
 