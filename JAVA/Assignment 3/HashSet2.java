import java.util.*;
public class HashSet2 {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Add a name");
            System.out.println("2. Remove a name");
            System.out.println("3. Search a name");
            System.out.println("4. Display all names");
            System.out.println("5. Display number of names in set");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter new name : ");
                    hs.add(sc.next());
                    break;
                case 2:
                    System.out.print("Enter name to be removed : ");
                    hs.remove(sc.next());
                    break;
                case 3:
                    System.out.print("Enter name to be searched : ");
                    if(hs.contains(sc.next()))
                        System.out.println("Found");
                    else
                        System.out.println("Not found");
                    break;
                case 4:
                    System.out.println("All names are :");
                    for (String s : hs)
                        System.out.println(s);
                    break;
                case 5:
                    //display number of elements in the set
                    System.out.println("Number of elements in the set is "+hs.size());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
    }while(choice!=6);
}
}
