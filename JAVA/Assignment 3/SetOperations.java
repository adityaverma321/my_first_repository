import java.util.*;
public class SetOperations {
    public static void main(String args[]) {
        Set<String> set1 = new HashSet<String>();
        System.out.println("Enter total number to be add in set 1");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            String j = sc.next();
            set1.add(j);
        }
        Set<String> set2 = new HashSet<String>();
        System.out.println("Enter total number to be add in set 2");

        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            String j = sc.next();
            set2.add(j);
        }

        System.out.println("--menu--");
        System.out.println("1. Union");
        System.out.println("1. Intersection");
        System.out.println("1. Difference");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                HashSet union = new HashSet(set1);
                for (Object o : set2) {
                    union.add(o);
                }
                System.out.println(union);
                break;
            case 2:
                    
                HashSet intersection = new HashSet();
             
                for (Object oS2 : set2) {
                    if (set1.contains(oS2)) {
                        intersection.add(oS2);
                    }
                }
            
                System.out.println(intersection);
                break;
            case 3:
                HashSet difference = new HashSet(set1);
                for (Object o : set2) {
                    if (set1.contains(o)) {
                        difference.remove(o);
                    }
                }
                System.out.println(difference);
                break;
            default:
                break;
        }
    }
}