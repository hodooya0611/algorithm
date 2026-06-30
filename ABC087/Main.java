import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // 바꿀수있는 경우의 수
    // 50엔 이상 20000엔 이하
    // 100엔 500엔 1000엔 
    // a장, b장, c장은 모두 50개 미만....

    // 500엔 동전 갯수 
    int a = sc.nextInt();

    // 100엔 동전 갯수
    int b = sc.nextInt();

    // 50엔 동전 갯수 
    int c = sc.nextInt();

    // 총 금액 x 
    int x = sc.nextInt();

    // 맞는 개수를 셀 변수
    int count = 0;

    for(int i = 0; i <= a; i++) {
        for(int j =0; j <= b; j++){
            for(int k =0; k <= c; k++){

                int aTotal = 500*i;
                int bTotal = 100*j;
                int cTotal = 50*k;

                if(aTotal+bTotal+cTotal == x){
                    count++;
                }
            }
        }
    }
System.out.println(count);
}
    
}