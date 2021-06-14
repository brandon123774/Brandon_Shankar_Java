package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class AnswerController {

    private static final int idCounter = 1;
    List<String> answerList = new ArrayList<>(Arrays.asList(
            "Yes",
            "No",
            "Absolutely!",
            "Absolutely not!",
            "Maybe",
            "Don't count on it.",
            "Time will tell"
            )
    );

    List<String> questionList = new ArrayList<>(Collections.emptyList());


    //Create POST method for question

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    @ResponseBody
    public String createQuestion(@RequestBody String question) {
        questionList.add(question);
        return question;
    }
}


//@RequestMapping(value = "/magic", method = RequestMethod.POST)
//@ResponseStatus(value = HttpStatus.CREATED)
//    public String createQuestion(@RequestBody Magic magic)  {
//    }

//    get random answers for questions

//    String answer = "";
//       for(int i =0; i< answers.size(); i++)    {
//           Random random = new Random();
//           int randomAnswer = random.nextInt(answers.size());
//           answer = answers.get(randomAnswer);
//       }
//       magic.setAnswer(answer);
//       magic.setId(idCounter++);
//        return magic.getAnswer();
//
//    }
//}
