import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int[] count = new int[14]; // 1~13까지 세는 배열
 
        // 7개 뽑았을때 같은 카드가 몇개씩 나왔는지를 세기
        for(int i = 0; i < 7; i++) {
            int a = sc.nextInt();
            count[a]++;
        }
 
        int threeNum = -1; // 3장인 숫자
        int twoNum = -1;   // 2장인 숫자
 
        for(int i = 1; i <= 13; i++) {
            if(count[i] >= 3) threeNum = i;
            if(count[i] >= 2) twoNum = i;
        }
 
        if(threeNum != -1 && twoNum != -1 && threeNum != twoNum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
 // 이거는 실패함 