package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소비용
// 처음 출발할 때 무조건 기름을 넣고 출발
public class 주유소 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        long[] dis = new long [N-1]; // 도시 사이의 거리
        long[] cost = new long[N];
        for(int i=0; i<N-1; i++){
            dis[i] = Long.parseLong(st.nextToken());
        }

        // 가격 입력받기
        st = new StringTokenizer(bf.readLine()," ");
        for(int i=0; i<N; i++){
            cost[i] = Long.parseLong(st.nextToken());
        }

        long minCost = cost[0];
        long sum = 0; // 비용계산
        for(int i=0; i<N-1; i++){
            if(cost[i] < minCost) minCost = cost[i];
            sum+=(minCost*dis[i]);
        }
        System.out.println(sum);
    } // end of main
}
