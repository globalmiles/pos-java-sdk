/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StartMilePaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5337924204104562814L;
    private int totalReceiptAmount;
    private int usedBonusAmount;
    private int recognitionId;
    private String oKCSicilNo;
    /** GETTER
     * Total Receipt Amount  ex:12.35 TL == 1235
     */
    @JsonGetter("totalReceiptAmount")
    public int getTotalReceiptAmount ( ) { 
        return this.totalReceiptAmount;
    }
    
    /** SETTER
     * Total Receipt Amount  ex:12.35 TL == 1235
     */
    @JsonSetter("totalReceiptAmount")
    public void setTotalReceiptAmount (int value) { 
        this.totalReceiptAmount = value;
    }
 
    /** GETTER
     * Used Amount that has been used in the shopping  ex:0.85 TL == 85
     */
    @JsonGetter("usedBonusAmount")
    public int getUsedBonusAmount ( ) { 
        return this.usedBonusAmount;
    }
    
    /** SETTER
     * Used Amount that has been used in the shopping  ex:0.85 TL == 85
     */
    @JsonSetter("usedBonusAmount")
    public void setUsedBonusAmount (int value) { 
        this.usedBonusAmount = value;
    }
 
    /** GETTER
     * Session based user identification number
     */
    @JsonGetter("recognitionId")
    public int getRecognitionId ( ) { 
        return this.recognitionId;
    }
    
    /** SETTER
     * Session based user identification number
     */
    @JsonSetter("recognitionId")
    public void setRecognitionId (int value) { 
        this.recognitionId = value;
    }
 
    /** GETTER
     * Terminal code.
     */
    @JsonGetter("OKCSicilNo")
    public String getOKCSicilNo ( ) { 
        return this.oKCSicilNo;
    }
    
    /** SETTER
     * Terminal code.
     */
    @JsonSetter("OKCSicilNo")
    public void setOKCSicilNo (String value) { 
        this.oKCSicilNo = value;
    }
 
}
 