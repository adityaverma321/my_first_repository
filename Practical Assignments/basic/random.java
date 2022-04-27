class random{
    public static void main(String[] args){
        int sum = 0;
        int i = 0;
		System.out.print("Random numbers are : ");
        while(sum < 20){
			i = (int)(Math.random()*10);
			System.out.print(i+",  ");
            sum += i;
        }
		System.out.println();
		System.out.println("Their sum is : "+sum);  
    }
}