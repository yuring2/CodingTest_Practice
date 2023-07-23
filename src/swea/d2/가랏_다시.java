package swea.d2;
import java.util.Scanner;

public class 가랏_다시 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N, nowSpeed, dis;

        for(int tc=1; tc<=T; tc++) {
            dis = 0;
            nowSpeed = 0;
            N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                switch (sc.nextInt()) {
                    case 1:
                        nowSpeed += sc.nextInt();
                        break;
                    case 2:
                        nowSpeed -= sc.nextInt();
                        if (nowSpeed < 0) nowSpeed = 0;
                        break;
                }
                dis += nowSpeed;
            }
            System.out.println("#" +tc+" "+dis);
        }
    }
}

