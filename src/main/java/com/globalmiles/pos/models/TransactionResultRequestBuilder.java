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
     * Total receipt amount.
     */
    public TransactionResultRequestBuilder totalReceiptAmount(double totalReceiptAmount) {
        transactionResultRequest.setTotalReceiptAmount(totalReceiptAmount);
        return this;
    }

    /**
     * Total tax amount.
     */
    public TransactionResultRequestBuilder totalVatAmount(double totalVatAmount) {
        transactionResultRequest.setTotalVatAmount(totalVatAmount);
        return this;
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public TransactionResultRequestBuilder currency(String currency) {
        transactionResultRequest.setCurrency(currency);
        return this;
    }

    /**
     * Partner ID.
     */
    public TransactionResultRequestBuilder partnerId(int partnerId) {
        transactionResultRequest.setPartnerId(partnerId);
        return this;
    }

    /**
     * Branch ID.
     */
    public TransactionResultRequestBuilder branchId(int branchId) {
        transactionResultRequest.setBranchId(branchId);
        return this;
    }

    /**
     * Terminal ID.
     */
    public TransactionResultRequestBuilder terminalId(String terminalId) {
        transactionResultRequest.setTerminalId(terminalId);
        return this;
    }

    /**
     * Receipt number.
     */
    public TransactionResultRequestBuilder receiptNumber(String receiptNumber) {
        transactionResultRequest.setReceiptNumber(receiptNumber);
        return this;
    }

    /**
     * Extra number 1.
     */
    public TransactionResultRequestBuilder extraNumber1(String extraNumber1) {
        transactionResultRequest.setExtraNumber1(extraNumber1);
        return this;
    }

    /**
     * Extra number 2.
     */
    public TransactionResultRequestBuilder extraNumber2(String extraNumber2) {
        transactionResultRequest.setExtraNumber2(extraNumber2);
        return this;
    }

    /**
     * Session based identification number.
     */
    public TransactionResultRequestBuilder recognitionId(int recognitionId) {
        transactionResultRequest.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * Receipt type (Invoice , Food ..)
     */
    public TransactionResultRequestBuilder receiptType(String receiptType) {
        transactionResultRequest.setReceiptType(receiptType);
        return this;
    }

    /**
     * It should be DDMMYYYYHHMM formatted.
     */
    public TransactionResultRequestBuilder receiptDateTime(String receiptDateTime) {
        transactionResultRequest.setReceiptDateTime(receiptDateTime);
        return this;
    }

    /**
     * Invoice details.
     */
    public TransactionResultRequestBuilder invoiceInfo(Invoice invoiceInfo) {
        transactionResultRequest.setInvoiceInfo(invoiceInfo);
        return this;
    }

    /**
     * Payment details.
     */
    public TransactionResultRequestBuilder payments(List<Payment> payments) {
        transactionResultRequest.setPayments(payments);
        return this;
    }

    /**
     * Discount details.
     */
    public TransactionResultRequestBuilder discounts(List<Discount> discounts) {
        transactionResultRequest.setDiscounts(discounts);
        return this;
    }

    /**
     * Extra data.
     */
    public TransactionResultRequestBuilder extraData(String extraData) {
        transactionResultRequest.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransactionResultRequest build() {
        return transactionResultRequest;
    }
}