/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class StartMilePaymentResponseBuilder {
    //the instance to build
    private StartMilePaymentResponse startMilePaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public StartMilePaymentResponseBuilder() {
        startMilePaymentResponse = new StartMilePaymentResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful
     */
    public StartMilePaymentResponseBuilder returnCode(int returnCode) {
        startMilePaymentResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message
     */
    public StartMilePaymentResponseBuilder returnDesc(String returnDesc) {
        startMilePaymentResponse.setReturnDesc(returnDesc);
        return this;
    }

    /**
     * Provision ID for the payment
     */
    public StartMilePaymentResponseBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        startMilePaymentResponse.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Is a one-time password required?
     */
    public StartMilePaymentResponseBuilder oTPNeeded(boolean oTPNeeded) {
        startMilePaymentResponse.setOTPNeeded(oTPNeeded);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartMilePaymentResponse build() {
        return startMilePaymentResponse;
    }
}