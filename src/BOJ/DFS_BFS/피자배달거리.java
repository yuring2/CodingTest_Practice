package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point3{
    int x;
    int y;

    public Point3(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class 피자배달거리 {
    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<Point3> pizza, house;
    static int len;
    static int[] combi; // 조합을 저장하기 위함.


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        pizza = new ArrayList<>();
        house = new ArrayList<>();

        st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp==1) house.add(new Point3(i,j));
                else if(temp==2) pizza.add(new Point3(i, j));
            }
        }

        len = pizza.size();
        combi = new int[m]; // 4개의 피자집을 선택한다고 했으니깐,,
        dfs(0,0);
    } // end of main


    static void dfs(int index, int s){  // 조합을 구한다.
        if(index==m){
            int sum = 0;
            for(Point3 h : house){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis,Math.abs(h.x-pizza.get(i).x)+ Math.abs(h.y-pizza.get(i).y));
                }
                sum+=dis;
            }

            answer=Math.min(answer,sum);
        }else{
            for(int i=s; i<len; i++){  // 총 6개의 피자집 중에서 4개를 뽑아야함
                combi[index] = i;
                dfs(index+1,i+1);
            }
        }
    }



}
