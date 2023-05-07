package BOJ.그리디;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        // 설탕은 3키로와 5키로
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0; // 봉지 수 카운트

        while(true){
            if(N%5==0){ // 5의 배수인 경우
                cnt += N/5;
                System.out.println(cnt);
                break;
            }
            else{ // 5의 배수가 아닌 경우
                N-=3;
                cnt++;
            }
            if(N<0){
                System.out.println("-1");
                break;
            }
        }
    } // end of main
}
