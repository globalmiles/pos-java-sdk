/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Invoice 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7436646771283398026L;
    private String invoiceType;
    private String invoiceNumber;
    private String invoiceDate;
    /** GETTER
     * Type of the invoice.
     */
    @JsonGetter("invoice_type")
    public String getInvoiceType ( ) { 
        return this.invoiceType;
    }
    
    /** SETTER
     * Type of the invoice.
     */
    @JsonSetter("invoice_type")
    public void setInvoiceType (String value) { 
        this.invoiceType = value;
    }
 
    /** GETTER
     * Number of the invoice.
     */
    @JsonGetter("invoice_number")
    public String getInvoiceNumber ( ) { 
        return this.invoiceNumber;
    }
    
    /** SETTER
     * Number of the invoice.
     */
    @JsonSetter("invoice_number")
    public void setInvoiceNumber (String value) { 
        this.invoiceNumber = value;
    }
 
    /** GETTER
     * Date of the invoice.
     */
    @JsonGetter("invoice_date")
    public String getInvoiceDate ( ) { 
        return this.invoiceDate;
    }
    
    /** SETTER
     * Date of the invoice.
     */
    @JsonSetter("invoice_date")
    public void setInvoiceDate (String value) { 
        this.invoiceDate = value;
    }
 
}
 