package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 가장 낮은 값 혹은 가장 높은 값을 꺼내와야 할 떄 정렬도 좋지만 우선순위 큐도 생각을 해보자
public class 카드정렬하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i=0; i<N; i++){
            pq.add(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while(pq.size()>1){
            long temp1 = pq.poll();
            long temp2 = pq.poll();
            sum+=temp1+temp2;
            pq.add(temp1+temp2);
        }

        System.out.println(sum);

    } // end of main
}
