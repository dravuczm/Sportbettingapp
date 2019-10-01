/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Marci
 */
public class Wager {
    BigDecimal amount;
    LocalDateTime timestampCreated;
    boolean processed;
    boolean win;
    OutcomeOdd odd;
}
