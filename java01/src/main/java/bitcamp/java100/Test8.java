// 예제 Test13_1

package bitcamp.java100;

public class Test8 {

    public static void main(String[] args) {

        // 국어, 영어, 수학, 사회, 과학, 도덕, 중국어 점수를 저장할 변수를 만들라!
        // => 배열 사용 전:

        int kor, eng, math, soc, sci, eth, chi;
        kor = 100;
        eng = 100;
        math = 100;
        soc = 100;
        sci = 100;
        eth = 100;
        chi = 100;

        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(soc);
        System.out.println(sci);
        System.out.println(eth);
        System.out.println(chi);

        System.out.println("------------------------------");

        // => 배열 사용 후:

        int[] scores = new int[7];

        scores[0] = 100;
        scores[1] = 100;
        scores[2] = 100;
        scores[3] = 100;
        scores[4] = 100;
        scores[5] = 100;
        scores[6] = 100;

        for (int i = 0; i < 7; i++) {
                System.out.println(scores[i]);
        }





    }
}