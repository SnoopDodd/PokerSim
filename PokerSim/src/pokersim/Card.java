/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokersim;

/**
 *
 * @author Owen
 */
public class Card {

    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

        public static Rank[] ranks = Rank.values();
        private int cardValue;
        private Rank(int value) {
            this.cardValue = value;
        }
        public int getValue(){
            return cardValue;
        }
    }

    private enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }
}
