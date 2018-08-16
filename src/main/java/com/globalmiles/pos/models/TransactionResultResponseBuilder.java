/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class TransactionResultResponseBuilder {
    //the instance to build
    private TransactionResultResponse transactionResultResponse;

    /**
     * Default constructor to initialize the instance
     */
    public TransactionResultResponseBuilder() {
        transactionResultResponse = new TransactionResultResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    public TransactionResultResponseBuilder returnCode(int returnCode) {
        transactionResultResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message.
     */
    public TransactionResultResponseBuilder returnDesc(String returnDesc) {
        transactionResultResponse.setReturnDesc(returnDesc);
        return this;
    }

    /**
     * Text data to be used for printing the receipt.
     */
    public TransactionResultResponseBuilder qrData(String qrData) {
        transactionResultResponse.setQrData(qrData);
        return this;
    }

    /**
     * Extra information for generel usage.
     */
    public TransactionResultResponseBuilder extraInfo(String extraInfo) {
        transactionResultResponse.setExtraInfo(extraInfo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransactionResultResponse build() {
        return transactionResultResponse;
    }
}