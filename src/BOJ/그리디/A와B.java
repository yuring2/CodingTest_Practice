package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A와B {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자열을 쉽게 뒤집기 위해서 StringBuffer로 입력받는다.
        StringBuffer s = new StringBuffer(br.readLine());
        StringBuffer t = new StringBuffer(br.readLine());

        while(s.length() < t.length()){
            if(t.charAt(t.length()-1)=='A') t.deleteCharAt(t.length()-1);
            else if(t.charAt(t.length()-1)=='B'){
                t.deleteCharAt(t.length()-1);
                t.reverse();
            }
        }

        if(s.toString().equals(t.toString())) System.out.println(1);
        else System.out.println(0);

    } // end o main
}
