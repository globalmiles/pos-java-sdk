/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CompleteMilePaymentResponseBuilder {
    //the instance to build
    private CompleteMilePaymentResponse completeMilePaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CompleteMilePaymentResponseBuilder() {
        completeMilePaymentResponse = new CompleteMilePaymentResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    public CompleteMilePaymentResponseBuilder returnCode(int returnCode) {
        completeMilePaymentResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message.
     */
    public CompleteMilePaymentResponseBuilder returnDesc(String returnDesc) {
        completeMilePaymentResponse.setReturnDesc(returnDesc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompleteMilePaymentResponse build() {
        return completeMilePaymentResponse;
    }
}