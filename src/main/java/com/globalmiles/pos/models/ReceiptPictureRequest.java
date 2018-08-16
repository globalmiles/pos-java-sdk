/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ReceiptPictureRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 644928521883650761L;
    private String terminalId;
    private int recognitionId;
    private String fileName;
    private String picture;
    /** GETTER
     * Terminal ID.
     */
    @JsonGetter("terminal_id")
    public String getTerminalId ( ) { 
        return this.terminalId;
    }
    
    /** SETTER
     * Terminal ID.
     */
    @JsonSetter("terminal_id")
    public void setTerminalId (String value) { 
        this.terminalId = value;
    }
 
    /** GETTER
     * Session based user identification number.
     */
    @JsonGetter("recognition_id")
    public int getRecognitionId ( ) { 
        return this.recognitionId;
    }
    
    /** SETTER
     * Session based user identification number.
     */
    @JsonSetter("recognition_id")
    public void setRecognitionId (int value) { 
        this.recognitionId = value;
    }
 
    /** GETTER
     * File name of the picture.
     */
    @JsonGetter("file_name")
    public String getFileName ( ) { 
        return this.fileName;
    }
    
    /** SETTER
     * File name of the picture.
     */
    @JsonSetter("file_name")
    public void setFileName (String value) { 
        this.fileName = value;
    }
 
    /** GETTER
     * Base64 encoded binary picture data.
     */
    @JsonGetter("picture")
    public String getPicture ( ) { 
        return this.picture;
    }
    
    /** SETTER
     * Base64 encoded binary picture data.
     */
    @JsonSetter("picture")
    public void setPicture (String value) { 
        this.picture = value;
    }
 
}
 