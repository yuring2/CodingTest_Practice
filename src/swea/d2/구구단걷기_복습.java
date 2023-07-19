package swea.d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 구구단걷기_복습 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){

            long num = Long.parseLong(br.readLine());
            long path = num-1;

            for(long j=2; j<=Math.sqrt(num); j++){
                if(num%j==0){
                    if(path > j+(num/j)-2) path = j+(num/j)-2;
                }
            }
            System.out.println("#"+tc+" "+path);
        }
    } // end of main

}

