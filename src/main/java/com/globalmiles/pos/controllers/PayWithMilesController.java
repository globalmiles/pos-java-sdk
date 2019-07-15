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
    private static final Object syncObject = new Object();
    private static PayWithMilesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PayWithMilesController class 
     */
    public static PayWithMilesController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new PayWithMilesController();
                }
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

        HttpRequest _request = _buildDeleteCancelMilePaymentRequest(milesPaymentProvisionId, body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleDeleteCancelMilePaymentResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildDeleteCancelMilePaymentRequest(milesPaymentProvisionId, body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            CancelMilePaymentResponse returnValue = _handleDeleteCancelMilePaymentResponse(_context);
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
     * Builds the HttpRequest object for deleteCancelMilePayment
     */
    private HttpRequest _buildDeleteCancelMilePaymentRequest(
                final int milesPaymentProvisionId,
                final CancelMilePaymentRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/payments/{miles_payment_provision_id}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("miles_payment_provision_id", milesPaymentProvisionId);
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters);
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
        HttpRequest _request = getClientInstance().deleteBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for deleteCancelMilePayment
     * @return An object of type void
     */
    private CancelMilePaymentResponse _handleDeleteCancelMilePaymentResponse(HttpContext _context)
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
        CancelMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CancelMilePaymentResponse>(){});

        return _result;
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

        HttpRequest _request = _buildUpdateCompleteMilePaymentRequest(milesPaymentProvisionId, body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleUpdateCompleteMilePaymentResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildUpdateCompleteMilePaymentRequest(milesPaymentProvisionId, body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            CompleteMilePaymentResponse returnValue = _handleUpdateCompleteMilePaymentResponse(_context);
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
     * Builds the HttpRequest object for updateCompleteMilePayment
     */
    private HttpRequest _buildUpdateCompleteMilePaymentRequest(
                final int milesPaymentProvisionId,
                final CompleteMilePaymentRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/payments/{miles_payment_provision_id}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("miles_payment_provision_id", milesPaymentProvisionId);
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters);
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
        HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for updateCompleteMilePayment
     * @return An object of type void
     */
    private CompleteMilePaymentResponse _handleUpdateCompleteMilePaymentResponse(HttpContext _context)
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
        CompleteMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CompleteMilePaymentResponse>(){});

        return _result;
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

        HttpRequest _request = _buildCreateStartMilePaymentRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateStartMilePaymentResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildCreateStartMilePaymentRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            StartMilePaymentResponse returnValue = _handleCreateStartMilePaymentResponse(_context);
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
     * Builds the HttpRequest object for createStartMilePayment
     */
    private HttpRequest _buildCreateStartMilePaymentRequest(
                final StartMilePaymentRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/payments");
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
     * Processes the response for createStartMilePayment
     * @return An object of type void
     */
    private StartMilePaymentResponse _handleCreateStartMilePaymentResponse(HttpContext _context)
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
        StartMilePaymentResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<StartMilePaymentResponse>(){});

        return _result;
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

        HttpRequest _request = _buildGetMileProvisionsRequest(readCode, readCodeType, terminalId);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetMileProvisionsResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildGetMileProvisionsRequest(readCode, readCodeType, terminalId);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            GetMileProvisionsResponse returnValue = _handleGetMileProvisionsResponse(_context);
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
     * Builds the HttpRequest object for getMileProvisions
     */
    private HttpRequest _buildGetMileProvisionsRequest(
                final String readCode,
                final String readCodeType,
                final String terminalId) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/payments");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("read_code", readCode);
        _queryParameters.put("read_code_type", readCodeType);
        _queryParameters.put("terminal_id", terminalId);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
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


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getMileProvisions
     * @return An object of type void
     */
    private GetMileProvisionsResponse _handleGetMileProvisionsResponse(HttpContext _context)
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
        GetMileProvisionsResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetMileProvisionsResponse>(){});

        return _result;
    }

}
