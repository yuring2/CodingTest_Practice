package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Assignment{
    int day;
    int score;

    public Assignment(int day, int score){
        this.day = day;
        this.score = score;
    }
}

public class 과제 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int totalscore = 0;
        List<Assignment> list = new ArrayList<>();

        int maxday = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            maxday = Math.max(maxday,day);
            list.add(new Assignment(day,score));
        }

        for(int i= maxday; i>0; i--){
            totalscore += getScore(list, maxday);
        }

        System.out.println(totalscore);
// 5 6     6 8
// 2 3    3 4     1 2


    } // end of main

    public static int getScore(List<Assignment> list, int now){
        int result = 0;
        int index = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).day >= now && result < list.get(i).score){
                index = i;
                result = list.get(i).score;
            }
        }
        list.remove(index);
        return result;
    }



}
