class min{
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int min = num1;
        if(num2 < min){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }
		System.out.println("Minimum of three numbers is " +min);
    }
}