import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExempleList {

    public static void main(String[] args){

        List<String> wizards = new ArrayList<>(Arrays.asList("Harry Potter", "Hermione Granger"));
        System.out.println(wizards);
        wizards.add("Ronald Weasley");
        System.out.println(wizards);
        System.out.println(wizards.contains("Ronald Weasley"));
        System.out.println(wizards.indexOf("Harry Potter"));
    }
}
