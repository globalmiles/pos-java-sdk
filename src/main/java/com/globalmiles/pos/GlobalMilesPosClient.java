/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos;

import com.globalmiles.pos.controllers.*;
import com.globalmiles.pos.http.client.HttpClient;

public class GlobalMilesPosClient {
    /**
     * Singleton access to PayWithMiles controller
     * @return	Returns the PayWithMilesController instance 
     */
    public PayWithMilesController getPayWithMiles() {
        return PayWithMilesController.getInstance();
    }

    /**
     * Singleton access to Authentication controller
     * @return	Returns the AuthenticationController instance 
     */
    public AuthenticationController getAuthentication() {
        return AuthenticationController.getInstance();
    }

    /**
     * Singleton access to EarnMiles controller
     * @return	Returns the EarnMilesController instance 
     */
    public EarnMilesController getEarnMiles() {
        return EarnMilesController.getInstance();
    }

    /**
     * Singleton access to Common controller
     * @return	Returns the CommonController instance 
     */
    public CommonController getCommon() {
        return CommonController.getInstance();
    }

    /**
     * Singleton access to OAuthAuthorization controller
     * @return	Returns the OAuthAuthorizationController instance 
     */
    public OAuthAuthorizationController getOAuthAuthorization() {
        return OAuthAuthorizationController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Get authentication manager
     */
    public OAuthManager auth() {
        return OAuthManager.getInstance();
    }

    /**
     * Default constructor 
     */     
    public GlobalMilesPosClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public GlobalMilesPosClient(String oAuthClientId, String oAuthClientSecret) {
        this();
        Configuration.oAuthClientId = oAuthClientId;
        Configuration.oAuthClientSecret = oAuthClientSecret;
    }
}