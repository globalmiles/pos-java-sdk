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
     * Provision ID
     */
    public CompleteMilePaymentRequestBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        completeMilePaymentRequest.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Terminal code.
     */
    public CompleteMilePaymentRequestBuilder oKCSicilNo(String oKCSicilNo) {
        completeMilePaymentRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }

    /**
     * One time password that sends to customer phone
     */
    public CompleteMilePaymentRequestBuilder oTP(String oTP) {
        completeMilePaymentRequest.setOTP(oTP);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompleteMilePaymentRequest build() {
        return completeMilePaymentRequest;
    }
}