/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetCustomerInfoResponseBuilder {
    //the instance to build
    private GetCustomerInfoResponse getCustomerInfoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCustomerInfoResponseBuilder() {
        getCustomerInfoResponse = new GetCustomerInfoResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    public GetCustomerInfoResponseBuilder returnCode(int returnCode) {
        getCustomerInfoResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message.
     */
    public GetCustomerInfoResponseBuilder returnDesc(String returnDesc) {
        getCustomerInfoResponse.setReturnDesc(returnDesc);
        return this;
    }

    /**
     * Session based user identification number.
     */
    public GetCustomerInfoResponseBuilder recognitionId(int recognitionId) {
        getCustomerInfoResponse.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * The available miles as an amount that the customer can use in this transaction which is calculated from customer's current miles.
     */
    public GetCustomerInfoResponseBuilder availableMilesAsAmount(double availableMilesAsAmount) {
        getCustomerInfoResponse.setAvailableMilesAsAmount(availableMilesAsAmount);
        return this;
    }

    /**
     * Loyalty discounted total amount.
     */
    public GetCustomerInfoResponseBuilder loyaltyDiscountedTotalAmount(double loyaltyDiscountedTotalAmount) {
        getCustomerInfoResponse.setLoyaltyDiscountedTotalAmount(loyaltyDiscountedTotalAmount);
        return this;
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public GetCustomerInfoResponseBuilder currency(String currency) {
        getCustomerInfoResponse.setCurrency(currency);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCustomerInfoResponse build() {
        return getCustomerInfoResponse;
    }
}