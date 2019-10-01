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

    List<Player> players=new ArrayList<Player>();
    List<SportEvent> events=new ArrayList<SportEvent>();
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
    
    public void calculateResults(){
        for (SportEvent event : events) 
        {
            for (Bet bet : event.betList) 
            {
                Random rand = new Random();
                int n = rand.nextInt(bet.outcome.size());
                bet.outcome.get(n);
                

            }


        }

    }
}
