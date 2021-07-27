package ca.evanepio.boot.quotes.Quoter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteController {
    @Autowired
    QuoteConfigs quoteConfigs;

    @Value("${myquote}")
    private String myQuote;

    @GetMapping(value = "/quotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> quotes() {
        var myQuoteList = quoteConfigs.getQuotes();
        myQuoteList.add(myQuote);
        return myQuoteList;
    }
}
