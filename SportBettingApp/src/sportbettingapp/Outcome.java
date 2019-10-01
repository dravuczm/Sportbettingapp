/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marci
 */
public class Outcome {
    String description;
    Bet bet;
    List<OutcomeOdd> outcomeOdds=new ArrayList<OutcomeOdd>();
    
    public Outcome(String description, Bet bet){
        this.description=description;
        this.bet=bet;
    }
}
