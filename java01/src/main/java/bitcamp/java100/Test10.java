// 예제 Test13_4

package bitcamp.java100;

public class Test10 {

    public static void main(String[] args) {
// 배열 레퍼런스 선언과 동시에 배열 생성
int[] arr1 = new int[3];

// 배열 생성과 동시에 값 초기화 
// => 방법1
//    초기화시키는 값 개수만큼 배열을 만든다.
  int[] arr2 = new int[] {100,200, 300};

//    물론, 레퍼런스를 먼저 만든 다음에 배열을 생성할 수도 있다.
int[] arr3;
arr3 = new int[] {100, 200, 300};

// => 방법2
//    new int[]를 선언하지 않아도 레퍼런스의 타입을 보면 int 배열을 생성해야 한다는 것을 추측할 수 있기 때문에 생략을 허락한다.
int[] arr4 = {100, 200, 300};

//    단, 레퍼런스 선언과 동시에 값을 초기화할 때만 new int[]를 생략할 수 있다.
int[] arr5;
        //arr5 = {100, 200, 300}; // 컴파일 오류!
    }
}

