package com.company.Summative1AssessmentAguadzeMichael.controller;

import com.company.Summative1AssessmentAguadzeMichael.models.Answer;
import com.company.Summative1AssessmentAguadzeMichael.models.MagicQuestion;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8BallApiController {

    private int id;

    private Random random;

    private List<Answer> answers;

    public Magic8BallApiController() {
        id = 0;
        random = new Random();

        answers = Arrays.asList(
                new Answer(id++, "It is certain."),
                new Answer(id++, "It is decided so."),
                new Answer(id++, "Without a doubt."),
                new Answer(id++, "Yes definitely"),
                new Answer(id++, "You may rely on it"),
                new Answer(id++, "As I see it, yes"),
                new Answer(id++, "Most likely"),
                new Answer(id++, "Outlook good"),
                new Answer(id++, "Signs point to yes"),
                new Answer(id++, "Reply hazy, try again"),
                new Answer(id++, "Ask again later"),
                new Answer(id++, "Better not tell you"),
                new Answer(id++, "Cannot predict now"),
                new Answer(id++, "Concentrate and ask again"),
                new Answer(id++, "Dont count on it"),
                new Answer(id++, "My reply is no"),
                new Answer(id++, "My sources say no"),
                new Answer(id++, "Outlook not so good"),
                new Answer(id++, "Very doubtful")

        );

    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer getAnswer(@RequestBody @Valid MagicQuestion question) {

      Answer response =  answers.get(random.nextInt(answers.size()));
     response.setQuestion(question);
     return response;
    }
}
