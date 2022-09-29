package com.company.Summative1AssessmentAguadzeMichael.controller;

import com.company.Summative1AssessmentAguadzeMichael.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordApiController {

    private int id;

    private Random random;

    private List<Definition> words;

    public WordApiController() {
        random = new Random();
        words = Arrays.asList(
                new Definition(id++,"anomaly ", "something that is unusual or unexpected " ),
                new Definition(id++, "equivocal ", "not easily understood or explained"),
                new Definition(id++, "lucid", "very clear and easy to understand"),
                new Definition(id++, "precipitate", "to cause (something) to happen quickly or suddenly"),
                new Definition(id++, "assuage", "to make (an unpleasant feeling) less intense"),
                new Definition(id++, "erudite", "having or showing great knowledg"),
                new Definition(id++, "opaque", "not able to be seen through; not easily understood"),
                new Definition(id++, "prodigal", "wastefully extravagant"),
                new Definition(id++, "enigma", "a person or thing that is mysterious, puzzling, or difficult to understand"),
                new Definition(id++, "fervid", " intensely enthusiastic or passionate"),
                new Definition(id++, "placate", "to make (someone) less angry or hostile"),
                new Definition(id++, "zeal","a strong feel of interest and enthusiasm that makes someone very eager or determined to do something " ),
                new Definition(id++, "audacious", "a willingness to take bold risks"),
                new Definition(id++, "desiccate ", "remove the moisture from something "),
                new Definition(id++, "gullible", "easily persuaded to believe something ")
        );
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getWord(){
        return words.get(random.nextInt(words.size()));
    }
}
