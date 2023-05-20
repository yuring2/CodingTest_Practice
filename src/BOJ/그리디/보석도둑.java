package BOJ.그리디;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class bosuk{
    int weight;
    int price;

    public bosuk(int weight, int price){
        this.weight = weight;
        this.price = price;
    }
}

public class 보석도둑 {
    static  ArrayList<bosuk> list = new ArrayList<>();
    static PriorityQueue<Integer> pq;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 보석의 개수
        int k = Integer.parseInt(st.nextToken()); // 가방의 개수

        for (int i = 0; i < n; i++) { // 보석의 개수
            st = new StringTokenizer(bf.readLine(), " ");
            list.add(new bosuk(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        //int c = Integer.parseInt(bf.readLine()); // 가방에 담을 수 있는 최대 무개를 이렇게 입력x,, 여러개 일수도 있으니까

        pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(Integer.parseInt(bf.readLine())); // 가방의 최대 무게
        }

        long totalPrice = 0;
        for (int i = 0; i < k; i++) {  // 개방의 개수만큼 반복
            totalPrice += getPrice();
        }

        System.out.println(totalPrice);

    } // end of main

    public static int getPrice() {
        int maxPric = 0;
        int index = -1;
        int temp = pq.poll();
        for (int i = 0; i < list.size(); i++) {
            if (temp >= list.get(i).weight && maxPric < list.get(i).price) {
                maxPric = list.get(i).price;
                index = i;
            }
        }
        list.remove(index);
        return maxPric;
    }
}
