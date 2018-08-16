/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class StartMilePaymentRequestBuilder {
    //the instance to build
    private StartMilePaymentRequest startMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public StartMilePaymentRequestBuilder() {
        startMilePaymentRequest = new StartMilePaymentRequest();
    }

    /**
     * Total receipt amount.
     */
    public StartMilePaymentRequestBuilder totalReceiptAmount(double totalReceiptAmount) {
        startMilePaymentRequest.setTotalReceiptAmount(totalReceiptAmount);
        return this;
    }

    /**
     * Used amount that has been used in the shopping.
     */
    public StartMilePaymentRequestBuilder usedMilesAsAmount(double usedMilesAsAmount) {
        startMilePaymentRequest.setUsedMilesAsAmount(usedMilesAsAmount);
        return this;
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public StartMilePaymentRequestBuilder currency(String currency) {
        startMilePaymentRequest.setCurrency(currency);
        return this;
    }

    /**
     * Session based user identification number.
     */
    public StartMilePaymentRequestBuilder recognitionId(int recognitionId) {
        startMilePaymentRequest.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * Terminal ID.
     */
    public StartMilePaymentRequestBuilder terminalId(String terminalId) {
        startMilePaymentRequest.setTerminalId(terminalId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartMilePaymentRequest build() {
        return startMilePaymentRequest;
    }
}