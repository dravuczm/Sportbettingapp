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
public class OutcomeOdd {
    BigDecimal value;
    LocalDateTime validFrom;
    LocalDateTime validUntil;
    Outcome outcome;

    public OutcomeOdd() {
    }
    
    
    public OutcomeOdd(BigDecimal value, LocalDateTime validFrom, LocalDateTime validUntil, Outcome outcome){
        this.value=value;
        this.validFrom=validFrom;
        this.validUntil=validUntil;
        this.outcome=outcome;
    }
}
