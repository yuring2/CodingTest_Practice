package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 배열을 오름차순으로 정렬

        int sum = 0;
        int result = 0;
        for(int i=0; i<N; i++){
            sum = sum+arr[i];
            result+=sum;
        }
        System.out.println(result);

    } // end of main
}
