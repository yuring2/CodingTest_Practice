package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 송아지찾기 {
    //static int[] dis = new int[100001];
    static int s;
    static int e;
    static int[] jump = {1,-1,5};
    static int[] ch;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        s = Integer.parseInt(st.nextToken()); // 현수의 위치
        e = Integer.parseInt(st.nextToken()); // 송아지의 위치
        ch = new int[100001];
        System.out.println(bfs());

    } // end of main

    static int bfs(){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        ch[s] = 1;
        int L=0;

        while(!q.isEmpty()){
            int len = q.size(); // 큐 사이즈를 측정하고
            for(int i=0; i<len; i++){  // 큐 사이즈만큼 돌린다.
                int temp = q.poll();
                if(temp==e) return L;
                for(int j=0; j<3; j++){
                    int nx = temp+ jump[j];
                    if(nx>1&&nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        q.add(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }


}
