/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetCustomerInfoRequestBuilder {
    //the instance to build
    private GetCustomerInfoRequest getCustomerInfoRequest;

    /**
     * Default constructor to initialize the instance
     */
    public GetCustomerInfoRequestBuilder() {
        getCustomerInfoRequest = new GetCustomerInfoRequest();
    }

    /**
     * Customer Identification Method ; GSM NO, Customer Unique ID or CODE
     */
    public GetCustomerInfoRequestBuilder readCode(String readCode) {
        getCustomerInfoRequest.setReadCode(readCode);
        return this;
    }

    /**
     * 1: GSM NO, 2: Customer unique identifier, 3: CODE
     */
    public GetCustomerInfoRequestBuilder readCodeType(int readCodeType) {
        getCustomerInfoRequest.setReadCodeType(readCodeType);
        return this;
    }

    /**
     * Total receipt amount.  ex:12.34 TL == 1234
     */
    public GetCustomerInfoRequestBuilder totalAmount(int totalAmount) {
        getCustomerInfoRequest.setTotalAmount(totalAmount);
        return this;
    }

    /**
     * Total Tax Value. EX:1.34 TL == 134
     */
    public GetCustomerInfoRequestBuilder totalVATAmount(int totalVATAmount) {
        getCustomerInfoRequest.setTotalVATAmount(totalVATAmount);
        return this;
    }

    /**
     * Terminal code.
     */
    public GetCustomerInfoRequestBuilder oKCSicilNo(String oKCSicilNo) {
        getCustomerInfoRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCustomerInfoRequest build() {
        return getCustomerInfoRequest;
    }
}