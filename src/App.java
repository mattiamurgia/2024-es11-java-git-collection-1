import java.util.List;

public class App {
    /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */

    public static void main(String[] args) throws Exception {

        // testRandomMethod();
        // testRandomUniqueInteger();
        testFrequencyMap();
    }

    public static void testRandomMethod() {

        System.out.println("getRandomInteger: " + DataHelper.getRandomInteger(10));
        System.out.println("getRandomInteger with max: " + DataHelper.getRandomInteger(10, 5));
        System.out.println("getRandomInteger with min and max: " + DataHelper.getRandomInteger(10, 8, 5));
    }

    public static void testRandomUniqueInteger() {

        System.out.println("getRandomUniqueInteger: " + DataHelper.getRandomUniqueInteger(10));
        System.out.println("getRandomUniqueInteger with max: " + DataHelper.getRandomUniqueInteger(10, 5));
        System.out.println("getRandomUniqueInteger with min and max: " + DataHelper.getRandomUniqueInteger(10, 8, 5));
    }

    public static void testFrequencyMap() {

        List<Integer> e1 = DataHelper.getRandomInteger(10);
        List<Integer> e2 = DataHelper.getRandomInteger(10, 5);
        List<Integer> e3 = DataHelper.getRandomInteger(10, 8, 5);

        // System.out.println(e1);
        System.out.println("getFrequencyMap: " + DataHelper.getFrequencyMap(e1));
        // System.out.println(e2);
        System.out.println("getFrequencyMap: " + DataHelper.getFrequencyMap(e2));
        // System.out.println(e3);
        System.out.println("getFrequencyMap: " + DataHelper.getFrequencyMap(e3));
    };
}
