/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class StartMilePaymentRequestBuilder {
    //the instance to build
    private StartMilePaymentRequest startMilePaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public StartMilePaymentRequestBuilder() {
        startMilePaymentRequest = new StartMilePaymentRequest();
    }

    /**
     * Total Receipt Amount  ex:12.35 TL == 1235
     */
    public StartMilePaymentRequestBuilder totalReceiptAmount(int totalReceiptAmount) {
        startMilePaymentRequest.setTotalReceiptAmount(totalReceiptAmount);
        return this;
    }

    /**
     * Used Amount that has been used in the shopping  ex:0.85 TL == 85
     */
    public StartMilePaymentRequestBuilder usedBonusAmount(int usedBonusAmount) {
        startMilePaymentRequest.setUsedBonusAmount(usedBonusAmount);
        return this;
    }

    /**
     * Session based user identification number
     */
    public StartMilePaymentRequestBuilder recognitionId(int recognitionId) {
        startMilePaymentRequest.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * Terminal code.
     */
    public StartMilePaymentRequestBuilder oKCSicilNo(String oKCSicilNo) {
        startMilePaymentRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartMilePaymentRequest build() {
        return startMilePaymentRequest;
    }
}