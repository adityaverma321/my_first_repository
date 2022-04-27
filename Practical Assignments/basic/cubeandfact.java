class cubeandfact{
	static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
	}

    static int cube(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n*n*n);
        }
    }
	static int sumofdigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    static int multiplyofdigits(int n){
        int mul=1;
        while(n>0){
            mul*=n%10;
            n/=10;
        }
        return mul;
    }
    static boolean palindrome(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(rev==n)
            return true;
        else
            return false;
    }
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		System.out.println("Factorial of "+num + " is : "+factorial(num));
		System.out.println("Cube of "+num+" is : "+cube(num));
		System.out.println("Sum of digits is : "+sumofdigits(num));
		System.out.println("Multiplication of digits is "+multiplyofdigits(num));
		if (palindrome(num) == true){
			System.out.println(num + " is a palindrome number");
		}
		else{
			System.out.println(num + " is not a palindrome number");
		}
	}
}