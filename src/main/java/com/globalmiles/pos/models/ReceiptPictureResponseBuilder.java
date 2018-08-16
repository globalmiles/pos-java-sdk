/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class ReceiptPictureResponseBuilder {
    //the instance to build
    private ReceiptPictureResponse receiptPictureResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ReceiptPictureResponseBuilder() {
        receiptPictureResponse = new ReceiptPictureResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    public ReceiptPictureResponseBuilder returnCode(String returnCode) {
        receiptPictureResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message.
     */
    public ReceiptPictureResponseBuilder returnDesc(String returnDesc) {
        receiptPictureResponse.setReturnDesc(returnDesc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ReceiptPictureResponse build() {
        return receiptPictureResponse;
    }
}