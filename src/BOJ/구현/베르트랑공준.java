package BOJ.구현;

import java.util.Scanner;

// 자연수 n이 주어졌을 때 n보다 크고 2n보다 작거나 같은 소수의 개수를 구하라
public class 베르트랑공준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt(); // n 이 주어짐
            if(n==0) break;

            boolean[] arr = new boolean[2*n+1]; // 인덱스를 2n까지 사용하기 위해서

            // 0과 1은 소수가 아니기 때문에,,
            arr[0] = true;
            arr[1] = true;

            for(int i=2; i<=Math.sqrt(2*n+1); i++){
                for(int j=i*i; i<2*n+1; j+=i){
                    arr[j] = true;
                }
            }

            int cnt = 0;
            for(int i=n+1; i<2*n+1; i++){
                if(arr[i]==false) cnt++;
            }
            System.out.println(cnt);
        }

    } // end of main
}
