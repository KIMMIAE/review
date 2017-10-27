package bitcamp.java100.ex1;

public class Test1 {

    public static void main(String[] args) {

        Car[] cars = new Car[3];

        cars[0] = new Car(null, 0, 0);
        cars[1] = new Car(null, 0, 0);
        cars[2] = new Car(null, 0, 0);
        
//        Car car2 = new Car(null, 0, 0);
//        for (int k = 0; k < cars.length; k++) {
//            cars[k] = new Car(null, k, k);
//        }

        cars[0].color = "black";
        cars[0].num = 1234;
        cars[0].speed = 0;

        cars[1].color = "red";
        cars[1].num = 9870;
        cars[1].speed = 10;

        cars[2].color = "gray";
        cars[2].num = 5678;
        cars[2].speed = 5;
        

        for (int i = 0; i < cars.length; i++) {

            System.out.printf("%s, %d, %d\n", cars[i].color, cars[i].num, cars[i].speed);
        }

    }

}
