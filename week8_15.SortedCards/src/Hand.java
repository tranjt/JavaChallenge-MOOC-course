
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class Hand  implements Comparable<Hand>{

    private ArrayList<Card> cards = new ArrayList<Card>();

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public int compareTo(Hand otherHand) {
        int thisHandSum = getValueSum(this);
        int otherHandSum = getValueSum(otherHand);
        if (thisHandSum > otherHandSum) {
            return 1;
        } else if (thisHandSum == otherHandSum) {
            return 0;
        }
        return -1;
    }

    private int getValueSum(Hand hand) {
        int sum = 0;
        for (Card card : hand.cards) {
            sum += card.getValue();
        }
        return sum;
    }
    
    public void sortAgainstSuit() {
          SortAgainstSuitAndValue  suitValueSorter = new SortAgainstSuitAndValue ();
          Collections.sort(this.cards, suitValueSorter);
    }

}
