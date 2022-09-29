package com.company.Summative1AssessmentAguadzeMichael.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(WordApiController.class)
public class WordApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    //    Testing http method GET uri /word
    @Test
    public void shouldReturnWordOfTheDay() throws Exception {
//        Act
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
}