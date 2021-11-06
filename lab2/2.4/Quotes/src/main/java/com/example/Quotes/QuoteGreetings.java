package com.example.Quotes;
import com.example.Quotes.Quote;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
public class QuoteGreetings {

    private static final String template = "Quote: %s!";
    private static final String template1 = "Shows: %s!";

    @GetMapping("/api/quote")
    public String quote(@RequestParam(value = "name", defaultValue = "Error") String name) {
        Quote r1=new Quote();
        String quote1=r1.getQuotes();
        return String.format(template,quote1);
    }

    @GetMapping("/api/shows")
    public String shows(@RequestParam(value = "name", defaultValue = "Error") String name) {
        Quote r1=new Quote();
        String show1=r1.getShows();
        return String.format(template1,show1);
    }

    @GetMapping("/api/quotes")
    public String quotes(@RequestParam(value = "name", required = false, defaultValue = "Error") int name, Model model) {
        model.addAttribute("name",name);
        Quote r1=new Quote();
        String quote1=r1.getQuotes();
        return String.format(template,quote1);
    }
}
