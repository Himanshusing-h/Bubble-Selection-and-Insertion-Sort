import java.util.Scanner;

public class selection_reverse {
    public static void main(String[] args) {

        int max=Integer.MIN_VALUE;
        int indj=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i=n-1;i>=0;i--)
        {
            for (int j=i-1;j>=0;j--){
                if (arr[j]>max)
                {
                    max=arr[j];
                    indj=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[indj];
            arr[indj]=temp;
        }
        for (int element:arr)
        {
            System.out.print(element+" ");
        }
    }
}
//Not correct (desired output not obtained)
