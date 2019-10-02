/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Marci
 */
public class SportsBettingService {
               static Random rand = new Random();

    List<Player> players=new ArrayList<Player>();
    List<SportEvent> events=new ArrayList<SportEvent>();
        List<Wager> wagers=new ArrayList<Wager>();

    public SportsBettingService() {
        
    }
    public void savePlayer(Player player){
        players.add(player);
    }
    public Player findPlayer(Player player){
        for (Player var : players) 
{ 
    if(var==player){
        return var;
    }
}
        return new Player();
}
    public List<SportEvent> findAllEvent(){
        return this.events;
    }
    
    public void calculateResults(){
        for (SportEvent event : events) 
        {
            for (Bet bet : event.betList) 
            {
                int n = rand.nextInt(bet.outcome.size());
             
                event.result.winnerOutcomes.add(bet.outcome.get(n));

            }


        }

    }
    public void saveWager(Wager wager){
        wagers.add(wager);
    }
    public List<Wager> findallWagers(){
        return wagers;
    }
    
}
