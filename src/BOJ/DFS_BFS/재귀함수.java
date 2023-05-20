package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class 재귀함수 {
    static int n;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());  // ex) 3
        arr = new int[n+1];
        dfs(1);
    }

    static void dfs(int num){
        if(num==n+1){
            for(int i=1; i<=n; i++){
                System.out.print(arr[i] + " ");
            }
        }else{
            arr[num] = num;
            dfs(num+1);
        }
    }


}
