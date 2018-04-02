/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class BonusProvisionBuilder {
    //the instance to build
    private BonusProvision bonusProvision;

    /**
     * Default constructor to initialize the instance
     */
    public BonusProvisionBuilder() {
        bonusProvision = new BonusProvision();
    }

    /**
     * Provision ID
     */
    public BonusProvisionBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        bonusProvision.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Used Bonus Amount
     */
    public BonusProvisionBuilder usedBonusAmount(int usedBonusAmount) {
        bonusProvision.setUsedBonusAmount(usedBonusAmount);
        return this;
    }

    /**
     * Date/time
     */
    public BonusProvisionBuilder dateTime(String dateTime) {
        bonusProvision.setDateTime(dateTime);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BonusProvision build() {
        return bonusProvision;
    }
}