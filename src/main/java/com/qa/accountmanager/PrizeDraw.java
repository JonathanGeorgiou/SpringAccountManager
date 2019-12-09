package com.qa.accountmanager;

import java.text.BreakIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PrizeDraw
 */
@Service
public class PrizeDraw {
    @Autowired
    public int draw(String accNumber){
        String firstLetter = Character.toString(accNumber.charAt(0)).toLowerCase();
        int accLength = accNumber.length();
        switch (accLength){

            case 7:

                switch(firstLetter){

                    case "a":
                    return 0;
                    break;

                    case "b":
                    return 50;
                    break;

                    case "c":
                    return 100;
                    break;

                }
            case 9:
                switch(firstLetter){

                    case "a":
                    return 0;
                    break;

                    case "b":
                    return 500;
                    break;

                    case "c":
                    return 750;
                    break;
                }
            case 11:
                switch(firstLetter){

                    case "a":
                    return 0;
                    break;

                    case "b":
                    return 5000;
                    break;

                    case "c":
                    return 10000;
                    break;


            }default: break;

        }return 0;
    }
}