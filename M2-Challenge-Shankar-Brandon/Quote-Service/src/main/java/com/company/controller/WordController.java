package com.company.controller;

import com.company.models.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WordController {

    private static int idCounter = 1;

    private static ArrayList<Word> wordList = new ArrayList<>(Arrays.asList(

            //definitions from merriam-webster.com

            new Word("package", "the act or process of packing", idCounter++),
            new Word("analyst", "a person who analyzes or who is skilled in analysis", idCounter++),
            new Word("opinion", "a view, judgement, or appraisal formed in the mind about a particular matter", idCounter++),
            new Word("trouble", "the quality or state of being troubled especially mentally", idCounter++),
            new Word("central", "containing or constituting a center", idCounter++),
            new Word("realize", "to bring into concrete existence", idCounter++),
            new Word("crevice", "a narrow opening resulting from a split or crack", idCounter++),
            new Word("secular", "of or relating to the worldly or temporal", idCounter++),
            new Word("venture", "to proceed especially in the face of danger", idCounter++),
            new Word("offense", "something that outrages the moral or physical senses", idCounter++)

    ));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public List<Word> getRandomWord()   {
        return wordList;
    }




}
