package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 중복순열구하기 {
    static int[] arr;
    static int n;  // 자연수
    static int m; // 뽑는 횟수
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        dfs(0);

    } // end of main


    static void dfs(int j){ // j는 배열의 인덱스를 의미
        if(j==m){
            for(int x : arr) System.out.print(x+" ");
            System.out.println();
        }else{ // 2가닥이 아니라 n가닥을 뻗으니까 for문을 돌린다.
            for(int i=1; i<=3; i++){
                arr[j] = i;
                dfs(j+1);
            }
        }

    }

}
