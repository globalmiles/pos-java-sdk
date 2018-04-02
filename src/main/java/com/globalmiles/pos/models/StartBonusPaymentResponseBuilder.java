/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class StartBonusPaymentResponseBuilder {
    //the instance to build
    private StartBonusPaymentResponse startBonusPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public StartBonusPaymentResponseBuilder() {
        startBonusPaymentResponse = new StartBonusPaymentResponse();
    }

    /**
     * 0 ise başarılı, 1 veya daha büyük ise başarısız
     */
    public StartBonusPaymentResponseBuilder returnCode(int returnCode) {
        startBonusPaymentResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * Başarılı ise boş, eğer hata varsa; hata mesajını içerir.
     */
    public StartBonusPaymentResponseBuilder returnDesc(String returnDesc) {
        startBonusPaymentResponse.setReturnDesc(returnDesc);
        return this;
    }

    /**
     * Provizyon ID
     */
    public StartBonusPaymentResponseBuilder bonusPaymentProvisionId(String bonusPaymentProvisionId) {
        startBonusPaymentResponse.setBonusPaymentProvisionId(bonusPaymentProvisionId);
        return this;
    }

    /**
     * Tek kullanımlık parola gerekli mi?
     */
    public StartBonusPaymentResponseBuilder oTPNeeded(boolean oTPNeeded) {
        startBonusPaymentResponse.setOTPNeeded(oTPNeeded);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StartBonusPaymentResponse build() {
        return startBonusPaymentResponse;
    }
}