// 예제 Test14_1

package bitcamp.java100;

public class Test12 {

    public static void main(String[] args) {
      // 1) 사용자 데이터 타입 정의하기
// - 학생의 성적 데이터를 저장할 수 있는 새로운 메모리 구조를 정의한다.
// 홍길동, 100, 98, 95, 합, 평균
        // 새 데이터 타입을 선언한다. 
        class Score {
            //2) 메모리 구조를 정의한다.
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;

        }
    

// 2) 새 데이터 타입에 따라 만든 메모리의 주소를 저장할 변수 선언
//    => 메모리설계도명_즉_클래스명 레퍼런스명;
    // Score 설계도에 따라 준비한 메모리의 주소를 저장.
    Score r1;
// 3) 사용자가 새로 정의한 데이터 타입에 따라 메모리를 준비하기
//    => new 메모리설계도명_즉_클래스명();
     // 설계도에 따라 만든 메모리를 "인스턴스"라 한다.
     r1 = new Score();
// 4) 레퍼런스를 사용하여 새 메모리에 값 넣기
//    => 레퍼런스명.내부메모리명 = 값;
    r1.name = "홍길동";
    r1.kor = 100;
    r1.eng = 100;
    r1.math = 100;
    r1.sum = r1.kor + r1.eng + r1.math;
    r1.aver = r1.sum / 3.0f;

    System.out.printf("%s, %d, %d, %d, %d, %f\n", 
    r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);
}
}

//14_6까지 했음. 4~6 다시 읽어보고 14_6 해볼 것!



