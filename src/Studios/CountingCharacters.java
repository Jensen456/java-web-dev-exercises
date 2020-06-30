package Studios;

import java.util.ArrayList;

public class CountingCharacters {
    public static void main(String[] args) {
        String hiddenFigures = "If the product of two terms is zero then common sense says at least " +
                "one of the two terms has to be zero to start with.  So if you move all the terms over " +
                "to one side, you can put the quadratics into a form that can be factored allowing" +
                "that side of the equation to equal zero.  Once you've done that, it's pretty straightforward" +
                " from there.";
        String lowerCase = hiddenFigures.toLowerCase();
        //System.out.println(lowerCase);
        String[] hiddenFiguresArray = new String[100];
        char[] characterArray = lowerCase.toCharArray();
        System.out.println(characterArray);
        //ArrayList<Character> hiddenFiguresArrayList = new ArrayList<>;
        //for (i=0; i<hiddenFiguresArrayList.size);
        //System.out.println(hiddenFiguresArray);

    }
}
