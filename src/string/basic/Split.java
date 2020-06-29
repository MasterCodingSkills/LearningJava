package string.basic;

import java.util.regex.Pattern;

public class Split {
    public static void main(String[] args) {
        String namesConcated = new String("$#$Neeraj");
        if(namesConcated.contains("$#$")) {
            System.out.println("Pattern Exists");
        }

        String[] names = namesConcated.split(Pattern.quote("$#$"));
        int counter = 1;
        for(String name : names) {
            System.out.println(counter +" : "+ name);
            counter++;
        }
    }
}
