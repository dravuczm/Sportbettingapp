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
public class SportsBettingService {

    List<Player> players=new ArrayList<Player>();
    public SportsBettingService() {
        
    }
    public void savePlayer(Player player){
        players.add(player);
    }
    
}
