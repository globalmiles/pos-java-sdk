/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetBonusProvisionsResponseBuilder {
    //the instance to build
    private GetBonusProvisionsResponse getBonusProvisionsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetBonusProvisionsResponseBuilder() {
        getBonusProvisionsResponse = new GetBonusProvisionsResponse();
    }

    /**
     * 0  Success, 1 and bigger than 1 unsuccessful
     */
    public GetBonusProvisionsResponseBuilder returnCode(int returnCode) {
        getBonusProvisionsResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message
     */
    public GetBonusProvisionsResponseBuilder returnDesc(String returnDesc) {
        getBonusProvisionsResponse.setReturnDesc(returnDesc);
        return this;
    }

    public GetBonusProvisionsResponseBuilder bonusProvisions(List<BonusProvision> bonusProvisions) {
        getBonusProvisionsResponse.setBonusProvisions(bonusProvisions);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetBonusProvisionsResponse build() {
        return getBonusProvisionsResponse;
    }
}