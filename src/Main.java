import ArraysEx.findPairs;

public class Main {
    public static void main(String[] args) {
     findPairs fp = new findPairs();
        int[] numbers = { 8, 7, 2, 5, 3, 1,14,-4,6,4 };
        int target = 10;

        fp.findPair(numbers,target);
    }
}
