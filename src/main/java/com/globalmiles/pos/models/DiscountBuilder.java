/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class DiscountBuilder {
    //the instance to build
    private Discount discount;

    /**
     * Default constructor to initialize the instance
     */
    public DiscountBuilder() {
        discount = new Discount();
    }

    /**
     * Origin of the discount. 1: Global Miles, 2: Other.
     */
    public DiscountBuilder origin(String origin) {
        discount.setOrigin(origin);
        return this;
    }

    /**
     * Type of the discount. 0: amount based, 1: rate based.
     */
    public DiscountBuilder type(String type) {
        discount.setType(type);
        return this;
    }

    /**
     * Value of the discount.
     */
    public DiscountBuilder value(double value) {
        discount.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Discount build() {
        return discount;
    }
}