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

public class PayWithMilesController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static PayWithMilesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PayWithMilesController class 
     */
    public static PayWithMilesController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new PayWithMilesController();
            }
        }
        return instance;
    }

    /**
     * In order to cancel payment with miles you can use this endpoint. It allows to cancel payment only related GSM and terminal ID numbers.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    milesPaymentProvisionId    Required parameter: Provision ID.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the CancelMilePaymentResponse response from the API call 
     */
    public CancelMilePaymentResponse deleteCancelMilePayment(
                final int milesPaymentProvisionId,
                final CancelMilePaymentRequest body
    ) throws Throwable {
        APICallBackCatcher<CancelMilePaymentResponse> callback = new APICallBackCatcher<CancelMilePaymentResponse>();
        deleteCancelMilePaymentAsync(milesPaymentProvisionId, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * In order to cancel payment with miles you can use this endpoint. It allows to cancel payment only related GSM and terminal ID numbers.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    milesPaymentProvisionId    Required parameter: Provision ID.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void deleteCancelMilePaymentAsync(
                final int milesPaymentProvisionId,
                final CancelMilePaymentRequest body,
                final APICallBack<CancelMilePaymentResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/pos/payments/{miles_payment_provision_id}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 1662038571660337302L;
                    {
                        put( "miles_payment_provision_id", milesPaymentProvisionId );
                    }});
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
                    private static final long serialVersionUID = 6809502995245157700L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                HttpRequest _request;
                try {
                    _request = getClientInstance().deleteBody(_queryUrl, _headers, APIHelper.serialize(body));
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
                            CancelMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CancelMilePaymentResponse>(){});

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

    /**
     * In order to finalize payment with miles use this endpoint. Use the OTP number which is send to user GSM on the Request body.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    milesPaymentProvisionId    Required parameter: Provision ID.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the CompleteMilePaymentResponse response from the API call 
     */
    public CompleteMilePaymentResponse updateCompleteMilePayment(
                final int milesPaymentProvisionId,
                final CompleteMilePaymentRequest body
    ) throws Throwable {
        APICallBackCatcher<CompleteMilePaymentResponse> callback = new APICallBackCatcher<CompleteMilePaymentResponse>();
        updateCompleteMilePaymentAsync(milesPaymentProvisionId, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * In order to finalize payment with miles use this endpoint. Use the OTP number which is send to user GSM on the Request body.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    milesPaymentProvisionId    Required parameter: Provision ID.
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void updateCompleteMilePaymentAsync(
                final int milesPaymentProvisionId,
                final CompleteMilePaymentRequest body,
                final APICallBack<CompleteMilePaymentResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/pos/payments/{miles_payment_provision_id}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 1662038571660337302L;
                    {
                        put( "miles_payment_provision_id", milesPaymentProvisionId );
                    }});
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
                    private static final long serialVersionUID = 6809502995245157700L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                HttpRequest _request;
                try {
                    _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(body));
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
                            CompleteMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CompleteMilePaymentResponse>(){});

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

    /**
     * After getting customer info's and RecognitionID to start Payment with Miles Use this endpoint.
     * After calling this endpoint successfully OTP code send to customer GSM number. This OTP must be used with Complete endpoint in order to complete payment.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the StartMilePaymentResponse response from the API call 
     */
    public StartMilePaymentResponse createStartMilePayment(
                final StartMilePaymentRequest body
    ) throws Throwable {
        APICallBackCatcher<StartMilePaymentResponse> callback = new APICallBackCatcher<StartMilePaymentResponse>();
        createStartMilePaymentAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * After getting customer info's and RecognitionID to start Payment with Miles Use this endpoint.
     * After calling this endpoint successfully OTP code send to customer GSM number. This OTP must be used with Complete endpoint in order to complete payment.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void createStartMilePaymentAsync(
                final StartMilePaymentRequest body,
                final APICallBack<StartMilePaymentResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/pos/payments");
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
                    private static final long serialVersionUID = 6809502995245157700L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
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
                            StartMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<StartMilePaymentResponse>(){});

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

    /**
     * Before cancelling the payment with miles this endpoint is used to list the related sale.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    readCode    Required parameter: Customer Identification Method; GSM, FFP ID, CODE or EMAIL.
     * @param    readCodeType    Required parameter: 1: GSM, 2: FFP ID, 3: CODE, 4: EMAIL
     * @param    terminalId    Required parameter: Terminal ID.
     * @return    Returns the GetMileProvisionsResponse response from the API call 
     */
    public GetMileProvisionsResponse getMileProvisions(
                final String readCode,
                final String readCodeType,
                final String terminalId
    ) throws Throwable {
        APICallBackCatcher<GetMileProvisionsResponse> callback = new APICallBackCatcher<GetMileProvisionsResponse>();
        getMileProvisionsAsync(readCode, readCodeType, terminalId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Before cancelling the payment with miles this endpoint is used to list the related sale.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    readCode    Required parameter: Customer Identification Method; GSM, FFP ID, CODE or EMAIL.
     * @param    readCodeType    Required parameter: 1: GSM, 2: FFP ID, 3: CODE, 4: EMAIL
     * @param    terminalId    Required parameter: Terminal ID.
     * @return    Returns the void response from the API call 
     */
    public void getMileProvisionsAsync(
                final String readCode,
                final String readCodeType,
                final String terminalId,
                final APICallBack<GetMileProvisionsResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v2/pos/payments");

                //process query parameters
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 4967065967958336074L;
                    {
                        put( "read_code", readCode );
                        put( "read_code_type", readCodeType );
                        put( "terminal_id", terminalId );
                    }});
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
                    private static final long serialVersionUID = 6037128998165026643L;
                    {
                        put( "Authorization", authorizationHeader);
                        put( "user-agent", "APIMATIC 2.0" );
                        put( "accept", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

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
                            GetMileProvisionsResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetMileProvisionsResponse>(){});

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