package test;

public class JavaTest{
    public static void main(String[] args) {
        int[] arr = { 5, 5,6,2,6,8,2};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
            System.out.print(arr[i]);
        }
    }
}
