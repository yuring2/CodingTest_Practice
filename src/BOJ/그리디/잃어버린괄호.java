package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 잃어버린괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MIN_VALUE;
        StringTokenizer substraction = new StringTokenizer(br.readLine(),"-");

        while(substraction.hasMoreTokens()){ // true or false 반환
            int temp = 0;

            StringTokenizer addition = new StringTokenizer(substraction.nextToken(),"+");
            while(addition.hasMoreTokens()){
                temp += Integer.parseInt(addition.nextToken());
            }

            if(sum==Integer.MIN_VALUE){
                sum = temp;
            }else{
                sum-=temp;
            }
        }
        System.out.println(sum);
    } // end of main
}

