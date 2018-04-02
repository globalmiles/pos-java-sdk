/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class TransactionResultResponseBuilder {
    //the instance to build
    private TransactionResultResponse transactionResultResponse;

    /**
     * Default constructor to initialize the instance
     */
    public TransactionResultResponseBuilder() {
        transactionResultResponse = new TransactionResultResponse();
    }

    /**
     * 0 ise başarılı, 1 veya daha büyük ise başarısız
     */
    public TransactionResultResponseBuilder returnCode(int returnCode) {
        transactionResultResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * Başarılı ise boş, eğer hata varsa; hata mesajını içerir.
     */
    public TransactionResultResponseBuilder returnDesc(String returnDesc) {
        transactionResultResponse.setReturnDesc(returnDesc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransactionResultResponse build() {
        return transactionResultResponse;
    }
}