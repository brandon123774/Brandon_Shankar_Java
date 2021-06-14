package com.company.controller;

import com.company.models.Magic;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {

    private static int idCounter = 1;
    List<String> answers = new ArrayList<>(Arrays.asList(
            "Yes",
            "No",
            "Absolutely!",
            "Absolutely not!",
            "Maybe",
            "Don't count on it.",
            "Time will tell"
            )
    );

@PostMapping(value = "/magic")
@ResponseStatus(value = HttpStatus.CREATED)
    public String createQuestion(@RequestBody Magic magic)  {

    //get random answers for questions
    String answer = "";
       for(int i =0; i< answers.size(); i++)    {
           Random random = new Random();
           int randomAnswer = random.nextInt(answers.size());
           answer = answers.get(randomAnswer);
       }
       magic.setAnswer(answer);
       magic.setId(idCounter++);
        return magic.getAnswer();

    }
}
