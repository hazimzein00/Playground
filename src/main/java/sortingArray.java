import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math;


public class sortingArray {
    public static void sortArray(int[] x) {
        for(int i=0;i<x.length;i++){
            for (int j=0;j<x.length;j++) {
                if (x[i]<x[j]){
                    int tempValue = x[j];
                    x[j] = x[i];
                    x[i] = tempValue;
                }

            }
        }
        System.out.println(Arrays.toString(x));
    }

    //Method disini
    public static void main(String[] args) {
        int[] arr = {5,8,3,6,1};
        sortArray(arr);

    }
}
