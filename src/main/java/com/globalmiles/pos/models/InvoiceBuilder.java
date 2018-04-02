/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class InvoiceBuilder {
    //the instance to build
    private Invoice invoice;

    /**
     * Default constructor to initialize the instance
     */
    public InvoiceBuilder() {
        invoice = new Invoice();
    }

    public InvoiceBuilder invoiceType(String invoiceType) {
        invoice.setInvoiceType(invoiceType);
        return this;
    }

    public InvoiceBuilder invoiceNo(String invoiceNo) {
        invoice.setInvoiceNo(invoiceNo);
        return this;
    }

    public InvoiceBuilder invoiceDate(String invoiceDate) {
        invoice.setInvoiceDate(invoiceDate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Invoice build() {
        return invoice;
    }
}