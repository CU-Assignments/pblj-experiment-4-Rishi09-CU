//4.2-> Create a program to collect and store all the cards to assist the users in finding all the cards in a given symbol using Collection interface.
import java.util.*;

public class CardCollection {
    public static void main(String[] args) {
        Map<String, List<String>> cardMap = new HashMap<>();

        addCard(cardMap, "Hearts", "Ace of Hearts");
        addCard(cardMap, "Hearts", "King of Hearts");
        addCard(cardMap, "Diamonds", "Queen of Diamonds");
        addCard(cardMap, "Clubs", "Jack of Clubs");
        addCard(cardMap, "Spades", "10 of Spades");

        String symbol = "Hearts";
        System.out.println("Cards in " + symbol + ": " + getCardsBySymbol(cardMap, symbol));
    }

    private static void addCard(Map<String, List<String>> cardMap, String symbol, String card) {
        cardMap.putIfAbsent(symbol, new ArrayList<>());
        cardMap.get(symbol).add(card);
    }

    private static List<String> getCardsBySymbol(Map<String, List<String>> cardMap, String symbol) {
        return cardMap.getOrDefault(symbol, new ArrayList<>());
    }
}