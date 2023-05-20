package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 합이같은부분집합 {
    static String answer = "NO";
    static int n =0;
    static int total = 0;
    static boolean flag = false; // 정답이 발견되면 나머지 재귀들을 다 return 시키키 위한 수단
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 원소의 개수
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        dfs(0,0);

    } // end of main

    static void dfs(int j, int sum){
        if(flag==true) return;  // 정답을 발견하고 스택에 남아있는 애들 다 return 시켜버림.
        if(sum > total/2) return;
        if(j==n){
            if(sum==total/2){
                answer = "yes";
                flag = true;
            }
        }else{
            dfs(j+1,sum+=arr[j]);
            dfs(j+1,sum);
        }



    }


}
