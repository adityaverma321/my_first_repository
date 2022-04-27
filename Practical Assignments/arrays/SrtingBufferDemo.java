public class SrtingBufferDemo {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("Content of StringBuffer is "+sb);
        int len = sb.length();
        System.out.println("Length of StringBuffer is "+len);
        int cap = sb.capacity();
        System.out.println("Capacity of StringBuffer is "+cap);
    }    
}