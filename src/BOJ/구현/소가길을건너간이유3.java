package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소가길을건너간이유3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 소의 수 입력받고
        Cow[] c = new Cow[N]; // 소 들어갈 배열 만들기!


        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            c[i] = new Cow(start,time);  // 소 집어넣기
        }

        Arrays.sort(c);

        int cnt = 0;  // 시간
        for(int i=0; i<N; i++){
            Cow cur = c[i];
            if(cur.start > cnt) cnt = cur.start + cur.time;
            else cnt+=cur.time;
        }

        System.out.println(cnt);

    } // end of main

    static class Cow implements Comparable<Cow>{  // 정렬을 위해 implements comparable

        int start;
        int time;

        public Cow(int start, int time){
            this.start = start;
            this.time = time;
        }

        @Override
        public int compareTo(Cow o) {                                // 도착 시간이 다르면
            if(this.start != o.start) return this.start - o.start;  // 도착시간을 기준으로 오름차순 정렬
            else return this.time  - o.time; // 도착시간이 같을 경우 검사소요시간을 기준으로 내림차순 정렬
        }
    }



}
