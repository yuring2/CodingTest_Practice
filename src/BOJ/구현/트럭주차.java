package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 트럭주차 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] arr = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int a = 0; int b=0; int c=0;

        // 주차요금 입력받기
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());


        // 도착시간, 출차시간 입력받기
        for(int i=0 ; i<3; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            min = Math.min(min,start);
            max = Math.max(max,end);
            for(int j=start; j<end; j++){
                arr[j]++;
            }
        }

        for(int i=min; i<max; i++){
            switch (arr[i]){
                case 1:
                    sum = sum+(arr[i]*a);
                    break;
                case 2:
                    sum = sum+(arr[i]*b);
                    break;
                case 3:
                    sum = sum+(arr[i]*c);
                    break;
            }
        }

        System.out.println(sum);
    } // end of main
}
