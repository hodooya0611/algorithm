import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt(); // 조작횟수

        int volumn = 0; // 볼륨 

        boolean playing = false; // 재생을 하고있는지 아닌지 

        for(int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            if(a == 1 ) {
                volumn++;
            } else if (a == 2){
                if(volumn >= 1) {
                    volumn--; 
                } 
            } else if (a == 3) {
                playing = !playing;
            }
              if(volumn>= 3 && playing) {
                 System.out.println("Yes");
              } else {
                System.out.println("No");
             }
        }
    }
}
