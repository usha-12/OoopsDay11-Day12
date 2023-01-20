package come.brideglabz.deckofcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();

        final List<Card> deck = cards.createDeck();
        Collections.shuffle(deck);

        deck.forEach(System.out::println);
    }

    private List<Card> createDeck() {
        final List<Card> deck = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                deck.add(Card.of(suit, rank));
            }
        }
        return deck;
    }

    public enum Suit {
        Clubs,
        Spades,
        Diamonds,
        Hearts
    }

    public enum Rank {
        Ace("Ace"),
        King("King"),
        Queen("Queen"),
        Jack("Jack"),
        Ten("10"),
        Nine("9"),
        Eight("8"),
        Seven("7"),
        Six("6"),
        Five("5"),
        Four("4"),
        Three("3"),
        Two("2");

        private final String name;

        Rank(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Card {
        private final Suit suit;
        private final Rank rank;

        private Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public static Card of(Suit suit, Rank rank) {
            return new Card(suit, rank);
        }

        public Suit getSuit() {
            return suit;
        }

        public Rank getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return rank.getName() + " of " + suit;
        }
    }
}

/*5. Extend the above program to create a Player Object having Deck of Cards, and
having ability to Sort by Rank and maintain the cards in a Queue implemented
using Linked List. Do not use any Collection Library. Further the Players are also
arranged in Queue. Finally Print the Player and the Cards received by each
Player.*/

