package oop.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        // 정답 코드에서는 왜 this.width == this.height 로 했지??
        return width == height;
    }
}
