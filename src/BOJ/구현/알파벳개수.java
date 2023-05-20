package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

// 아스키 코드 값을 이용해서 구현
// a의 아스키 코드갑은 0이다.
public class 알파벳개수 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 알파벳 개수를 저장하는 배열
        String s = bf.readLine();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            arr[c-97]++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    } // end of main
}
