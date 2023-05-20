package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 도서관 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int n = Integer.parseInt(st.nextToken());  // 책의 개수
        int m = Integer.parseInt(st.nextToken());  // 한번에 들 수 있는 책의 개수
        st = new StringTokenizer(bf.readLine()," ");

        // 두 개의 우선순위 큐를 내림차순 정렬
        PriorityQueue<Integer> positiveQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negativeQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());

            if(temp > 0) positiveQ.add(temp);
            else negativeQ.add(Math.abs(temp));
        }

        // 가장 멀리있는 책의 위치를 저장
        int max = 0;
        if(positiveQ.isEmpty()) max = negativeQ.peek();
        else if(negativeQ.isEmpty()) max = positiveQ.peek();
        else max = Math.max(negativeQ.peek(), positiveQ.peek());


        int ans = 0;
        while(!positiveQ.isEmpty()){
            int temp = positiveQ.poll();
            for(int i=0; i<m-1; i++){
                positiveQ.poll();

                if(positiveQ.isEmpty()) break;
            }
            ans+=temp*2;
        }

        while(!negativeQ.isEmpty()){
            int temp = negativeQ.poll();
            for(int i=0; i<m-1; i++){
                negativeQ.poll();

                if(negativeQ.isEmpty()) break;
            }
            ans+=temp*2;
        }

        ans -= max;
        System.out.println(ans);

    } // end of main
}
