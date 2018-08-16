/*
 * GlobalMilesPos
 *
 * This file was automatically generated for Global Miles by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.pos.models;

import java.util.*;

public class GetTerminalInfoResponseBuilder {
    //the instance to build
    private GetTerminalInfoResponse getTerminalInfoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetTerminalInfoResponseBuilder() {
        getTerminalInfoResponse = new GetTerminalInfoResponse();
    }

    /**
     * 0 Success, 1 and bigger than 1 unsuccessful.
     */
    public GetTerminalInfoResponseBuilder returnCode(int returnCode) {
        getTerminalInfoResponse.setReturnCode(returnCode);
        return this;
    }

    /**
     * if success return is empty. if unsuccessful it returns error message.
     */
    public GetTerminalInfoResponseBuilder returnDesc(String returnDesc) {
        getTerminalInfoResponse.setReturnDesc(returnDesc);
        return this;
    }

    /**
     * Terminal ID.
     */
    public GetTerminalInfoResponseBuilder terminalId(String terminalId) {
        getTerminalInfoResponse.setTerminalId(terminalId);
        return this;
    }

    /**
     * Header text for the receipt.
     */
    public GetTerminalInfoResponseBuilder receiptHeader(String receiptHeader) {
        getTerminalInfoResponse.setReceiptHeader(receiptHeader);
        return this;
    }

    /**
     * Footer text for the receipt.
     */
    public GetTerminalInfoResponseBuilder receiptFooter(String receiptFooter) {
        getTerminalInfoResponse.setReceiptFooter(receiptFooter);
        return this;
    }

    /**
     * Partner ID.
     */
    public GetTerminalInfoResponseBuilder partnerId(int partnerId) {
        getTerminalInfoResponse.setPartnerId(partnerId);
        return this;
    }

    /**
     * Branch ID.
     */
    public GetTerminalInfoResponseBuilder branchId(int branchId) {
        getTerminalInfoResponse.setBranchId(branchId);
        return this;
    }

    /**
     * Indicates whether the merchant ID parameter is required in the Transaction Result request.
     */
    public GetTerminalInfoResponseBuilder merchantIdMandatory(boolean merchantIdMandatory) {
        getTerminalInfoResponse.setMerchantIdMandatory(merchantIdMandatory);
        return this;
    }

    /**
     * ISO-4217 3-letter default currency code for the partner.
     */
    public GetTerminalInfoResponseBuilder defaultCurrency(String defaultCurrency) {
        getTerminalInfoResponse.setDefaultCurrency(defaultCurrency);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTerminalInfoResponse build() {
        return getTerminalInfoResponse;
    }
}