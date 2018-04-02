/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class CompleteBonusPaymentResponseBuilder {
    //the instance to build
    private CompleteBonusPaymentResponse completeBonusPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CompleteBonusPaymentResponseBuilder() {
        completeBonusPaymentResponse = new CompleteBonusPaymentResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful
     */
    public CompleteBonusPaymentResponseBuilder returnCode(int returnCode) {
        completeBonusPaymentResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message
     */
    public CompleteBonusPaymentResponseBuilder returnDesc(String returnDesc) {
        completeBonusPaymentResponse.setReturnDesc(returnDesc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CompleteBonusPaymentResponse build() {
        return completeBonusPaymentResponse;
    }
}