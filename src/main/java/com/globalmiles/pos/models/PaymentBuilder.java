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

    /**
     * Amount of the payment.
     */
    public PaymentBuilder payAmount(double payAmount) {
        payment.setPayAmount(payAmount);
        return this;
    }

    /**
     * Type of the payment.
     */
    public PaymentBuilder paymentType(String paymentType) {
        payment.setPaymentType(paymentType);
        return this;
    }

    /**
     * Provision ID for pay with miles.
     */
    public PaymentBuilder milesPaymentProvisionId(Integer milesPaymentProvisionId) {
        payment.setMilesPaymentProvisionId(milesPaymentProvisionId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Payment build() {
        return payment;
    }
}