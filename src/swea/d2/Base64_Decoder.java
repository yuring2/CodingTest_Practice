package swea.d2;

import java.util.Base64;
import java.util.Scanner;

public class Base64_Decoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String s = sc.next();
            String decode =  new String(Base64.getDecoder().decode(s));
            System.out.println("#"+tc+" "+decode);
        }
    } // end of main
}
