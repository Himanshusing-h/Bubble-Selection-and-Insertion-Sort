import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        // Normal approach
//        for (int i=0;i<n-1;i++)
//        {
//            for (int j=0;j<n-1-i;j++)
//            {
//              if (arr[j]>arr[j+1])
//              {
//                  int temp=arr[j];
//                  arr[j]=arr[j+1];
//                  arr[j+1]=temp;
//              }
//            }
//        }
        /*
        second approach
         */
//        boolean isSorted = true;
//        for (int i = 0; i < n - 1; i++) {
//
//            for (int q = 0; q < n; q++) {// This will check array is sorted or not after every iteration and if sorted break,this will save time
//                if (arr[q] > arr[q + 1]) {
//                    isSorted = false;
//                    break;
//                }
//            }
//
//            if (isSorted == true) break;
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        print(arr);
        for (int i=0;i<n-1;i++)//no of passes
        {
            int swap=0;
            for (int j=0;j<n-1-i;j++)//swapping and moving largest to the end
            {

              if (arr[j]>arr[j+1])
              {
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  swap++;
              }
            }
            if (swap==0)break;
        }
        print(arr);
    }

    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

}
