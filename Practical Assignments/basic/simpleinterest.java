class simpleinterest{
    public static void main(String[] args){
        if(args.length == 3){
            double principal = Double.parseDouble(args[0]);
            double rate = Double.parseDouble(args[1]);
            int years = Integer.parseInt(args[2]);
            double si = principal * rate * years / 100;
			double total_amount = principal + si;
			System.out.println("Principal is " + principal);
			System.out.println("Rate of Interest is " + rate);
			System.out.println("Number of Years is " + years + "\n");
            System.out.println("Simple Interest is " + si);
            System.out.println("Total amount is " + total_amount);
        }
    }
}
