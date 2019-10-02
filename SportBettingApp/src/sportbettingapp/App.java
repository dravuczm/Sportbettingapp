/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author Marci
 */
public class App {

    /**
     * @param args the command line arguments
     */
     static SportsBettingService service=new SportsBettingService();
       static View view=new View();
       
       public static SportEvent Test(){
           Player player=new Player("Kovács József",001,new BigDecimal("1000.03"),LocalDate.now(),Currency.HUF);
           service.savePlayer(player);
           SportEvent event=new SportEvent("Focimeccs", LocalDateTime.now(),LocalDateTime.now());
           Bet bet1= new Bet("Gólok", event, BetType.GOALS);
           Bet bet2= new Bet("Győztes", event, BetType.WINNER);
           event.betList.add(bet1);
           event.betList.add(bet2);
           Outcome outcome1=new Outcome("több mint 1", bet1);
           bet1.outcome.add(outcome1);
           Outcome outcome2=new Outcome("1",bet1);
           bet1.outcome.add(outcome2);
           Outcome outcome3=new Outcome("Fradi",bet2);
           bet2.outcome.add(outcome3);
           OutcomeOdd odd1=new OutcomeOdd(new BigDecimal("1000"), LocalDateTime.now(), LocalDateTime.now(), outcome1);
           outcome1.outcomeOdds.add(odd1);
            OutcomeOdd odd2=new OutcomeOdd(new BigDecimal("2000"), LocalDateTime.now(), LocalDateTime.now(), outcome1);
           outcome1.outcomeOdds.add(odd2);
            OutcomeOdd odd3=new OutcomeOdd(new BigDecimal("1000"), LocalDateTime.now(), LocalDateTime.now(), outcome2);
           outcome2.outcomeOdds.add(odd3);
            OutcomeOdd odd4=new OutcomeOdd(new BigDecimal("1000"), LocalDateTime.now(), LocalDateTime.now(), outcome3);
           outcome3.outcomeOdds.add(odd4);
return event;
           
       }
    public static void main(String[] args) {
      SportEvent event= Test();
      service.events.add(event);
        service.calculateResults();
        view.readPlayerData(service.players.get(0));
        view.printOutcomeOdds(service.events);
        view.printResult(service.events);
        
    }
    public static void createPlayer(){
        Player player=new Player();
        
    }
    public static void addBet(){
        service.events.get(0).betList.add(new Bet("Fogadás:",service.events.get(0),BetType.WINNER));
    }
}
