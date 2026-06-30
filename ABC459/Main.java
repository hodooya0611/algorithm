import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String s = "HelloWorld";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++ ) {
            if(i != x-1) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}