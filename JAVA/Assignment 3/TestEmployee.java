import java.util.*;
//import java.lang.*;
class Employee {    
    String name;
    String empId;
    String DOB;
    int salary;
    public void setDetails(String name,String empId,String DOB,int salary){
        this.name = name;
        this.empId = empId;
        this.DOB = DOB;
        this.salary = salary;
    }
    public void getDetails(){
        System.out.println("Employee name : "+this.name);
        System.out.println("Employee ID : "+this.empId);
        System.out.println("Employee DOB : "+this.DOB);
        System.out.println("Employee salary : "+this.salary);
    }
    
}
public class TestEmployee{
    // create a linked list of employee data
    public static void main(String args[]){
        //Employee obj = new Employee();
        LinkedList<Employee> list = new LinkedList<Employee>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            Employee e = new Employee();
            String name = sc.next();
            String empId = sc.next();
            String DOB = sc.next();
            int salary = sc.nextInt();
            e.setDetails(name,empId,DOB,salary);
            list.add(e);
        }
        // sort the list
        Collections.sort(list);
        // display the list
        for(Employee e : list){
            e.getDetails();
        }
        sc.close();
    }
}