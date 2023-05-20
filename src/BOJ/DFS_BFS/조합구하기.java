package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.nio.Buffer;
import java.util.StringTokenizer;
// 걍 외워라
public class 조합구하기 {
    static int n;
    static int m;
    static int[] newArr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken()); // 번호
        m = Integer.parseInt(st.nextToken()); // 뽑는 횟수
        newArr = new int[m];

        dfs(0,1);
    } // end of main


    static void dfs(int index, int start){
        if(index==m){
            for(int x : newArr) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=start; i<=n; i++){
                newArr[index] = i;
                dfs(index+1,start+1);
            }
        }
    }


}
