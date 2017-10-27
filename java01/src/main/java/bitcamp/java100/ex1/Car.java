package bitcamp.java100.ex1;

public class Car {
    String color;
    int num;
    int speed;

    Car(String color, int num, int speed ) {
        this.color = color;
        this.num = num;
        this.speed = speed;
    }

//    void color(String color) {
//        this.color = color;
//    }

//    void num(int num) {
//        this.num = num;
//    }

    void acc() {
        this.speed += 10;
        System.out.println(this.speed);
        if (speed >= 200) {
            speed = 200;
            System.out.println("최대 스피드 입니다!");
        }
    }

    void stop() {
        this.speed -= 10;
        System.out.println(this.speed);
        if (speed <= 0) {
            speed = 0;
            System.out.println("스피드가 0입니다.");
        }

    }
}
