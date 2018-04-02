/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class PaymentBuilder {
    //the instance to build
    private Payment payment;

    /**
     * Default constructor to initialize the instance
     */
    public PaymentBuilder() {
        payment = new Payment();
    }

    public PaymentBuilder payAmount(int payAmount) {
        payment.setPayAmount(payAmount);
        return this;
    }

    public PaymentBuilder paymentType(int paymentType) {
        payment.setPaymentType(paymentType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Payment build() {
        return payment;
    }
}