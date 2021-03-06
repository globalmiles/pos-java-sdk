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
public class ReceiptPictureResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4744805546680831632L;
    private String returnCode;
    private String returnDesc;
    /** GETTER
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    @JsonGetter("return_code")
    public String getReturnCode ( ) { 
        return this.returnCode;
    }
    
    /** SETTER
     * 0  Success, 1 and bigger than 1 unsuccessful.
     */
    @JsonSetter("return_code")
    public void setReturnCode (String value) { 
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
 
}
