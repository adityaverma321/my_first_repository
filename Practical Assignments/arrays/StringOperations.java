class StringOperations{
    public static void main(String args[]) {
        System.out.print("Enter a string : ");
        String str = System.console().readLine();

        // removing all unnecessary spaces
        str = str.trim();
        System.out.println("Trimmed string is : "+str);

        // count number of occurrences of a character in a string
        System.out.print("Enter a character to count all occurences : ");
        char ch = System.console().readLine().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Number of occurrences of "+ch+" in "+str+" is "+count);

        // search the last occurrence of a character in a string
        System.out.print("Enter a character to find it's last occurence : ");
        ch = System.console().readLine().charAt(0);
        int index = -1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                index=i;
            }
        }
        System.out.println("Last occurrence of "+ch+" in "+str+" is at index "+index);
                
        // make substring of last 10 characters
        System.out.println("Last 10 characters are : "+str.substring(str.length()-10));
    }
}