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
    private static final long serialVersionUID = 5687754927916018545L;
    private String invoiceType;
    private String invoiceNo;
    private String invoiceDate;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("invoiceType")
    public String getInvoiceType ( ) { 
        return this.invoiceType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("invoiceType")
    public void setInvoiceType (String value) { 
        this.invoiceType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("invoiceNo")
    public String getInvoiceNo ( ) { 
        return this.invoiceNo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("invoiceNo")
    public void setInvoiceNo (String value) { 
        this.invoiceNo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("invoiceDate")
    public String getInvoiceDate ( ) { 
        return this.invoiceDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("invoiceDate")
    public void setInvoiceDate (String value) { 
        this.invoiceDate = value;
    }
 
}
 