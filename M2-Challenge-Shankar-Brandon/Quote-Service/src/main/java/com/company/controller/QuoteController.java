package com.company.controller;

import com.company.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuoteController {

    private static int idCounter = 1;

    private static ArrayList<Quote> quoteList = new ArrayList<>(Arrays.asList(

            //Quotes from coda.io
            new Quote("Louis L'Amour", "There will come a time when you believe everything is finished. That will be the beginning.", idCounter++),
            new Quote("Scott Adams", "Mission Statement: A long awkward sentence that demonstrates management's inability to think clearly. ", idCounter++),
            new Quote("Lin-Manuel Miranda", "Imagine how you want to feel at the end of the day. Start working towards that now.", idCounter++),
            new Quote("Isaac Asimov", "People think of education as something they can finish.", idCounter++),
            new Quote("Erwan Le Corre", "As kids, we move a lot without thinking, but as grown-ups we think too much without moving.", idCounter++),
            new Quote("Bill Hybel", "My schedule is far less about what I want to get done and far more about who I want to become.", idCounter++),
            new Quote("Marcus Aurelius", "Perfection of character: to live your last day, every day, without frenzy, or sloth, or pretense.", idCounter++),
            new Quote("Thich Nhat Hanh", "There is no way to happiness -- happiness is the way.", idCounter++),
            new Quote("James Clear", "The truth is that the dreams that you have are very different from the actions that will get you there.", idCounter++),
            new Quote("Ernest Hemingway", " The world breaks everyone, and afterward many are strong at the broken places. But those that will not break it kills. .", idCounter++)

    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public List<Quote> getRandomQuote()   {
        return quoteList;
    }
}
