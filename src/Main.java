import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

//Functional. Принимает строку, находит в ней самый часто встречаемый символ и отдает ее




        Function<String, Character> string = new Function<String, Character>() {
            @Override
            public Character apply(String input) {
                Map<Character, Integer> mapCount = new HashMap<>();

                for (Character c : input.toCharArray()) {
                    if (mapCount.containsKey(c)) {
                        int count = mapCount.get(c);
                        mapCount.put(c, count + 1);
                    } else {
                        mapCount.put(c, 1);
                    }
                }
                char mostChar = ' ';
                int maxCount = 0;

                for (Map.Entry<Character, Integer> entry : mapCount.entrySet()) {
                    if (entry.getValue() > maxCount) {
                        mostChar = entry.getKey();
                        maxCount = entry.getValue();
                    }
                }


                return mostChar;
            }
        };


        System.out.println(string.apply("Hello world"));

    }
}