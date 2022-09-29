package com.company.Summative1AssessmentAguadzeMichael.controller;

import com.company.Summative1AssessmentAguadzeMichael.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteApiController {
    private int id = 1;

    private Random random;
    private  List<Quote> quote;


    public QuoteApiController() {

        random = new Random();
        quote = Arrays.asList(
                new Quote(id++, "Virgil", "Fortune favors the bold "),
                new Quote(id++,"John Lennon", "Life is what happens when you’re busy making other plans" ),
                new Quote(id++, "Joe Kennedy", "When the going gets tough, the tough get going."),
                new Quote(id++,"Mahatma Gandhi", "You must be the change you wish to see in the world." ),
                new Quote(id++, "Mae West", "You only live once, but if you do it right, once is enough."),
                new Quote(id++, "Robert H. Schuller","Tough times never last but tough people do." ),
                new Quote(id++, "Stephen King","Get busy living or get busy dying." ),
                new Quote(id++, "Henry Ford", "Whether you think you can or you think you can’t, you’re right."),
                new Quote(id++, "Alrded Lord Tennyson","Tis better to have loved and lost than to have never loved at all."),
                new Quote(id++, "Sir Francis Bacon","A man is but what he knows." ),
                new Quote(id++, "Wayne Gretzky", "You miss 100 percent of the shots you never take."),
                new Quote(id++, "Winston Churchill", "If you’re going through hell, keep going."),
                new Quote(id++, "Albert Einstein", "Strive not to be a success, but rather to be of value."),
                new Quote(id++, "Mark Twain", "Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do."),
                new Quote(id++, "Eleanor Roosevelt", "Great minds discuss ideas; average minds discuss events; small minds discuss people." ),
                new Quote(id++, "John F. Kennedy", "Those who dare to fail miserably can achieve greatly."),
                new Quote(id++,"Elie Wiesel", "The opposite of love is not hate; it’s indifference." ),
                new Quote(id++,"Lady Mary Montgomerie Currie", "All things come to those who wait." ),
                new Quote(id++, "Thomas Reid", "A chain is only as strong as its weakest link." ),
                new Quote(id++, "Edwin Sandys", "Honesty is the best policy."),
                new Quote(id++, "Thomas Howell", "Don’t count your chickens before they hatch."),
                new Quote(id++, "Marie von Ebner-Eschenbach",  "Even a stopped clock is right twice a day."),
                new Quote(id++, "Carl Theodor von Unlanski",  "Great minds think alike." ),
                new Quote(id++, "Robert Lloyd",  "Slow and steady wins the race" )


        );

    }


    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {

        return quote.get(random.nextInt(quote.size()));
    }

}
