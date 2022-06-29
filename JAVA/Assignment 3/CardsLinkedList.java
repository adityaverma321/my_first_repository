import java.util.*;
public class CardsLinkedList {
    public static void main(String args[]) {
        ArrayList cardNo = new ArrayList<>();
        String a=Character.toString('A');
        cardNo.add(a);
        for (Integer i = 1; i < 10; i++) {
            String s=String.valueOf(i+1);
            cardNo.add(s);
        }
        cardNo.add("J");
        cardNo.add("K");
        cardNo.add("Q");
        ArrayList cardType = new ArrayList<>();
        cardType.add("C");
        cardType.add("H");
        cardType.add("D");
        cardType.add("S");
        ArrayList allcards = new ArrayList();
        for (Object no : cardNo) {
            for (Object t : cardType) {
                   String cardno=(String)no;
                   String cardtype=(String)t;
                   String card=cardno+cardtype;
                   allcards.add(card);
            }
        }
        Collections.shuffle(allcards);
        System.out.print(allcards);
    }
}