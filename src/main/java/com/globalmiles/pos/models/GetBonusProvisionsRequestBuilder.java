/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetBonusProvisionsRequestBuilder {
    //the instance to build
    private GetBonusProvisionsRequest getBonusProvisionsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public GetBonusProvisionsRequestBuilder() {
        getBonusProvisionsRequest = new GetBonusProvisionsRequest();
    }

    /**
     * Müşteri tanıma tercihi, Telefon numarası, QR code gibi
     */
    public GetBonusProvisionsRequestBuilder readCode(String readCode) {
        getBonusProvisionsRequest.setReadCode(readCode);
        return this;
    }

    /**
     * 1: Telefon numarası, 2: Müşteri unique identifier, 3: Diğer
     */
    public GetBonusProvisionsRequestBuilder readCodeType(String readCodeType) {
        getBonusProvisionsRequest.setReadCodeType(readCodeType);
        return this;
    }

    /**
     * Terminal code.
     */
    public GetBonusProvisionsRequestBuilder oKCSicilNo(String oKCSicilNo) {
        getBonusProvisionsRequest.setOKCSicilNo(oKCSicilNo);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetBonusProvisionsRequest build() {
        return getBonusProvisionsRequest;
    }
}