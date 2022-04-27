import java.util.StringTokenizer;

class StringOperationUsingMenu {
    public static void main(String args[]){
        System.out.print("Enter a String : ");
        String str = System.console().readLine();
        StringTokenizer st = new StringTokenizer(str);
        String[] str_token = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            str_token[i] = st.nextToken();
            i++;
        }
        int choice = 0;
        do{
            System.out.println("1. Reverse the sequence of string");
            System.out.println("2. Reverse the sequence of characters in string");
            System.out.println("3. Reaarange the string according to the length of string");
            System.out.println("4. Sort the string ");
            System.out.println("5. Change the case of string");
            System.out.println("6. Exit");
            choice = Integer.parseInt(System.console().readLine());
            switch(choice){
                case 1:
                    if(str.isEmpty()){
                        System.out.println("Enter a string first");
                    }
                    else{
                        System.out.println("Reverse squence of string is : ");
                        for(int j=str_token.length-1;j>=0;j--){
                            System.out.print(str_token[j]+" ");
                        }
                        System.out.println("\n");
                    }
                    break;

                case 2:
                    if(str.isEmpty()){
                        System.out.println("Enter a string first");
                    }
                    else{
                        System.out.println("Reverse squence of characters in string is : ");
                        for(int j=0;j<str_token.length;j++){
                            for(int k=str_token[j].length()-1;k>=0;k--){
                                System.out.print(str_token[j].charAt(k));
                            }
                            System.out.print(" ");
                        }
                        
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    if(str.isEmpty())
                        System.out.println("Enter a string first");
                    else{
                        System.out.println("Rearranged string according to length is : ");
                        for(int j=1;j<str_token.length;j++){
                            String temp = str_token[j];
                            int k = j-1;
                            while(k>=0 && str_token[k].length()>temp.length()){
                                str_token[k+1] = str_token[k];
                                k--;
                            }
                            str_token[k+1] = temp;
                        }
                        for(String s:str_token){
                            System.out.print(s+" ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    if(str.isEmpty())
                        System.out.println("Enter a string first");
                    else{
                        System.out.println("Sorted string is : ");
                        for(int j=0;j<str_token.length;j++){
                            for(int k=j+1;k<str_token.length;k++){
                                if(str_token[j].compareTo(str_token[k])>0){
                                    String temp = str_token[j];
                                    str_token[j] = str_token[k];
                                    str_token[k] = temp;
                                }
                            }
                        }
                        for(int j=0;j<str_token.length;j++){
                            System.out.print(str_token[j]+" ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    if(str.isEmpty())
                        System.out.println("Enter a string first");
                    else{
                        System.out.println("Type 1 for upper case"+"\n"+"Type 2 for lower case");
                        int choice_case = Integer.parseInt(System.console().readLine());
                        do{
                            if(choice_case==1)
                                System.out.println("Upper case of string is : "+str.toUpperCase());
                            else if(choice_case==2)
                                System.out.println("Lower case of string is : "+str.toLowerCase());
                            else
                                System.out.println("Invalid choice");
                                break;
                        }while(choice_case!=1 && choice_case!=2);
                        System.out.println("\n");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=6);
    }
}