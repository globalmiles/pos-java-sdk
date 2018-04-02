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

public class CommonController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static CommonController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CommonController class 
     */
    public static CommonController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new CommonController();
            }
        }
        return instance;
    }

    /**
     * This API will help you to retrieve customer's mil quantity and unique identifier value.Unique identifier value must be used by Transaction Result API in order to complete shopping.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the GetCustomerInfoResponse response from the API call 
     */
    public GetCustomerInfoResponse createGetCustomerInfo(
                final String accept,
                final String contentType,
                final String authorization,
                final GetCustomerInfoRequest body
    ) throws Throwable {
        APICallBackCatcher<GetCustomerInfoResponse> callback = new APICallBackCatcher<GetCustomerInfoResponse>();
        createGetCustomerInfoAsync(accept, contentType, authorization, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This API will help you to retrieve customer's mil quantity and unique identifier value.Unique identifier value must be used by Transaction Result API in order to complete shopping.
     * @param    accept    Required parameter: It advertises which content type is able to understand.
     * @param    contentType    Required parameter: It tells the client what the content type of the returned.
     * @param    authorization    Required parameter: It includes OAuth2 token.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createGetCustomerInfoAsync(
                final String accept,
                final String contentType,
                final String authorization,
                final GetCustomerInfoRequest body,
                final APICallBack<GetCustomerInfoResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/pos/GetCustomerInfo");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                final String authorizationHeader;
                try {
                    authorizationHeader = OAuthManager.getInstance().getAuthorizationHeader();
                } catch (Throwable e) {
                   callBack.onFailure(null, e);
                   return;
                }
                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 4810934169922923373L;
                    {
                        put( "Accept", accept );
                        put( "Content-Type", contentType );
                        put( "Authorization", authorization );
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                HttpRequest _request;
                try {
                    _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetCustomerInfoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetCustomerInfoResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}