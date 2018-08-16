/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CancelMilePaymentRequestBuilder {
    //the instance to build
    private CancelMilePaymentRequest cancelMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CancelMilePaymentRequestBuilder() {
        cancelMilePaymentRequest = new CancelMilePaymentRequest();
    }

    /**
     * Terminal ID.
     */
    public CancelMilePaymentRequestBuilder terminalId(String terminalId) {
        cancelMilePaymentRequest.setTerminalId(terminalId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelMilePaymentRequest build() {
        return cancelMilePaymentRequest;
    }
}