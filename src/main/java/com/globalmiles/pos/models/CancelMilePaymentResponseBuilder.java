/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CancelMilePaymentResponseBuilder {
    //the instance to build
    private CancelMilePaymentResponse cancelMilePaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CancelMilePaymentResponseBuilder() {
        cancelMilePaymentResponse = new CancelMilePaymentResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    public CancelMilePaymentResponseBuilder returnCode(int returnCode) {
        cancelMilePaymentResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message
     */
    public CancelMilePaymentResponseBuilder returnDesc(String returnDesc) {
        cancelMilePaymentResponse.setReturnDesc(returnDesc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelMilePaymentResponse build() {
        return cancelMilePaymentResponse;
    }
}