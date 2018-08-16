/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CompleteMilePaymentRequestBuilder {
    //the instance to build
    private CompleteMilePaymentRequest completeMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CompleteMilePaymentRequestBuilder() {
        completeMilePaymentRequest = new CompleteMilePaymentRequest();
    }

    /**
     * Terminal ID.
     */
    public CompleteMilePaymentRequestBuilder terminalId(String terminalId) {
        completeMilePaymentRequest.setTerminalId(terminalId);
        return this;
    }

    /**
     * One time password that sends to customer phone.
     */
    public CompleteMilePaymentRequestBuilder otp(String otp) {
        completeMilePaymentRequest.setOtp(otp);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompleteMilePaymentRequest build() {
        return completeMilePaymentRequest;
    }
}