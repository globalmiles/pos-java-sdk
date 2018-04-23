/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class MileProvisionBuilder {
    //the instance to build
    private MileProvision mileProvision;

    /**
     * Default constructor to initialize the instance
     */
    public MileProvisionBuilder() {
        mileProvision = new MileProvision();
    }

    /**
     * Provision ID
     */
    public MileProvisionBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        mileProvision.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Used Bonus Amount
     */
    public MileProvisionBuilder usedBonusAmount(int usedBonusAmount) {
        mileProvision.setUsedBonusAmount(usedBonusAmount);
        return this;
    }

    /**
     * Date/time
     */
    public MileProvisionBuilder dateTime(String dateTime) {
        mileProvision.setDateTime(dateTime);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MileProvision build() {
        return mileProvision;
    }
}