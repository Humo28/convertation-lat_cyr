
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by norboboyev_h  on 15.09.2020  10:03
 */

public class Converter {

    final HashMap<String, String> exceptionWords = new HashMap<String, String>() {{
        put("sirk", "цирк");
        // ...
    }};
    char[] abcCyr = {'а', 'б', 'в', 'г', 'ҳ', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'ъ', 'э', 'ю', 'я', 'ғ', 'ў', 'қ', 'А', 'Б', 'В', 'Г', 'Ҳ', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Ъ', 'Э', 'Ю', 'Я', 'Ғ', 'Ў', 'Қ'};
    String[] abcLat = {"a", "b", "v", "g", "h", "d", "ye", "yo", "j", "z", "i", "y", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "x", "ts", "ch", "sh", "'", "e", "yu", "ya", "o'", "g'", "q", "A", "B", "V", "G", "H", "D", "Ye", "Yo", "J", "Z", "I", "Y", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "X", "Ts", "Ch", "Sh", "'", "E", "Yu", "Ya", "G'", "O'", "Q"};

    public String convert(String message, int convertType) {
        if (Collections.singletonList(abcCyr).contains(message.chars())){

        }
//        if ()
        message = message.trim();
        if (convertType == 0) {
            return cyrToLat(message);
        } else return latToCyr(message);

    }


    private String latToCyr(String message) {
        if (exceptionWords.containsKey(message)) {
            return exceptionWords.get(message);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (i != (message.length() - 1)) {
                String doubleLetter = message.charAt(i) + "" + message.charAt(i + 1);
                if (Arrays.asList(abcLat).contains(doubleLetter)) {
                    for (int j = 0; j < abcLat.length; j++) {
                        if (doubleLetter.equals(abcLat[j])) {
                            builder.append(abcCyr[j]);
                        }
                    }
                    ++i;
                    continue;
                }
            }
            for (int j = 0; j < abcLat.length; j++) {
                if (abcLat[j].length() == 1 && message.charAt(i) == abcLat[j].charAt(0)) {
                    builder.append(abcCyr[j]);
                    break;
                }
            }
    }

        return builder.toString();

}

    private String cyrToLat(String message) {

        if (exceptionWords.containsValue(message)) {
            AtomicReference<String> convertedWord = new AtomicReference<>("");
            exceptionWords.forEach((key, value) -> {
                if (value.equals(message)) {
                    convertedWord.set(key);
                }
            });
            return convertedWord.get();
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < abcCyr.length; j++) {
                if (message.charAt(i) == abcCyr[j]) {
                    builder.append(abcLat[j]);
                }
            }
        }
        return builder.toString();
    }
}
