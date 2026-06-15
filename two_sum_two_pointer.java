import java.util.Arrays;
import java.util.Scanner;

public class two_sum_two_pointer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = s.nextInt();
        System.out.println("Enter desired sum");
        int target=s.nextInt();
int flag=0;
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while (i < j) {
            if (arr[i]+arr[j]>target){
                j--;
            } else if (arr[i]+arr[j]<target) {
                i++;


            }
            else {
                flag=1;
                System.out.println("sum obtained");
                System.out.println(arr[i]+"+"+arr[j]);
                break;
            }

        }
        if (flag==0)
            System.out.println("No number has sum equal to desired sum");
    }
}
