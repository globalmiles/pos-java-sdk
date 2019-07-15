/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class TransactionResultResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5995809467745183685L;
    private int returnCode;
    private String returnDesc;
    private String qrData;
    private String extraInfo;
    /** GETTER
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    @JsonGetter("return_code")
    public int getReturnCode ( ) { 
        return this.returnCode;
    }
    
    /** SETTER
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    @JsonSetter("return_code")
    public void setReturnCode (int value) { 
        this.returnCode = value;
    }
 
    /** GETTER
     * if success return is empty. if unsuccessful it returns error message.
     */
    @JsonGetter("return_desc")
    public String getReturnDesc ( ) { 
        return this.returnDesc;
    }
    
    /** SETTER
     * if success return is empty. if unsuccessful it returns error message.
     */
    @JsonSetter("return_desc")
    public void setReturnDesc (String value) { 
        this.returnDesc = value;
    }
 
    /** GETTER
     * Text data to be used for printing the receipt.
     */
    @JsonGetter("qr_data")
    public String getQrData ( ) { 
        return this.qrData;
    }
    
    /** SETTER
     * Text data to be used for printing the receipt.
     */
    @JsonSetter("qr_data")
    public void setQrData (String value) { 
        this.qrData = value;
    }
 
    /** GETTER
     * Extra information for generel usage.
     */
    @JsonGetter("extra_info")
    public String getExtraInfo ( ) { 
        return this.extraInfo;
    }
    
    /** SETTER
     * Extra information for generel usage.
     */
    @JsonSetter("extra_info")
    public void setExtraInfo (String value) { 
        this.extraInfo = value;
    }
 
}
