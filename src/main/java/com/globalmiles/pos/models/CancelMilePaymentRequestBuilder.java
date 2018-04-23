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
     * Provision ID
     */
    public CancelMilePaymentRequestBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        cancelMilePaymentRequest.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Terminal code.
     */
    public CancelMilePaymentRequestBuilder oKCSicilNo(String oKCSicilNo) {
        cancelMilePaymentRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelMilePaymentRequest build() {
        return cancelMilePaymentRequest;
    }
}