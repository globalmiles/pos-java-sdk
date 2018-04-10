/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class TransactionResultRequestBuilder {
    //the instance to build
    private TransactionResultRequest transactionResultRequest;

    /**
     * Default constructor to initialize the instance
     */
    public TransactionResultRequestBuilder() {
        transactionResultRequest = new TransactionResultRequest();
    }

    /**
     * Total Receipt Amount  ex:12.35 TL == 1235
     */
    public TransactionResultRequestBuilder totalReceiptAmount(int totalReceiptAmount) {
        transactionResultRequest.setTotalReceiptAmount(totalReceiptAmount);
        return this;
    }

    /**
     * Total VAT Amount  ex: 0.85 TL == 85
     */
    public TransactionResultRequestBuilder totalVATAmount(int totalVATAmount) {
        transactionResultRequest.setTotalVATAmount(totalVATAmount);
        return this;
    }

    /**
     * Terminal code.
     */
    public TransactionResultRequestBuilder oKCSicilNo(String oKCSicilNo) {
        transactionResultRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }

    /**
     * ReceiptNo
     */
    public TransactionResultRequestBuilder receiptNo(int receiptNo) {
        transactionResultRequest.setReceiptNo(receiptNo);
        return this;
    }

    /**
     * Z no
     */
    public TransactionResultRequestBuilder zno(int zno) {
        transactionResultRequest.setZno(zno);
        return this;
    }

    /**
     * Session based Identification Number .
     */
    public TransactionResultRequestBuilder recognitionId(int recognitionId) {
        transactionResultRequest.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * Eku no (Electronic Journal)
     */
    public TransactionResultRequestBuilder ekuNo(int ekuNo) {
        transactionResultRequest.setEkuNo(ekuNo);
        return this;
    }

    /**
     * Receipt Type (Invoice , Food ..)
     */
    public TransactionResultRequestBuilder receiptType(String receiptType) {
        transactionResultRequest.setReceiptType(receiptType);
        return this;
    }

    /**
     * It should be  GGAAYYYYSSDD formatted.
     */
    public TransactionResultRequestBuilder receiptDateTime(String receiptDateTime) {
        transactionResultRequest.setReceiptDateTime(receiptDateTime);
        return this;
    }

    /**
     * Invoice detail info
     */
    public TransactionResultRequestBuilder invoiceInfo(Invoice invoiceInfo) {
        transactionResultRequest.setInvoiceInfo(invoiceInfo);
        return this;
    }

    /**
     * Payment Detail Block
     */
    public TransactionResultRequestBuilder payments(List<Payment> payments) {
        transactionResultRequest.setPayments(payments);
        return this;
    }

    public TransactionResultRequestBuilder discounts(List<Discount> discounts) {
        transactionResultRequest.setDiscounts(discounts);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransactionResultRequest build() {
        return transactionResultRequest;
    }
}