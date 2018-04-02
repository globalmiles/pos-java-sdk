/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCustomerInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5611315361132365670L;
    private int returnCode;
    private String returnDesc;
    private int recognitionId;
    private int availablePoint;
    private int loyaltyDiscountedPrice;
    /** GETTER
     * 0 ise başarılı, 1 veya daha büyük ise başarısız
     */
    @JsonGetter("returnCode")
    public int getReturnCode ( ) { 
        return this.returnCode;
    }
    
    /** SETTER
     * 0 ise başarılı, 1 veya daha büyük ise başarısız
     */
    @JsonSetter("returnCode")
    public void setReturnCode (int value) { 
        this.returnCode = value;
    }
 
    /** GETTER
     * Başarılı ise boş, eğer hata varsa; hata mesajını içerir.
     */
    @JsonGetter("returnDesc")
    public String getReturnDesc ( ) { 
        return this.returnDesc;
    }
    
    /** SETTER
     * Başarılı ise boş, eğer hata varsa; hata mesajını içerir.
     */
    @JsonSetter("returnDesc")
    public void setReturnDesc (String value) { 
        this.returnDesc = value;
    }
 
    /** GETTER
     * Kullanıcının GlobalMiles sistemindeki unique identifier değeri
     */
    @JsonGetter("recognitionId")
    public int getRecognitionId ( ) { 
        return this.recognitionId;
    }
    
    /** SETTER
     * Kullanıcının GlobalMiles sistemindeki unique identifier değeri
     */
    @JsonSetter("recognitionId")
    public void setRecognitionId (int value) { 
        this.recognitionId = value;
    }
 
    /** GETTER
     * Müşterinin bu işlemde kullanabileceği puanın TL karşılığıdır. Son iki karakter kuruşları temsil eder. Örneğin: 12.56 TL == 1256
     */
    @JsonGetter("availablePoint")
    public int getAvailablePoint ( ) { 
        return this.availablePoint;
    }
    
    /** SETTER
     * Müşterinin bu işlemde kullanabileceği puanın TL karşılığıdır. Son iki karakter kuruşları temsil eder. Örneğin: 12.56 TL == 1256
     */
    @JsonSetter("availablePoint")
    public void setAvailablePoint (int value) { 
        this.availablePoint = value;
    }
 
    /** GETTER
     * Sadakat indirimi. Son iki karakter kuruşları temsil eder. Örneğin: 90.50 TL == 9050
     */
    @JsonGetter("loyaltyDiscountedPrice")
    public int getLoyaltyDiscountedPrice ( ) { 
        return this.loyaltyDiscountedPrice;
    }
    
    /** SETTER
     * Sadakat indirimi. Son iki karakter kuruşları temsil eder. Örneğin: 90.50 TL == 9050
     */
    @JsonSetter("loyaltyDiscountedPrice")
    public void setLoyaltyDiscountedPrice (int value) { 
        this.loyaltyDiscountedPrice = value;
    }
 
}
 