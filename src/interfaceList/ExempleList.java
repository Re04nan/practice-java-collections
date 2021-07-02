package interfaceList;

import java.util.*;

public class ExempleList {

    public static void main(String[] args){

        List<String> wizards = new ArrayList<>(Arrays.asList("Hermione Granger", "Harry Potter"));
        System.out.println(wizards);
        wizards.add("Ronald Weasley");
        System.out.println(wizards);
        System.out.println(wizards.contains("Ronald Weasley"));
        System.out.println(wizards.indexOf("Harry Potter"));

        Collections.sort(wizards);

        for (String listNames: wizards){
            System.out.println(listNames);
        }
        Iterator<String> listTwo = wizards.iterator();
        while (listTwo.hasNext()){
            System.out.println(listTwo.next());
        }

        System.out.println(wizards.contains(3));

        System.out.println(wizards.contains("Hermione Granger"));
        System.out.println(wizards.isEmpty());
        wizards.clear();
        System.out.println(wizards.isEmpty());

    }
}
