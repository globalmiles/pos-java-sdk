/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Discount 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4615422705251814393L;
    private String orijin;
    private String type;
    private String value;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("orijin")
    public String getOrijin ( ) { 
        return this.orijin;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("orijin")
    public void setOrijin (String value) { 
        this.orijin = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
}
 