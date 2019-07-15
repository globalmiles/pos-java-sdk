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
public class GetTerminalInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -3321993223798964355L;
    private int returnCode;
    private String returnDesc;
    private String terminalId;
    private String receiptHeader;
    private String receiptFooter;
    private int partnerId;
    private int branchId;
    private boolean merchantIdMandatory;
    private String defaultCurrency;
    /** GETTER
     * 0 Success, 1 and bigger than 1 unsuccessful.
     */
    @JsonGetter("return_code")
    public int getReturnCode ( ) { 
        return this.returnCode;
    }
    
    /** SETTER
     * 0 Success, 1 and bigger than 1 unsuccessful.
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
 
    /** GETTER
     * Header text for the receipt.
     */
    @JsonGetter("receipt_header")
    public String getReceiptHeader ( ) { 
        return this.receiptHeader;
    }
    
    /** SETTER
     * Header text for the receipt.
     */
    @JsonSetter("receipt_header")
    public void setReceiptHeader (String value) { 
        this.receiptHeader = value;
    }
 
    /** GETTER
     * Footer text for the receipt.
     */
    @JsonGetter("receipt_footer")
    public String getReceiptFooter ( ) { 
        return this.receiptFooter;
    }
    
    /** SETTER
     * Footer text for the receipt.
     */
    @JsonSetter("receipt_footer")
    public void setReceiptFooter (String value) { 
        this.receiptFooter = value;
    }
 
    /** GETTER
     * Partner ID.
     */
    @JsonGetter("partner_id")
    public int getPartnerId ( ) { 
        return this.partnerId;
    }
    
    /** SETTER
     * Partner ID.
     */
    @JsonSetter("partner_id")
    public void setPartnerId (int value) { 
        this.partnerId = value;
    }
 
    /** GETTER
     * Branch ID.
     */
    @JsonGetter("branch_id")
    public int getBranchId ( ) { 
        return this.branchId;
    }
    
    /** SETTER
     * Branch ID.
     */
    @JsonSetter("branch_id")
    public void setBranchId (int value) { 
        this.branchId = value;
    }
 
    /** GETTER
     * Indicates whether the merchant ID parameter is required in the Transaction Result request.
     */
    @JsonGetter("merchant_id_mandatory")
    public boolean getMerchantIdMandatory ( ) { 
        return this.merchantIdMandatory;
    }
    
    /** SETTER
     * Indicates whether the merchant ID parameter is required in the Transaction Result request.
     */
    @JsonSetter("merchant_id_mandatory")
    public void setMerchantIdMandatory (boolean value) { 
        this.merchantIdMandatory = value;
    }
 
    /** GETTER
     * ISO-4217 3-letter default currency code for the partner.
     */
    @JsonGetter("default_currency")
    public String getDefaultCurrency ( ) { 
        return this.defaultCurrency;
    }
    
    /** SETTER
     * ISO-4217 3-letter default currency code for the partner.
     */
    @JsonSetter("default_currency")
    public void setDefaultCurrency (String value) { 
        this.defaultCurrency = value;
    }
 
}
