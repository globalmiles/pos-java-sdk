/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CompleteBonusPaymentRequestBuilder {
    //the instance to build
    private CompleteBonusPaymentRequest completeBonusPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CompleteBonusPaymentRequestBuilder() {
        completeBonusPaymentRequest = new CompleteBonusPaymentRequest();
    }

    /**
     * Provision ID
     */
    public CompleteBonusPaymentRequestBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        completeBonusPaymentRequest.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Terminal code.
     */
    public CompleteBonusPaymentRequestBuilder oKCSicilNo(String oKCSicilNo) {
        completeBonusPaymentRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }

    /**
     * One time password that sends to customer phone
     */
    public CompleteBonusPaymentRequestBuilder oTP(String oTP) {
        completeBonusPaymentRequest.setOTP(oTP);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompleteBonusPaymentRequest build() {
        return completeBonusPaymentRequest;
    }
}