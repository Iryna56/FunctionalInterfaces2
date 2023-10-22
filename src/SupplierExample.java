import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    //Сгенерируйте первое число N (пусть от 0 до 100) -
    // это будет длина строки. Далее N раз генерируйте число от 0 до 25.
    // Каждое сгенерированное число - это буква алфавита. (от 1 до 26 (от A до Z)).
    // Теперь по каждой цифре создавайте букву.
    public static void main(String[] args) {


        Supplier<String> stringSupplier = new Supplier<String>() {

            @Override
            public String get() {

                Random random = new Random();
                int lenghtString = random.nextInt(20);
                String characters = "qwertyuiopasdfghjklzxcvbnm";

                char[] text = new char[lenghtString];

                for (int i = 0; i < lenghtString; i++) {
                    text[i] =characters.charAt(random.nextInt(characters.length()));
                }

                return new String(text);
            }
        };

        System.out.println(stringSupplier.get());
    }
}
