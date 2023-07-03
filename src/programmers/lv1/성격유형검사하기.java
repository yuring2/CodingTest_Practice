package programmers.lv1;
import java.util.*;
class 성격유형검사하기 {
    public String solution(String[] survey, int[] choices) {

        // 성격 유형별 점수
        int R_score = 0; int T_score = 0; int C_score = 0; int F_score = 0;
        int J_score = 0; int M_score = 0; int A_score = 0; int N_score = 0;

        for(int i=0; i<survey.length; i++){
            String type = survey[i].substring(0,1);
            if(choices[i] > 4) type = survey[i].substring(1,2);

            int score = Math.abs(choices[i]-4);

            switch(type){
                case "R" : R_score+=score; break;
                case "T" : T_score+=score; break;
                case "C" : C_score+=score; break;
                case "F" : F_score+=score; break;
                case "J" : J_score+=score; break;
                case "M" : M_score+=score; break;
                case "A" : A_score+=score; break;
                case "N" : N_score+=score; break;
            }
        } // end of for

        String type1 = "R";
        String type2 = "C";
        String type3 = "J";
        String type4 = "A";


        if(R_score < T_score) type1 = "T";
        if(C_score < F_score) type2 = "F";
        if(J_score < M_score) type3 = "M";
        if(A_score < N_score) type4 = "N";

        return type1+type2+type3+type4;

    } // end of solution()
}
