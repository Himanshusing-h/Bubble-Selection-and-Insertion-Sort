import java.util.Scanner;

public class sort_in_descending {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter length of array");
            int n = s.nextInt();
            int[] arr = new int[n];
            System.out.println("enter array");
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }


            for (int i=0;i<n-1;i++)
            {
                int swap=0;
                for (int j=0;j<n-1-i;j++)
                {

                    if (arr[j]<arr[j+1])
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


