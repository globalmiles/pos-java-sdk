/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetMileProvisionsRequestBuilder {
    //the instance to build
    private GetMileProvisionsRequest getMileProvisionsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public GetMileProvisionsRequestBuilder() {
        getMileProvisionsRequest = new GetMileProvisionsRequest();
    }

    /**
     * Customer Identification Method ; GSM NO, Customer Unique ID or CODE
     */
    public GetMileProvisionsRequestBuilder readCode(String readCode) {
        getMileProvisionsRequest.setReadCode(readCode);
        return this;
    }

    /**
     * 1: GSM NO, 2: Customer unique identifier, 3: CODE
     */
    public GetMileProvisionsRequestBuilder readCodeType(String readCodeType) {
        getMileProvisionsRequest.setReadCodeType(readCodeType);
        return this;
    }

    /**
     * Terminal code.
     */
    public GetMileProvisionsRequestBuilder oKCSicilNo(String oKCSicilNo) {
        getMileProvisionsRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetMileProvisionsRequest build() {
        return getMileProvisionsRequest;
    }
}