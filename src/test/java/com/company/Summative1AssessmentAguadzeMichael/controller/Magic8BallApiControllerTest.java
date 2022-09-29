package com.company.Summative1AssessmentAguadzeMichael.controller;

import com.company.Summative1AssessmentAguadzeMichael.models.MagicQuestion;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Magic8BallApiController.class)
public class Magic8BallApiControllerTest{

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void shouldReturnAnswerWithProvidedMagicQuestion() throws Exception {
//        Arrange
        MagicQuestion MagicQuestion = new MagicQuestion("Will it rain?");
        String jsonInput = objectMapper.writeValueAsString(MagicQuestion);


        mockMvc.perform(
                        post("/magic")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(jsonInput))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
}