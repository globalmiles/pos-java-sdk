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

    public DiscountBuilder orijin(String orijin) {
        discount.setOrijin(orijin);
        return this;
    }

    public DiscountBuilder type(String type) {
        discount.setType(type);
        return this;
    }

    public DiscountBuilder value(String value) {
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