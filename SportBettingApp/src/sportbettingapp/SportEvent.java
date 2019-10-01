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
public class SportEvent {
    String title;
    LocalDateTime startDate;
    LocalDateTime endDate;
    List<Bet> betList=new ArrayList<Bet>();
    Result result;
}
