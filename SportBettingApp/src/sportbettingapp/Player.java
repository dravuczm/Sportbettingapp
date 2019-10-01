/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Marci
 */
public class Player {
    String name;
    Integer accountNumber;
    BigDecimal balance;
    LocalDate birth;
    Currency currency;

    public Player() {
    }

    
    public Player(String name, Integer accountNumber, BigDecimal balance, LocalDate birth, Currency currency) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.birth = birth;
        this.currency = currency;
    }
    
  
}
