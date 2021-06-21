
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int largest_element = arr[arr.length - 1];

        int c=0;

        for (int i = n - 2; i >= 0; i--) {

            if(arr[i]!=largest_element){
                System.out.println("Second Largest Element : "+arr[i]);
                c=1;
                break;
            }

        }

        if(c==0){
            System.out.println("Second Largest Element : "+largest_element);
        }
    }

}