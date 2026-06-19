import java.util.Scanner;

public class insertion_sor {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }


        for (int i=1;i<n;i++)//with each iteration it will move one index forward and behind this index arr is sorted,since it start with 1 so we are assuming index 0 is sorted as it is only one element

        {
            int key=arr[i];//maintaing key to insert in right place;
         int j=i-1;//j start with one index behind i and it goes backward
            while(j>=0 && arr[j]>key)
            {
               arr[j+1]=arr[j];//right shift
               j--;//updation
            }
            arr[j+1]=key;//placing key at right place
        }
        for (int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}

