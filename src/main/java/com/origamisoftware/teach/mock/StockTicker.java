package com.origamisoftware.teach.mock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * This class returns information about a stock
 */
public class StockTicker {

    /* IMPORTANT NOTE - if this was 'real code' I'd be using the JODA time date library
     ** it is the 'standard' library to use when dealing with dates and times in Java.
     ** I am not using it here to keep things simple!
     */

    private StockService stockService;

    /**
     * Create a new <CODE>StockTicker</CODE> instance
     *
     * @param stockService used to get actual stock data (external dependency)
     */
    public StockTicker(StockService stockService) {
        this.stockService = stockService;
    }

    /**
     * Get a list of stock prices for the date range specified
     *
     * @param symbol    the stock symbol to get the price for
     * @param startDate the first day to get the price for.
     * @param endDate   the last day to get the price for
     * @return a list of <CODE>StockData</CODE> instances - one for each day specified
     * in the date range provided.
     */
    public List<StockQuote> getStockHistory(String symbol, Date startDate, Date endDate) {
        Date date = startDate;
        List<StockQuote> returnValue = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        while (date.before(endDate)) {
            returnValue.add(stockService.getQuote(symbol, date));
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            date = calendar.getTime();
        }
        return returnValue;
    }

}
