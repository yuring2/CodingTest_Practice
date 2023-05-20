package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 회의실배정 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int[][] time = new int[N][2];

        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                time[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 끝나는 시간을 기준을 정렬하기 위해서 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0] - o2[0]; // 끝나는 시간이 갖다면 시작 시간을 기준으로 오름차순 정렬
                }

                return o1[1] - o2[1]; // 기본적으로 종료시간을 기준으로 오름차순 정렬
            }
        });

        int cnt = 0;
        int pre_time = 0;
        for(int i=0; i<N; i++){
            if(pre_time <= time[i][0]){
                pre_time = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    } // end of main
}
