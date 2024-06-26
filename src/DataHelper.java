import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {

        return getRandomInteger(size, 0, 10);
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {

        return getRandomInteger(size, 0, max);
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    // ?* Main Method
    public static List<Integer> getRandomInteger(int size, int min, int max) {

        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        if (size <= 0) {
            System.out.println("Inserisci numero maggiore da zero");
            return list;
        } else if (min > max) {
            System.out.println("Il numero di min deve essere minore o uguale a max");
            return list;
        } else {
            for (int i = 0; i < size; i++) {
                int rndN = rnd.nextInt((max - min) + 1) + min;
                list.add(rndN);
            }
            return list;
        }
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    public static Set<Integer> getRandomUniqueInteger(int size) {

        return getRandomUniqueInteger(size, 0, 10);
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public static Set<Integer> getRandomUniqueInteger(int size, int max) {

        return getRandomUniqueInteger(size, 0, max);
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
    // ?* Main Method
    public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {

        List<Integer> rnd = getRandomInteger(size, min, max);
        Set<Integer> s = new HashSet<>(rnd);
        // System.out.println(rnd);
        return s;
    }

    // restituisce una mappa di frequenza di numeri interi
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer n : list) {
            Integer count = freq.getOrDefault(n, 0);
            // System.out.println("count: " + count);
            freq.put(n, count + 1);
        }

        return freq;
    }

}
