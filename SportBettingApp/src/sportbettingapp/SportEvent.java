/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marci
 */
public class SportEvent implements TennisSportEvent,FootballSportEvent{
    String title;
    LocalDateTime startDate;
    LocalDateTime endDate;
    List<Bet> betList=new ArrayList<Bet>();
    Result result;
    public SportEvent(){
        
    }
    public SportEvent(String title, LocalDateTime startdate,LocalDateTime enddate){
        this.title=title;
        this.startDate=startdate;
        this.endDate=enddate;
        this.result=new Result();
    }
}
