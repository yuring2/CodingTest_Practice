package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 패션왕 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bf.readLine());
        int answer = 0;

        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(bf.readLine());  // 의상의 수
            if(n==0){
                System.out.println(0);
                continue;
            }
            HashMap<String, Integer> map = new HashMap<>();

            for(int j=0; j<n; j++){
                StringTokenizer st = new StringTokenizer(bf.readLine()," ");
                st.nextToken(); // 옷의 이름은 필요하지 않다.
                String key = st.nextToken();
                if(!map.containsKey(key)) map.put(key, 1);
                else{
                    map.put(key, map.get(key)+1);
                }
            }

            // 정답 도출
          for(int k : map.values()) answer+=k;

          int mul=1;
          if(map.size()!=1) {
              for (int k : map.values()) {
                  mul *= k;
              }
              answer+=mul;
          }


            System.out.println(answer);
        }



    } // end of main
}
