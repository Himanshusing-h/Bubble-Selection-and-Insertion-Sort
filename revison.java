import java.util.Scanner;

public class revison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = s.nextInt();

        int[] arr = new int[n];
        int indj=0;

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i=0;i<n;i++)//no of passes
        {
            int min=Integer.MAX_VALUE;
            for (int j=i;j<n;j++)
            {
               if(arr[j]<min){
                   min=arr[j];
                   indj=j;
               }
            }

                int temp=arr[i];
                arr[i]=arr[indj];
                arr[indj]=temp;


        }
        for (int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}
