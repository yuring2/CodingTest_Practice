package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 카드합체놀이_우선순위큐 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            pq.add(Long.parseLong(st.nextToken()));
        }

        for(int i=0; i<m; i++){
            Long a = pq.poll(); // 아예 꺼냄
            Long b = pq.poll();
            pq.add(a+b);
            pq.add(a+b);
        }

        long ans = 0;

        while(!pq.isEmpty()) ans+=pq.poll();
        System.out.println(ans);


    } // end of main


}
