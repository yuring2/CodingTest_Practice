package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 패션왕_다른코드 {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bf.readLine());

        for(int i=0; i<tc; i++) {
            int n = Integer.parseInt(bf.readLine());  // 의상의 수
            HashMap<String, Integer> map = new HashMap<>();
            if(n==0) continue; //이걸 하면 왜 오류임? 아~
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
                st.nextToken(); // 옷의 이름은 필요하지 않다.
                String key = st.nextToken();
                if (!map.containsKey(key)) map.put(key, 1);
                else {
                    map.put(key, map.get(key) + 1);
                }
            }

            int result = 1;
            for(int k : map.values()){
                result*=(k+1);
            }
            System.out.println(result-1);
        }

    } //end of main
}
