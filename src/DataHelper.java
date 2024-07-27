import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    // Returns a list of random integers between 0 and 10
    public static List<Integer> getRandomInteger(int size) {

        return getRandomInteger(size, 0, 10);
    }

    // Returns a list of random integers between 0 and max.
    public static List<Integer> getRandomInteger(int size, int max) {

        return getRandomInteger(size, 0, max);
    }

    // Returns a list of random integers between min and max
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

    // Returns a list of NON-DUPLICATED random numbers between 0 and 10
    public static Set<Integer> getRandomUniqueInteger(int size) {

        return getRandomUniqueInteger(size, 0, 10);
    }

    // Returns a list of NON-DUPLICATED random numbers between 0 and max.
    public static Set<Integer> getRandomUniqueInteger(int size, int max) {

        return getRandomUniqueInteger(size, 0, max);
    }

    // Returns a list of UNDUPLICATED random numbers between min and
    // max
    // ?* Main Method
    public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {

        List<Integer> rnd = getRandomInteger(size, min, max);
        Set<Integer> s = new HashSet<>(rnd);
        return s;
    }

    // Returns a frequency map of integers
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer n : list) {
            Integer count = freq.getOrDefault(n, 0);
            freq.put(n, count + 1);
        }
        return freq;
    }

}
