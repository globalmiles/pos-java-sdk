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
    private static final long serialVersionUID = 5463405382873830707L;
    private int totalReceiptAmount;
    private int totalVATAmount;
    private String oKCSicilNo;
    private int receiptNo;
    private int zno;
    private int recognitionId;
    private int ekuNo;
    private String receiptType;
    private String receiptDateTime;
    private Invoice invoiceInfo;
    private List<Payment> payments;
    private List<Discount> discounts;
    /** GETTER
     * Total Receipt Amount  ex:12.35 TL == 1235
     */
    @JsonGetter("totalReceiptAmount")
    public int getTotalReceiptAmount ( ) { 
        return this.totalReceiptAmount;
    }
    
    /** SETTER
     * Total Receipt Amount  ex:12.35 TL == 1235
     */
    @JsonSetter("totalReceiptAmount")
    public void setTotalReceiptAmount (int value) { 
        this.totalReceiptAmount = value;
    }
 
    /** GETTER
     * Total VAT Amount  ex: 0.85 TL == 85
     */
    @JsonGetter("totalVATAmount")
    public int getTotalVATAmount ( ) { 
        return this.totalVATAmount;
    }
    
    /** SETTER
     * Total VAT Amount  ex: 0.85 TL == 85
     */
    @JsonSetter("totalVATAmount")
    public void setTotalVATAmount (int value) { 
        this.totalVATAmount = value;
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
 
    /** GETTER
     * ReceiptNo
     */
    @JsonGetter("ReceiptNo")
    public int getReceiptNo ( ) { 
        return this.receiptNo;
    }
    
    /** SETTER
     * ReceiptNo
     */
    @JsonSetter("ReceiptNo")
    public void setReceiptNo (int value) { 
        this.receiptNo = value;
    }
 
    /** GETTER
     * Z no
     */
    @JsonGetter("Zno")
    public int getZno ( ) { 
        return this.zno;
    }
    
    /** SETTER
     * Z no
     */
    @JsonSetter("Zno")
    public void setZno (int value) { 
        this.zno = value;
    }
 
    /** GETTER
     * Session based Identification Number .
     */
    @JsonGetter("recognitionId")
    public int getRecognitionId ( ) { 
        return this.recognitionId;
    }
    
    /** SETTER
     * Session based Identification Number .
     */
    @JsonSetter("recognitionId")
    public void setRecognitionId (int value) { 
        this.recognitionId = value;
    }
 
    /** GETTER
     * Eku no (Electronic Journal)
     */
    @JsonGetter("EkuNo")
    public int getEkuNo ( ) { 
        return this.ekuNo;
    }
    
    /** SETTER
     * Eku no (Electronic Journal)
     */
    @JsonSetter("EkuNo")
    public void setEkuNo (int value) { 
        this.ekuNo = value;
    }
 
    /** GETTER
     * Receipt Type (Invoice , Food ..)
     */
    @JsonGetter("ReceiptType")
    public String getReceiptType ( ) { 
        return this.receiptType;
    }
    
    /** SETTER
     * Receipt Type (Invoice , Food ..)
     */
    @JsonSetter("ReceiptType")
    public void setReceiptType (String value) { 
        this.receiptType = value;
    }
 
    /** GETTER
     * It should be  GGAAYYYYSSDD formatted.
     */
    @JsonGetter("ReceiptDateTime")
    public String getReceiptDateTime ( ) { 
        return this.receiptDateTime;
    }
    
    /** SETTER
     * It should be  GGAAYYYYSSDD formatted.
     */
    @JsonSetter("ReceiptDateTime")
    public void setReceiptDateTime (String value) { 
        this.receiptDateTime = value;
    }
 
    /** GETTER
     * Invoice detail info
     */
    @JsonGetter("InvoiceInfo")
    public Invoice getInvoiceInfo ( ) { 
        return this.invoiceInfo;
    }
    
    /** SETTER
     * Invoice detail info
     */
    @JsonSetter("InvoiceInfo")
    public void setInvoiceInfo (Invoice value) { 
        this.invoiceInfo = value;
    }
 
    /** GETTER
     * Payment Detail Block
     */
    @JsonGetter("Payments")
    public List<Payment> getPayments ( ) { 
        return this.payments;
    }
    
    /** SETTER
     * Payment Detail Block
     */
    @JsonSetter("Payments")
    public void setPayments (List<Payment> value) { 
        this.payments = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Discounts")
    public List<Discount> getDiscounts ( ) { 
        return this.discounts;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Discounts")
    public void setDiscounts (List<Discount> value) { 
        this.discounts = value;
    }
 
}
 