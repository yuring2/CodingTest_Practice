package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 중복이 안되게끔,,,
public class 순열 {
    static int n;
    static int m;
    static int[] arr;
    static int[] Newnum;
    static int[] ch;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken()); // 자연수
        m = Integer.parseInt(st.nextToken()); // 뽑는 횟수
        arr = new int[n];
        Newnum = new int[m];
        ch = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);


    } // end of main

    static void dfs(int j){
        if(j==m){
            for(int x : Newnum){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i]!=1){
                    ch[i] = 1;
                    Newnum[j] = arr[i];
                    dfs(j+1);
                    ch[i] = 0;
                }

            }
        }

    }


}
