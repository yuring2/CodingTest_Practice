package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 오름차순 정렬 1 2 3 4 한 번 뽑기를 해서 뒤집어 쓴 후, 다시 오름차순 정렬
// 3 3 3 4 6 6 3 4
public class 카드합체놀이 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());  // 카드의 개수
        int m = Integer.parseInt(st.nextToken());  // 카드 합체 횟수
        st = new StringTokenizer(br.readLine()," ");
        long[] card = new long[n];
        long sum=0;

        for(int i=0; i<n; i++){
            card[i] = Long.parseLong(st.nextToken());
        }

      /* if(n==0) {
            for(long k : card) sum+=k;
        }
        System.out.println(sum);*/

        // 입력 받은 카드 배열 오름차순 정렬

        boolean flag = true;
        long cnt=0;
        while (flag){
            Arrays.sort(card);  // 2 3 6
            //long a = card[0];  // 가장 작은 값인 2
            //long b = card[1]; // 3
            long temp = card[0]+card[1];
            card[0]= temp;
            card[1]=temp;
            cnt++;
            if(cnt==m) break;
        }

        sum = 0;
        for(long k : card)  sum+=k;
        System.out.println(sum);



    } // end of main
}
