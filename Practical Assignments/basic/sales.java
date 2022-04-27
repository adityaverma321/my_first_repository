import java.util.*;
class sales{
    public static void main(String[] args){
        float sales, vat, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales: ");
        sales = sc.nextFloat();
        System.out.print("Enter vat: ");
        vat = sc.nextFloat();
        total = sales + (sales * vat / 100);
        System.out.println("Total: " + total);
    }
}