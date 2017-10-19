// ## 사용자 정의 데이터 타입 만들기 III
// - 다음 정보를 저장할 새 데이터 타입을 정의하라!
//   비트캠프의 수강생 정보를 저장할 데이터 타입.
//   사용자 데이터타입 최소 6개 만들고 // 홍길동, 111-1111, 30 출력
// 예제 Test14_3

package bitcamp.java100;

public class Test13_3 {

    public static void main(String[] args) {
        class Student {
            String name;
            String tel;
            int age;
            boolean working;
            float gpd;
            String birth;
        }

        Student s;

        s = new Student();

        s.name = "홍길동";
        s.tel = "111-1111";
        s.age = 30;

        System.out.printf("%s, %s, %d\n", s.name, s.tel, s.age);







}
}



