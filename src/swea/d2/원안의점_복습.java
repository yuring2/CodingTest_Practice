package swea.d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.nio.Buffer;

public class 원안의점_복습 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for(int x=-n; x<=n; x++){
                for(int y=-n; y<=n; y++){
                    if(x*x+y*y<=n*n) count++;
                }
            }


            System.out.println("#"+tc+" "+count);
        }
    }
}

