import java.util.ArrayList;
import java.util.Random;

public class AppLocalBubbleSort {
    public static void main(String[] args) {
     //  int array[]={0,1,2,3,4,5,6,7,8,9};
       ArrayList<Integer> array = new ArrayList<>();

       Random random= new Random();

       for (int i = 0; i < 10; i++) {
        array.add(i, random.nextInt(100));
       }
       System.out.println("Entrada : " + array); 
       int size = array.size();
       bublesort(array, size);
       System.out.println("Saida : " + array); 
    }

    private static ArrayList<Integer> bublesort(ArrayList<Integer> array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (array.get(j-1)>array.get(j)) {
                    int temp=array.get(j);
                    array.set(j, array.get(j-1));
                    array.set(j-1, temp);
                }    
            }
           }
        return array;
    }
}
