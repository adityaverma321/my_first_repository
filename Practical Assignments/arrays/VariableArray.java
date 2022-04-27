import java.util.Scanner;
public class VariableArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter : ");
        int size = sc.nextInt();
        int arr[] = new int[25]; 
        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // print array elements
        System.out.println("Array elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // insert element at given index
        System.out.print("\nEnter index to insert element : ");
        int index = sc.nextInt();
        System.out.print("Enter element to insert : ");
        int element = sc.nextInt();
        arr[index] = element;

        // print array elements
        System.out.println("\nArray elements after insertion are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // flush all array elements
        System.out.println("\nArray elements after flushing are : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
