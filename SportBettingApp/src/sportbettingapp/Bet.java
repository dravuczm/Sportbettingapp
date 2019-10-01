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
public class Bet {
    String description;
    SportEvent event;
    List<Outcome> outcome=new ArrayList<Outcome>();
    BetType type;
    
    public Bet(String description, SportEvent event, BetType type){
        this.description=description;
        this.event=event;
        this.type=type;
    }
}
