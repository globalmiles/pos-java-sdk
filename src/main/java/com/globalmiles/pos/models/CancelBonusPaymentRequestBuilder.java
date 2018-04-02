/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CancelBonusPaymentRequestBuilder {
    //the instance to build
    private CancelBonusPaymentRequest cancelBonusPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CancelBonusPaymentRequestBuilder() {
        cancelBonusPaymentRequest = new CancelBonusPaymentRequest();
    }

    /**
     * Provision ID
     */
    public CancelBonusPaymentRequestBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        cancelBonusPaymentRequest.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Terminal code.
     */
    public CancelBonusPaymentRequestBuilder oKCSicilNo(String oKCSicilNo) {
        cancelBonusPaymentRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelBonusPaymentRequest build() {
        return cancelBonusPaymentRequest;
    }
}