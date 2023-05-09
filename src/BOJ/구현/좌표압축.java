package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 좌표압축 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 좌표의 개수

        int[] origin = new int[N]; // 원본 자표를 저장할 배열
        int[] sorted = new int[N]; // 정렬한 좌표를 저장할 배열
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        for(int i=0; i<N; i++){
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        // 정렬한 배열을 순회하면서 map에 넣어준다.
        // 이 때, 원소에 이미 순의가 매겨졌다면 중복되면 안되므로 , 원소가 중복되지 않을 때만
        // map에 원소와 그에 대응되는 순위를 넣어준다.
        int rank = 0;
        for(int i : sorted){
            if(!hashMap.containsKey(i)){
                hashMap.put(i,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i : origin){
            int val = hashMap.get(i);
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    } // end of main
}
