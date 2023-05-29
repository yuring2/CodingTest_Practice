package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열_복습 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(bf.readLine());
        int start = 0;
        while(N-->0){
            int value = Integer.parseInt(bf.readLine());
            if(value > start){
                for(int i=start+1; i<=value; i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            } else if (stack.peek()!=value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");

        }
        System.out.println(sb);
    } // end of main
}
