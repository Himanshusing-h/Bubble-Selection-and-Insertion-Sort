import java.util.Scanner;

public class checkifsorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

}


