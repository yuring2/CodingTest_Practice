package programmers.lv1;
import java.util.*;

// 빵:1,  야채:2,  고기:3    
// 1231 일때 포장
class 햄버거만들기 {
    public int solution(int[] ingredient) {

        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for(int x : ingredient){
            stack.push(x);

            if(stack.size() >=4){
                if(stack.get(stack.size()-4)==1
                        && stack.get(stack.size()-3)== 2
                        && stack.get(stack.size()-2)== 3
                        && stack.get(stack.size()-1)== 1){

                    answer++;
                    stack.pop(); stack.pop(); stack.pop(); stack.pop();
                }
            }
        }
        return answer;
    }
}
