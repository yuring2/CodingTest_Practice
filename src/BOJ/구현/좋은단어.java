package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 좋은단어 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 단어의 수
        int cnt = 0;
        for(int i=0; i<N; i++){
            String s = bf.readLine();
            Stack<Character> stack = new Stack<>();
            if (s.length()%2!=0) continue;
            stack.push(s.charAt(0)); // 첫 단어는 스택에 push
            for(int j=1; j<s.length(); j++){
                if(stack.size()!=0&&s.charAt(j)==stack.peek()) stack.pop();
                else stack.push(s.charAt(j));
            }
            if(stack.isEmpty()) cnt++;
        }
        System.out.println(cnt);
    } // end of main
}
