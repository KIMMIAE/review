// ## 사용자 정의 데이터 타입 만들기 II
// - 다음 정보를 저장할 새 데이터 타입을 정의하라!
//   도서명, 저자, 출판사, 페이지, 가격($)
//   자바야 나 잡아봐라!, 홍길동, 비트출판사, 200, 35.7
// 예제 Test14_2

package bitcamp.java100;

public class Test13_2 {

    public static void main(String[] args) {
        class Book {
            String title;
            String aut;
            String press;
            int page;
            float price;
        }

    Book b1;

    b1 = new Book();

    b1.title = "자바야 나 잡아봐라!";
    b1.aut = "홍길동";
    b1.press = "비트출판사";
    b1.page = 200;
    b1.price = 35.7f;

    System.out.printf("%s, %s, %s, %d, %f\n", b1.title, b1.aut, b1.press, b1.page, b1.price);






}
}



