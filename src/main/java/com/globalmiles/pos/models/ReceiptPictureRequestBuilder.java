/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class ReceiptPictureRequestBuilder {
    //the instance to build
    private ReceiptPictureRequest receiptPictureRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ReceiptPictureRequestBuilder() {
        receiptPictureRequest = new ReceiptPictureRequest();
    }

    /**
     * Terminal ID.
     */
    public ReceiptPictureRequestBuilder terminalId(String terminalId) {
        receiptPictureRequest.setTerminalId(terminalId);
        return this;
    }

    /**
     * Session based user identification number.
     */
    public ReceiptPictureRequestBuilder recognitionId(int recognitionId) {
        receiptPictureRequest.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * File name of the picture.
     */
    public ReceiptPictureRequestBuilder fileName(String fileName) {
        receiptPictureRequest.setFileName(fileName);
        return this;
    }

    /**
     * Base64 encoded binary picture data.
     */
    public ReceiptPictureRequestBuilder picture(String picture) {
        receiptPictureRequest.setPicture(picture);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ReceiptPictureRequest build() {
        return receiptPictureRequest;
    }
}