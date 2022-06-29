import java.util.*;
class HashMap {

    static int menu() {
        System.out.println("----------Menu-----------");
        System.out.println("1. Add Entry");
        System.out.println("2. Remove by key");
        System.out.println("3. Search key ");
        System.out.println("4. Search for value");
        System.out.println("5. List");
        System.out.println("6. Exit");

        System.out.print("Enter your choice:-->");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    static boolean searchKey(String key,HashMap<String, Integer> students) {

        key = key.toLowerCase();
        boolean found = false;
        Iterator<Map.Entry<String, Integer>> i = students.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            if (entry.getKey().toLowerCase().equals(key)) {
                found = true;
            }
        }

        return found;
    }

    static boolean searchValue(Integer value, HashMap<String, Integer> students) {

        boolean found = false;
        Iterator<Map.Entry<String, Integer>> i = students.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            if (entry.getValue() == value) {
                found = true;
            }
        }

        return found;
    }

    public static void main(String args[]) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        boolean found=false;
    
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        String key;
        Integer value;

        do {
            choice = menu();

            switch (choice) {
                case 1: // Add Entry
                    System.out.print("Enter the key and value (seperate them by space): ");  //parth 36
                    String pair = sc.nextLine();
                    StringTokenizer s = new StringTokenizer(pair);
                    // parth 36

                    key = s.nextToken();
                    value = Integer.parseInt(s.nextToken());

                    students.put(key.toLowerCase(), value);
                    System.out.println(key + " is added");
                    break;
                case 2: // remove (key)
                    System.out.print("Enter the key to remove : ");
                    key = sc.next();
                   
                    found = searchKey(key,students);
                    if (found) {
                        students.remove(key);
                        System.out.println(key + " is removed");
                    } else {
                        System.out.println("The " + key + " is not found...");
                    }
                    break;

                case 3: // Search key
                    System.out.print("Enter the key to search : ");
                    key = sc.nextLine();
                    
                    found = searchKey(key, students);
                    if (!found) {
                        System.out.println(key + " is not found ");
                    } else {
                        System.out.println(key + " is  found ");
                    }
                    break;
                case 4: // search value
                    System.out.print("Enter the value to search : ");
                    value = sc.nextInt();
                    
                    found = searchValue(value,students);
                    if (!found) {
                        System.out.println(value + " is not found ");
                    } else {
                        System.out.println(value + " is  found ");
                    }
                    break;
                case 5: // list
                    Iterator< Map.Entry<String, Integer> >  i = students.entrySet().iterator();
                    while (i.hasNext()) {
                        
                        Map.Entry<String, Integer> entry = i.next();
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    break;
                case 6: // exit
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}