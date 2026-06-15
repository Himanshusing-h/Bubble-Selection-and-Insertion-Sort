import java.util.Arrays;
import java.util.Scanner;

public class kthsmallestelement {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

            // Code here
        System.out.println("enter k value");
        int k=s.nextInt();
            int i=0;
            //why the approach is wrong down one
//        Enter array elements
//        7 10 4 3 20 15
//        enter k value
//        3
//        10
//            int j=1;
//            Arrays.sort(arr);
//
//            while(i<n){
//                if(j==(k)){
//                  break;
//                }
        int j=0;
        Arrays.sort(arr);

        while(i<n){
            if(j==(k-1)){
                break;
            }

                else if(arr[i+1]>arr[i]){
                    j++;
                }
                i++;
            }
        System.out.println(arr[j]);
        }
    }
    //logic


