package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 이진트리
public class 부분집합구하기 {
    //static int[] newArr;
    static int n;
    static int[] ch;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        //newArr = new int[n];
        ch = new int[n+1];
        dfs(1);

    } // end of main

    static void dfs(int j){  // 새로 만들 배열의 인덱스
       if(j==n+1){
           String tmp ="";
           for(int i=1; i<=n; i++){
               if(ch[i]==1) tmp +=i+" ";
           }

           // 공집합은 출력하면 안되니깐
           if(tmp.length()>0) System.out.println(tmp);
       }else{
           ch[j]=1;
           dfs(j+1);  // 사용하는 경우
           ch[j]=0;
           dfs(j+1);  // 사용하지 않는 경우
       }
    }


}
