package com.qa.accountmanager;
import org.springframework.stereotype.Service;

/**
 * PrizeDraw
 */
@Service
public class PrizeDraw {
    
    public int draw(String accNumber) {
        
        String firstLetter = Character.toString(accNumber.charAt(0)).toLowerCase();
        int accLength = accNumber.length();
        
        switch (accLength) {

            case 7:
                switch (firstLetter) {

                    case "a":
                    return 0;
                
                    case "b":
                    return 50;
        
                    case "c":
                    return 100;
    
                }
            case 9:
                switch (firstLetter) {

                    case "a":
                    return 0;

                    case "b":
                    return 500;
                    
                    case "c":
                    return 750;
                    
                }
            case 11:
                switch (firstLetter) {

                    case "a":
                    return 0;
                    
                    case "b":
                    return 5000;
                    
                    case "c":
                    return 10000;

                    default: break;
            }

        }
        return 0;
    }

    public int getPrize(Users user){
        PrizeDraw prize = new PrizeDraw();
        return prize.draw(user.getAccountNumber());
}
}