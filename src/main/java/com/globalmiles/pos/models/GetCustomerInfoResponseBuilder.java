/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetCustomerInfoResponseBuilder {
    //the instance to build
    private GetCustomerInfoResponse getCustomerInfoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCustomerInfoResponseBuilder() {
        getCustomerInfoResponse = new GetCustomerInfoResponse();
    }

    /**
     * 0 ise başarılı, 1 veya daha büyük ise başarısız
     */
    public GetCustomerInfoResponseBuilder returnCode(int returnCode) {
        getCustomerInfoResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * Başarılı ise boş, eğer hata varsa; hata mesajını içerir.
     */
    public GetCustomerInfoResponseBuilder returnDesc(String returnDesc) {
        getCustomerInfoResponse.setReturnDesc(returnDesc);
        return this;
    }

    /**
     * Kullanıcının GlobalMiles sistemindeki unique identifier değeri
     */
    public GetCustomerInfoResponseBuilder recognitionId(int recognitionId) {
        getCustomerInfoResponse.setRecognitionId(recognitionId);
        return this;
    }

    /**
     * Müşterinin bu işlemde kullanabileceği puanın TL karşılığıdır. Son iki karakter kuruşları temsil eder. Örneğin: 12.56 TL == 1256
     */
    public GetCustomerInfoResponseBuilder availablePoint(int availablePoint) {
        getCustomerInfoResponse.setAvailablePoint(availablePoint);
        return this;
    }

    /**
     * Sadakat indirimi. Son iki karakter kuruşları temsil eder. Örneğin: 90.50 TL == 9050
     */
    public GetCustomerInfoResponseBuilder loyaltyDiscountedPrice(int loyaltyDiscountedPrice) {
        getCustomerInfoResponse.setLoyaltyDiscountedPrice(loyaltyDiscountedPrice);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCustomerInfoResponse build() {
        return getCustomerInfoResponse;
    }
}