import java.util.Arrays;

public class bubble_sort_recursive {
    public static void main(String[] args) {
        int[] arr = {7,6,1,9,8,2,4,3};
        Bubble(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void Bubble(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if (c<r){
            Bubble(arr, r,c+1);
            if (arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

        }else{
            Bubble(arr,r-1,0);
        }
    }
}
