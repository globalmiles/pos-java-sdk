/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class StartBonusPaymentRequestBuilder {
    //the instance to build
    private StartBonusPaymentRequest startBonusPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public StartBonusPaymentRequestBuilder() {
        startBonusPaymentRequest = new StartBonusPaymentRequest();
    }

    /**
     * Total Receipt Amount  ex:12.35 TL == 1235
     */
    public StartBonusPaymentRequestBuilder totalReceiptAmount(int totalReceiptAmount) {
        startBonusPaymentRequest.setTotalReceiptAmount(totalReceiptAmount);
        return this;
    }

    /**
     * Total Bonus(Mile) Amount  that has been used in the shopping  ex:0.85 TL == 85
     */
    public StartBonusPaymentRequestBuilder totalBonusAmount(int totalBonusAmount) {
        startBonusPaymentRequest.setTotalBonusAmount(totalBonusAmount);
        return this;
    }

    /**
     * Session based user identification number
     */
    public StartBonusPaymentRequestBuilder recognitionId(int recognitionId) {
        startBonusPaymentRequest.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * Terminal code.
     */
    public StartBonusPaymentRequestBuilder oKCSicilNo(String oKCSicilNo) {
        startBonusPaymentRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartBonusPaymentRequest build() {
        return startBonusPaymentRequest;
    }
}