// ## 메모리 준비
// 값을 저장하기 위해 메모리를 준비하는 방법을 알아보자!
// 예제 Test12_1

// ## 메모리 준비
// 값을 저장하기 위해 메모리를 준비하는 방법을 알아보자!
//

package bitcamp.java100;

public class Test7 {

    public static void main(String[] args) {
// 자바 원시 타입의 메모리 준비하기
        byte b;   //정수를 저장할 1바이트 크기의 메모리 준비
        short s;  //정수를 저장할 2바이트 크기의 메모리 준비
        int i;    //정수를 저장할 4바이트 크기의 메모리 준비
        long l;   //정수를 저장할 8바이트 크기의 메모리 준비
        float f;  //부동소수점을 저장할 4바이트 크기의 메모리 준비
        double d; //부동소수점을 저장할 8바이트 크기의 메모리 준비
        boolean bool; //논리 값을 저장할 4바이트 크기의 메모리 준비
        char c; //유니코드 값을 저장할 2바이트 크기의 메모리 준비

// 메모리에 값 저장하기: '=' 연산자를 사용한다.
// => '=' 연산자는 "assignment" 연산자라 부른다.
// => l-value = r-value 
// => l-value는 항상 메모리여야 한다.
// => r-value 값이거나 메모리가 될 수 있다.
        b = 100;
        s = 100;
        i = 100;
        l = 100;
        f = 3.14f;
        d = 3.14;
        bool = true;
        c = 44032;        
        
// 메모리에 저장된 값 출력하기
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);

        // Test12_9까지 했음 //
    }
}