package ArraysEx;

public class findPairs {

    public void findPair(int[] numbers, int target){
        for (int i=0;i<=numbers.length-1;i++){
            for(int j=i+1;j<=numbers.length-1;j++){
                if(numbers[i]+numbers[j]==target){
                    System.out.println("Pair found("+numbers[i]+","+numbers[j]+")");

                }
            }

        }

    }


}
