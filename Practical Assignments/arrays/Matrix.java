public class Matrix {

    //matrix addition
    static void addmatrix(int[][] arr1,int[][] arr2){
        int[][] arr3=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of two matrices is : ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
    }

    //matrix subtraction
    static void subtractmatrix(int[][] arr1,int[][] arr2){
        int[][] arr3=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr3[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        System.out.println("Difference of two matrices is : ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
    }

    //matrix multiplication
    static void multiplymatrix(int[][] arr1,int[][] arr2){
        int[][] arr3=new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of two matrices is : ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
    }

    //matrix transpose
    static void transposeofmatrix(int[][] arr){
        int[][] arr1=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] A = new int[3][3];
        int[][] B = new int[3][4];
        System.out.println("Enter data for matrix A");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter element ["+(i+1)+"]["+(j+1)+"]: ");
                A[i][j]=Integer.parseInt(System.console().readLine());
            }
        }
        System.out.println("Enter data for matrix B");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print("Enter element ["+(i+1)+"]["+(j+1)+"]: ");
                B[i][j]=Integer.parseInt(System.console().readLine());
            }
        }

        // print matrix A and matrix B
        System.out.println("Matrix A is : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Matrix B is : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(B[i][j]+"  ");
            }
            System.out.println();
        }

        if(A.length==B.length && A[0].length==B[0].length){
            addmatrix(A,B);
            subtractmatrix(A,B);
        }
        else{
            System.out.println("Matrices cannot be added or subtracted");
        }
        
        if(A[0].length==B.length){
            multiplymatrix(A,B);
        }
        else{
            System.out.println("Matrices cannot be multiplied");
        }
        
        System.out.println("Transpose of Matrix A is : ");  
        transposeofmatrix(A);
        System.out.println("Transpose of Matrix B is : ");
        transposeofmatrix(B);
    }
}