/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportbettingapp;

/**
 *
 * @author Marci
 */
public class View {

    public View() {
    }
    public void readPlayerData(Player player){
        String s="";
        s=s+player.name+"  "+player.accountNumber+"  "+player.balance+player.currency;
        System.out.print(s);
    }
}
