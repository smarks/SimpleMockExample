package com.origamisoftware.teach.mock;

import java.util.Date;

/**
 *  This interface describes an API for getting stock data.
 */
public interface StockService {


    /**
     * Return the <CODE>StockData</CODE> for the given symbol for the given date.
     * Used to get history data for the stock.
     *
     * @param symbol the stock symbol of the company you want a quote for.
     *               e.g. APPL for APPLE
     * @param date specifies what date to get the stock quote for.
     *
     * @return a  StockData instance
     */
    StockQuote getQuote(String symbol, Date date);

}
