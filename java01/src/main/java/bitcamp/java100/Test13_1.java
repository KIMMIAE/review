// 예제 Test14_1

package bitcamp.java100;

public class Test13_1 {

    public static void main(String[] args) {
      // 1) 사용자 데이터 타입 정의하기
// - 학생의 성적 데이터를 저장할 수 있는 새로운 메모리 구조를 정의한다.
// 홍길동, 100, 98, 95, 합, 평균

    class Student {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
    }

    Student s1;

    s1 = new Student();


    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 98;
    s1.math = 95;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3.0f;
    

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
            s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);



}
}



