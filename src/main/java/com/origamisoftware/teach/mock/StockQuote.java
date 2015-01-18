package com.origamisoftware.teach.mock;

import java.math.BigDecimal;
import java.util.Date;

/**
 * This class contains information about a stock.
 * This class in immutable. It holds stock info for a given point time.
 */
public class StockQuote {

    private String stockSymbol;
    private BigDecimal stockPrice;
    private Date dateRecorded;


    /**
     *  Create a new  StockData instance
     * @param dateRecorded  the date the stock info was recorded.
     * @param stockPrice the price of the stock for the provided date
     * @param stockSymbol the stock symbol e.g. APPL (for APPLE)
     */
    public StockQuote(Date dateRecorded, BigDecimal stockPrice, String stockSymbol) {
        this.dateRecorded = dateRecorded;
        this.stockPrice = stockPrice;
        this.stockSymbol = stockSymbol;
    }


    /**
     *
     * @return the symbol that represents the company whose stock this is.
     * e.g. APPL for APPLE
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     *
     * @return The price of one share of stock.
     */
    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    /**
     *
     * @return the date of the stock price.
     */
    public Date getDateRecorded() {
        return dateRecorded;
    }
}
