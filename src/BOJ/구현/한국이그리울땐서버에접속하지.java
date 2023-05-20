package BOJ.구현;
// 패턴은 소문자 여러개와 * 하나로 이루어진 문자열

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 한국이그리울땐서버에접속하지 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 파일의 개수
        String target = bf.readLine();
        String[] str = target.split("\\*");

        for(int i=0; i<N; i++){
            String word = bf.readLine();

            if(word.length() < target.length()-1){
                System.out.println("NE");
                continue;
            }

            String start = word.substring(0,str[0].length()); // !!! 왜 이런생각을 못하냐
            String end = word.substring(word.length()-str[1].length(), word.length());


            if(start.equals(str[0]) && end.equals(str[1])) System.out.println("DA");
            else System.out.println("NE");
        }


    } // end of main
}
