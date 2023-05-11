package BOJ.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//1~n까지의 수를 스택에 넣었다가 뽑는다. 제발 문제 제대로 읽어라
// 1 2 5 7 8
// 4 3 6 8 7 5 3 2
public class 스택수열 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력할 결과물을 저장. 배열에 저정할 까 했지만 인뎃스도 신경써야해서 골치아프니 이런 경우는 리스트나 스트링 빌더 사용하자.

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(bf.readLine());
        int start = 0; // 스택에 어디까지 push했는지 알아두기 위해서
        while(N-->0){
            int value = Integer.parseInt(bf.readLine());

            if(value > start){
                for(int i=start+1; i<=value; i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            } else if (stack.peek()!=value) { // 입력받은 수보다 start가 작은 경우 이미 스택에 들어있는 것이므로 pop
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    } // end of main
}
