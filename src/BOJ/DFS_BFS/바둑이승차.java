package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑이승차 {
    static int c;
    static int n;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        c = Integer.parseInt(st.nextToken()); // 트럭에 태울 수 있는 최대 무게
        n = Integer.parseInt(st.nextToken()); // 바둑이 마리수
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dfs(0,0);
        System.out.println(answer);
    } // end of main

    static void dfs(int j, int sum){
        if(sum>c) return;
        if(j==n){
            answer = Math.max(answer,sum);
        } else{
            dfs(j+1,sum+arr[j]); // 태우는 경우 sum+=arr[i] 이렇게 하면 답 안나옴..
            dfs(j+1,sum);
        }
    }


}
