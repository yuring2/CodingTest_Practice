package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 전화번호목록 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int tc=0; tc<T; tc++){
            String result = "YES";
            int n = Integer.parseInt(bf.readLine()); // 전화번호의 개수
            String[] arr = new String[n];

            for(int i=0; i<n; i++){
                arr[i] = bf.readLine();
            }

            Arrays.sort(arr); // 오름차순으로 정렬
            for(int i=0; i<n-1; i++){
                if(arr[i+1].startsWith(arr[i])){
                    result = "NO";
                }
            }
            System.out.println(result);
        }
    } // end of main
}
