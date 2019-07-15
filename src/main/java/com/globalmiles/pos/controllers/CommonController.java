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
    private static final Object syncObject = new Object();
    private static CommonController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CommonController class 
     */
    public static CommonController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new CommonController();
                }
            }
        }
        return instance;
    }

    /**
     * This endpoint will help you to get terminal settings in order to use internal operations.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    terminalId    Required parameter: Terminal ID.
     * @return    Returns the GetTerminalInfoResponse response from the API call 
     */
    public GetTerminalInfoResponse getTerminalInfo(
                final String terminalId
    ) throws Throwable {

        HttpRequest _request = _buildGetTerminalInfoRequest(terminalId);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetTerminalInfoResponse(_context);
    }

    /**
     * This endpoint will help you to get terminal settings in order to use internal operations.
     * You can try this endpoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    terminalId    Required parameter: Terminal ID.
     * @return    Returns the void response from the API call 
     */
    public void getTerminalInfoAsync(
                final String terminalId,
                final APICallBack<GetTerminalInfoResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetTerminalInfoRequest(terminalId);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            GetTerminalInfoResponse returnValue = _handleGetTerminalInfoResponse(_context);
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
     * Builds the HttpRequest object for getTerminalInfo
     */
    private HttpRequest _buildGetTerminalInfoRequest(
                final String terminalId) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/terminal_info");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
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
     * Processes the response for getTerminalInfo
     * @return An object of type void
     */
    private GetTerminalInfoResponse _handleGetTerminalInfoResponse(HttpContext _context)
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
        GetTerminalInfoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTerminalInfoResponse>(){});

        return _result;
    }

    /**
     * This endpoint will help you to get customer's miles amount as a currency and unique identifier value. Unique identifier value must be used by Transaction Result endpint in order to complete shopping.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    readCode    Required parameter: Customer Identification Method; GSM, FFP ID, CODE or EMAIL
     * @param    readCodeType    Required parameter: 1: GSM, 2: FFP ID, 3: CODE, 4: EMAIL
     * @param    totalAmount    Required parameter: Total receipt amount.
     * @param    totalVatAmount    Required parameter: Total tax value.
     * @param    currency    Required parameter: ISO-4217 3-letter currency code.
     * @param    partnerId    Required parameter: Partner ID.
     * @param    branchId    Required parameter: Branch ID.
     * @param    terminalId    Required parameter: Terminal ID.
     * @return    Returns the GetCustomerInfoResponse response from the API call 
     */
    public GetCustomerInfoResponse getCustomerInfo(
                final String readCode,
                final String readCodeType,
                final double totalAmount,
                final double totalVatAmount,
                final String currency,
                final int partnerId,
                final int branchId,
                final String terminalId
    ) throws Throwable {

        HttpRequest _request = _buildGetCustomerInfoRequest(readCode, readCodeType, totalAmount, totalVatAmount, currency, partnerId, branchId, terminalId);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetCustomerInfoResponse(_context);
    }

    /**
     * This endpoint will help you to get customer's miles amount as a currency and unique identifier value. Unique identifier value must be used by Transaction Result endpint in order to complete shopping.
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    readCode    Required parameter: Customer Identification Method; GSM, FFP ID, CODE or EMAIL
     * @param    readCodeType    Required parameter: 1: GSM, 2: FFP ID, 3: CODE, 4: EMAIL
     * @param    totalAmount    Required parameter: Total receipt amount.
     * @param    totalVatAmount    Required parameter: Total tax value.
     * @param    currency    Required parameter: ISO-4217 3-letter currency code.
     * @param    partnerId    Required parameter: Partner ID.
     * @param    branchId    Required parameter: Branch ID.
     * @param    terminalId    Required parameter: Terminal ID.
     * @return    Returns the void response from the API call 
     */
    public void getCustomerInfoAsync(
                final String readCode,
                final String readCodeType,
                final double totalAmount,
                final double totalVatAmount,
                final String currency,
                final int partnerId,
                final int branchId,
                final String terminalId,
                final APICallBack<GetCustomerInfoResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetCustomerInfoRequest(readCode, readCodeType, totalAmount, totalVatAmount, currency, partnerId, branchId, terminalId);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            GetCustomerInfoResponse returnValue = _handleGetCustomerInfoResponse(_context);
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
     * Builds the HttpRequest object for getCustomerInfo
     */
    private HttpRequest _buildGetCustomerInfoRequest(
                final String readCode,
                final String readCodeType,
                final double totalAmount,
                final double totalVatAmount,
                final String currency,
                final int partnerId,
                final int branchId,
                final String terminalId) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/customer_info");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("read_code", readCode);
        _queryParameters.put("read_code_type", readCodeType);
        _queryParameters.put("total_amount", totalAmount);
        _queryParameters.put("total_vat_amount", totalVatAmount);
        _queryParameters.put("currency", currency);
        _queryParameters.put("partner_id", partnerId);
        _queryParameters.put("branch_id", branchId);
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
     * Processes the response for getCustomerInfo
     * @return An object of type void
     */
    private GetCustomerInfoResponse _handleGetCustomerInfoResponse(HttpContext _context)
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
        GetCustomerInfoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetCustomerInfoResponse>(){});

        return _result;
    }

    /**
     * This endpoint will help you to upload receipt pictures which is related with a recognition ID and a transaction result.
     * You can try this endoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the ReceiptPictureResponse response from the API call 
     */
    public ReceiptPictureResponse uploadReceiptPictures(
                final ReceiptPictureRequest body
    ) throws Throwable {

        HttpRequest _request = _buildUploadReceiptPicturesRequest(body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleUploadReceiptPicturesResponse(_context);
    }

    /**
     * This endpoint will help you to upload receipt pictures which is related with a recognition ID and a transaction result.
     * You can try this endoint with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * You can try this API with configuring client parameters in Console Tab below. Test OAuthClientId is b30359c21700fd6f2b91154adcb7b37bab3e7e0a33e22682e5dd149d7a6ac4df
     * and OAuthClientSecret is 4bc4335faad41d6a23cd059e495005f00496a64e34e6187b1d72695a8debd28c
     * @param    body    Required parameter: The body of the request.
     * @return    Returns the void response from the API call 
     */
    public void uploadReceiptPicturesAsync(
                final ReceiptPictureRequest body,
                final APICallBack<ReceiptPictureResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildUploadReceiptPicturesRequest(body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ReceiptPictureResponse returnValue = _handleUploadReceiptPicturesResponse(_context);
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
     * Builds the HttpRequest object for uploadReceiptPictures
     */
    private HttpRequest _buildUploadReceiptPicturesRequest(
                final ReceiptPictureRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2/pos/receipt_pictures");
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
     * Processes the response for uploadReceiptPictures
     * @return An object of type void
     */
    private ReceiptPictureResponse _handleUploadReceiptPicturesResponse(HttpContext _context)
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
        ReceiptPictureResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ReceiptPictureResponse>(){});

        return _result;
    }

}
