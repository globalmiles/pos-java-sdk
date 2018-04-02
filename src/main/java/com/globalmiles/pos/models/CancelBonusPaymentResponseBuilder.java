/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CancelBonusPaymentResponseBuilder {
    //the instance to build
    private CancelBonusPaymentResponse cancelBonusPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CancelBonusPaymentResponseBuilder() {
        cancelBonusPaymentResponse = new CancelBonusPaymentResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful
     */
    public CancelBonusPaymentResponseBuilder returnCode(int returnCode) {
        cancelBonusPaymentResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message
     */
    public CancelBonusPaymentResponseBuilder returnDesc(String returnDesc) {
        cancelBonusPaymentResponse.setReturnDesc(returnDesc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelBonusPaymentResponse build() {
        return cancelBonusPaymentResponse;
    }
}