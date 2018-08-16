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
    public MileProvisionBuilder milesPaymentProvisionId(int milesPaymentProvisionId) {
        mileProvision.setMilesPaymentProvisionId(milesPaymentProvisionId);
        return this;
    }

    /**
     * Used amount
     */
    public MileProvisionBuilder usedMilesAsAmount(double usedMilesAsAmount) {
        mileProvision.setUsedMilesAsAmount(usedMilesAsAmount);
        return this;
    }

    /**
     * ISO-4217 3-letter currency code.
     */
    public MileProvisionBuilder currency(String currency) {
        mileProvision.setCurrency(currency);
        return this;
    }

    /**
     * Date time of the mile provision.
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