package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 모두의마블 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int max = 0;
        int maxIndex = -1;
       for(int i=0; i<list.size(); i++){
           if(max < list.get(i)){
               max = list.get(i);
               maxIndex = i;
           }
       }

       list.remove(maxIndex);
       int sum = 0;
       for(int i=0; i<list.size(); i++){
           sum+=(max+list.get(i));
       }

        System.out.println(sum);


    } // end of main

}
