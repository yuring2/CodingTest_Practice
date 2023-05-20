package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 한명씩 더해나갈 생각을 하지말고 더 한 후 하나씩 뺴봐라
// 먼저 9명의 키의 합을 구해준다.
//그리고 2명의 키를 sum에서 빼주고 그 뺀 키가 100이 되면 나머지 7명의 키를 오름차순으로 정렬에서 출력해주면 된다.
public class 일곱난쟁이_2 {
    public static void main(String[] args) throws Exception{
        int[] n = new int[9];
        int sum = 0;
        int fake1=0;
        int fake2=0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<n.length; i++){
            n[i] = Integer.parseInt(bf.readLine());
            sum+=n[i];
        }

        Arrays.sort(n);

        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if(sum-n[i]-n[j]==100){
                    fake1 = n[i];
                    fake2 = n[j];
                }
            }
        }

        for(int i=0; i<n.length; i++){
            if(n[i]==fake1 || n[i]==fake2) continue;
            System.out.println(n[i]);
        }

    } // end of main
}
