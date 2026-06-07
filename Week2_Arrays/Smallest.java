package Week2_Arrays;
public class Smallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 2, 15};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest Element: " + min);
    }
}