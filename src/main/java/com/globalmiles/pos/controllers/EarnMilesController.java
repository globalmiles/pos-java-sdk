/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.globalmiles.pos.*;
import com.globalmiles.pos.models.*;
import com.globalmiles.pos.exceptions.*;
import com.globalmiles.pos.http.client.HttpClient;
import com.globalmiles.pos.http.client.HttpContext;
import com.globalmiles.pos.http.request.HttpRequest;
import com.globalmiles.pos.http.response.HttpResponse;
import com.globalmiles.pos.http.response.HttpStringResponse;
import com.globalmiles.pos.http.client.APICallBack;
import com.globalmiles.pos.controllers.syncwrapper.APICallBackCatcher;

public class EarnMilesController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static EarnMilesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the EarnMilesController class 
     */
    public static EarnMilesController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new EarnMilesController();
                }
            }
        }
        return instance;
    }

    /**
     * After getting customer info by Get Customer Info endpoint and finished the shopping procedure in POS terminal, use this endpoint to complete transaction.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the TransactionResultResponse response from the API call 
     */
    public TransactionResultResponse createTransactionResult(
                final TransactionResultRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateTransactionResultRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateTransactionResultResponse(_context);
    }

    /**
     * After getting customer info by Get Customer Info endpoint and finished the shopping procedure in POS terminal, use this endpoint to complete transaction.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createTransactionResultAsync(
                final TransactionResultRequest body,
                final APICallBack<TransactionResultResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateTransactionResultRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            TransactionResultResponse returnValue = _handleCreateTransactionResultResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createTransactionResult
     */
    private HttpRequest _buildCreateTransactionResultRequest(
                final TransactionResultRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/transaction_result");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        String authorizationHeader;
        try {
            authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            throw new APIException(e.getMessage(), null);
        }
        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();

        _headers.put( "Authorization", authorizationHeader);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");
        _headers.put("content-type", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createTransactionResult
     * @return An object of type void
     */
    private TransactionResultResponse _handleCreateTransactionResultResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        TransactionResultResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<TransactionResultResponse>(){});

        return _result;
    }

}
