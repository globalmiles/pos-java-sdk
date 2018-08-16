/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetMileProvisionsResponseBuilder {
    //the instance to build
    private GetMileProvisionsResponse getMileProvisionsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetMileProvisionsResponseBuilder() {
        getMileProvisionsResponse = new GetMileProvisionsResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    public GetMileProvisionsResponseBuilder returnCode(int returnCode) {
        getMileProvisionsResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message.
     */
    public GetMileProvisionsResponseBuilder returnDesc(String returnDesc) {
        getMileProvisionsResponse.setReturnDesc(returnDesc);
        return this;
    }

    /**
     * A collection of the payments.
     */
    public GetMileProvisionsResponseBuilder paymentProvisions(List<MileProvision> paymentProvisions) {
        getMileProvisionsResponse.setPaymentProvisions(paymentProvisions);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetMileProvisionsResponse build() {
        return getMileProvisionsResponse;
    }
}