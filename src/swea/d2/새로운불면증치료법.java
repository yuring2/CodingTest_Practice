package swea.d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 새로운불면증치료법 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            int N = Integer.parseInt(br.readLine());
            int in = 0;
            int cnt = 0;
            int[] check = new int[10];
            while(cnt < 10){
               in+=N; // N 배수만큼 증가
               String num = Integer.toString(in);
                for(int i=0; i<num.length(); i++) {
                    if (check[Character.getNumericValue(num.charAt(i))] == 0) {
                        check[Character.getNumericValue(num.charAt(i))] = 1;
                        cnt++;
                    }
                }
            }
            System.out.println("#"+tc+" "+in);
        }

    } // end of main
}
