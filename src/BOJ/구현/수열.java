package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); // 전체 날짜 수
        int[] arr = new int[N];
        int K = Integer.parseInt(st.nextToken()); // 합을 구하기 위한 연속적인 날짜 수
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(bf.readLine()," ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N-K+1; i++){
            int sum = arr[i];
            int index = i+1;
            for(int j=0; j<K-1; j++){
                sum+=arr[index];
                index++;
            }
            if(sum > max) max = sum;
        }

        System.out.println(max);

    } // end of main
}
