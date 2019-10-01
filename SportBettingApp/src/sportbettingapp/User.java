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
public class User extends Player{
    String email;
    String password;

    public User() {
    }

    
    public User(String email, String password, String name, Integer accountNumber, BigDecimal balance, LocalDate birth, Currency currency) {
        super(name, accountNumber, balance, birth, currency);
        this.email = email;
        this.password = password;
    }

   
    
   
}
