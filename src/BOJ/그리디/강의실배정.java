package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class lec implements Comparable<lec>{
    int start;
    int end;

    public lec(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(lec o) {
        if(this.start == o.start) return this.end-o.end;
        else return this.start - o.start;
    }
}

public class 강의실배정 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 수업의 개수
        lec[] arr = new lec[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i] = new lec(start,end);
        }

        Arrays.sort(arr);

        // 우선순의 큐에는 종료 시간만 들어가며, 오름차순으로 자동 정렬된다.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(arr[0].end);

        for(int i=1; i<N; i++){
            if(arr[i].start >= pq.peek()) pq.poll();
            pq.add(arr[i].end);
        }

        System.out.println(pq.size());






    } // end of main
}
