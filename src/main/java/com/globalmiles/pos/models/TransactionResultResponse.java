/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransactionResultResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5487352733610086646L;
    private int returnCode;
    private String returnDesc;
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
 
}
 