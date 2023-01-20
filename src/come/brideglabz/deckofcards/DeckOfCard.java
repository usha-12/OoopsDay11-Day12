package come.brideglabz.deckofcards;

public class DeckOfCard {
    public static void main(String[] args) {
        String [] suits = {"Clubs", "Diamonds","Hearts", "Spades"};
        String [] rank = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"};
        // Initialize deck
        int number = suits.length * rank.length;
        String[] deck = new String[number];
        for (int i =0; i < rank.length; i++){
            for (int j = 0; j < suits.length; j++){
                deck[suits.length*i+j] = rank[i] + " of " + suits[j];
            }
        }
        //use random function
        for (int i =0; i < number; i++){
            int ranDom = i + (int) (Math.random() * (number-i));
            String storeValue = deck[i];
            deck[ranDom] = deck[i];
            deck[i] = storeValue;
        }
        // print deck[i]
        for (int i = 0; i <number; i++){
            System.out.println(deck[i]);
        }
    }

}
/*4. Write a Program DeckOfCards.java, to initialize deck of cards having suit
("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
"9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
method and then distribute 9 Cards to 4 Players and Print the Cards received by
the 4 Players using 2D Array...*/
