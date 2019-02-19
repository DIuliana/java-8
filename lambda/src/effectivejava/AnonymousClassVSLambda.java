package effectivejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassVSLambda {

    static List<String> words;

    public static void main(String[] args) {

        sortWithAnonymousClass();
        System.out.println(words);

        sortWithLambdaUgly();
        System.out.println(words);

        sortWithLambda();
        System.out.println(words);

    }

    static void sortWithAnonymousClass() {
        words = Arrays.asList("abalacicioco", "test", "a word", "words", "nevrmind");
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }

    static void sortWithLambdaUgly() {
        words = Arrays.asList("abalacicioco", "12", "a word", "words", "world");
        Collections.sort(words, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
    }

    static void sortWithLambda() {
        words = Arrays.asList("thebiggestword", "12", "a word", "words", "moon");
        Collections.sort(words, Comparator.comparingInt(String::length));
    }

}
