/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransactionResultRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6019214673952477968L;
    private double totalReceiptAmount;
    private double totalVatAmount;
    private String currency;
    private int partnerId;
    private int branchId;
    private String terminalId;
    private String receiptNumber;
    private String extraNumber1;
    private String extraNumber2;
    private int recognitionId;
    private String receiptType;
    private String receiptDateTime;
    private Invoice invoiceInfo;
    private List<Payment> payments;
    private List<Discount> discounts;
    private String extraData;
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
     * Total tax amount.
     */
    @JsonGetter("total_vat_amount")
    public double getTotalVatAmount ( ) { 
        return this.totalVatAmount;
    }
    
    /** SETTER
     * Total tax amount.
     */
    @JsonSetter("total_vat_amount")
    public void setTotalVatAmount (double value) { 
        this.totalVatAmount = value;
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
     * Receipt number.
     */
    @JsonGetter("receipt_number")
    public String getReceiptNumber ( ) { 
        return this.receiptNumber;
    }
    
    /** SETTER
     * Receipt number.
     */
    @JsonSetter("receipt_number")
    public void setReceiptNumber (String value) { 
        this.receiptNumber = value;
    }
 
    /** GETTER
     * Extra number 1.
     */
    @JsonGetter("extra_number_1")
    public String getExtraNumber1 ( ) { 
        return this.extraNumber1;
    }
    
    /** SETTER
     * Extra number 1.
     */
    @JsonSetter("extra_number_1")
    public void setExtraNumber1 (String value) { 
        this.extraNumber1 = value;
    }
 
    /** GETTER
     * Extra number 2.
     */
    @JsonGetter("extra_number_2")
    public String getExtraNumber2 ( ) { 
        return this.extraNumber2;
    }
    
    /** SETTER
     * Extra number 2.
     */
    @JsonSetter("extra_number_2")
    public void setExtraNumber2 (String value) { 
        this.extraNumber2 = value;
    }
 
    /** GETTER
     * Session based identification number.
     */
    @JsonGetter("recognition_id")
    public int getRecognitionId ( ) { 
        return this.recognitionId;
    }
    
    /** SETTER
     * Session based identification number.
     */
    @JsonSetter("recognition_id")
    public void setRecognitionId (int value) { 
        this.recognitionId = value;
    }
 
    /** GETTER
     * Receipt type (Invoice , Food ..)
     */
    @JsonGetter("receipt_type")
    public String getReceiptType ( ) { 
        return this.receiptType;
    }
    
    /** SETTER
     * Receipt type (Invoice , Food ..)
     */
    @JsonSetter("receipt_type")
    public void setReceiptType (String value) { 
        this.receiptType = value;
    }
 
    /** GETTER
     * It should be DDMMYYYYHHMM formatted.
     */
    @JsonGetter("receipt_date_time")
    public String getReceiptDateTime ( ) { 
        return this.receiptDateTime;
    }
    
    /** SETTER
     * It should be DDMMYYYYHHMM formatted.
     */
    @JsonSetter("receipt_date_time")
    public void setReceiptDateTime (String value) { 
        this.receiptDateTime = value;
    }
 
    /** GETTER
     * Invoice details.
     */
    @JsonGetter("invoice_info")
    public Invoice getInvoiceInfo ( ) { 
        return this.invoiceInfo;
    }
    
    /** SETTER
     * Invoice details.
     */
    @JsonSetter("invoice_info")
    public void setInvoiceInfo (Invoice value) { 
        this.invoiceInfo = value;
    }
 
    /** GETTER
     * Payment details.
     */
    @JsonGetter("payments")
    public List<Payment> getPayments ( ) { 
        return this.payments;
    }
    
    /** SETTER
     * Payment details.
     */
    @JsonSetter("payments")
    public void setPayments (List<Payment> value) { 
        this.payments = value;
    }
 
    /** GETTER
     * Discount details.
     */
    @JsonGetter("discounts")
    public List<Discount> getDiscounts ( ) { 
        return this.discounts;
    }
    
    /** SETTER
     * Discount details.
     */
    @JsonSetter("discounts")
    public void setDiscounts (List<Discount> value) { 
        this.discounts = value;
    }
 
    /** GETTER
     * Extra data.
     */
    @JsonGetter("extra_data")
    public String getExtraData ( ) { 
        return this.extraData;
    }
    
    /** SETTER
     * Extra data.
     */
    @JsonSetter("extra_data")
    public void setExtraData (String value) { 
        this.extraData = value;
    }
 
}
 