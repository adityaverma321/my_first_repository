class ArrayDouble{
    static void arraylength(double[] arr){
        System.out.println("Length of array is "+arr.length);
    }
    static void display(double[] arr){
        System.out.print("Elements of array are : ");
        for(double i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    static void sumofsquare(double[] arr){
        double sum=0;
        for(double i:arr){
            sum+=i*i;
        }
        System.out.println("Sum of square of elements is "+sum);
    }
    static void meanandmedian(double[] arr){
        double sum=0;
        for(double i:arr){
            sum+=i;
        }
        double mean=sum/arr.length;
        System.out.println("Mean is "+mean);
        double median=0;
        if(arr.length%2==0){
            median=(arr[arr.length/2]+arr[arr.length/2-1])/2;
        }
        else{
            median=arr[arr.length/2];
        }
        System.out.println("Median is "+median);
    }
    static void sort(double[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    double temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted array is in ascending order is : ");
        for(double i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    static void sortdescending(double[] arr){
        for(int i=1;i<arr.length;i++){
            double temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.print("Sorted array in descending order is : ");
        for(double i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    static void searchelement(double[] arr,double element){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element "+element+" found at index "+i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element "+element+" not found");
        }
    }
    static void copyarray(double[] arr){
        double[] arr1=new double[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        System.out.print("Copied array is : ");
        for(double i:arr1){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    static void reversearray(double[] arr){
        double[] arr1=new double[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[arr.length-i-1];
        }
        System.out.print("Reversed array is : ");
        for(double i:arr1){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        double[] arr = {15,54,26,35,59,22,62,24,68,84};
        arraylength(arr);
        display(arr);
        sumofsquare(arr);
        meanandmedian(arr);
        sort(arr);
        sortdescending(arr);
        searchelement(arr, 26);
        copyarray(arr);
        reversearray(arr);
    }
}
