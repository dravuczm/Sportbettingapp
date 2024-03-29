/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

import java.math.BigDecimal;
import static java.sql.DriverManager.println;
import java.util.List;

/**
 *
 * @author Marci
 */
public class View {

    public View() {
    }
    public void readPlayerData(Player player){
        String s="";
        s=s+player.name+"  "+player.accountNumber+"  "+player.balance+player.currency;
        System.out.println(s);
    }
    public void printWellcomeMessage(){
        System.out.println("Üdvözlet!");
    }
    public void printBalance(Player player){
        System.out.println(""+player.balance);
    }
    public void printOutcomeOdds(List<SportEvent> events){
      for (SportEvent event : events) 
        {for(Bet bet : event.betList)
        {
            for(Outcome outcome:bet.outcome)
            {for(OutcomeOdd odd:outcome.outcomeOdds){
                System.out.println(odd.outcome.description);
            }
            }
        } 
        }
    }
     public OutcomeOdd selectOutcomeOdd(List<SportEvent> events){
      for (SportEvent event : events) 
        {for(Bet bet : event.betList)
        {
            for(Outcome outcome:bet.outcome)
            {for(OutcomeOdd odd:outcome.outcomeOdds){
                return odd;
            }
            }
        } 
        }
      return new OutcomeOdd();
    }
    public void printWager(Wager wager){
        System.out.println( ""+wager.player.name+" "+wager.currency+" ");
    }
    public void printResult(List<SportEvent> events){
              for (SportEvent event : events) 
              {
                  System.out.println(event.title+": ");
                  for(Outcome outcome: event.result.winnerOutcomes){
                      System.out.println(outcome.description);
                  }
              }
              

    }
}
