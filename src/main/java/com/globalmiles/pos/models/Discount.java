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
    private static final long serialVersionUID = -3842059329480167385L;
    private String origin;
    private String type;
    private double value;
    /** GETTER
     * Origin of the discount. 1: Global Miles, 2: Other.
     */
    @JsonGetter("origin")
    public String getOrigin ( ) { 
        return this.origin;
    }
    
    /** SETTER
     * Origin of the discount. 1: Global Miles, 2: Other.
     */
    @JsonSetter("origin")
    public void setOrigin (String value) { 
        this.origin = value;
    }
 
    /** GETTER
     * Type of the discount. 0: amount based, 1: rate based.
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Type of the discount. 0: amount based, 1: rate based.
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Value of the discount.
     */
    @JsonGetter("value")
    public double getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * Value of the discount.
     */
    @JsonSetter("value")
    public void setValue (double value) { 
        this.value = value;
    }
 
}
 