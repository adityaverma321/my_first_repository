import java.util.StringTokenizer;

public class StringToken {
    public static void main(String args[]){
        System.out.print("Enter a string : ");
        String str = System.console().readLine();
        StringTokenizer st = new StringTokenizer(str);
        String[] str_token = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            str_token[i] = st.nextToken();
            i++;
        }
        for(int j=str_token.length-1;j>=0;j--){
            System.out.println(str_token[j]);
        }
    }
}
