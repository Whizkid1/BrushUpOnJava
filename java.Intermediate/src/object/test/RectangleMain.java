package object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(200, 40);
        Rectangle rect3 = new Rectangle(100, 20);

        //print에서 toString을 호출한다!!
        System.out.println(rect1);
        System.out.println(rect1.toString());
        System.out.println(rect2);

        System.out.println(rect1 == rect3);
        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.equals(rect3));

        System.out.println(rect1.getClass());

        //this -> toString() 가 실행
        rect2.printThis();
        System.out.println(rect2.getThis());
        System.out.println(rect1.getThis() == rect3.getThis()); // false
        System.out.println(rect1.getThis().equals(rect3.getThis())); // true

    }
}
