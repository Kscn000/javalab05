import java.util.*;
public class jpa506 {
    // 計算圓面積
    public static double calCircle(double radius) {
        double PI = 3.1415926;
        return radius * radius * PI;
    }

    // 計算三角形面積
    public static double calTriangle(double base, double height) {
        return base * height / 2;
    }

    // 計算長方形面積
    public static double calRectangle(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        // 圓的半徑
        double radius = 5;
        // 三角形的底和高
        double base = 10;
        double height = 5;
        // 長方形的長和寬
        double length = 5;
        double width = 10;

        // 計算圓面積
        double circleArea = calCircle(radius);
        // 計算三角形面積
        double triangleArea = calTriangle(base, height);
        // 計算長方形面積
        double rectangleArea = calRectangle(length, width);

        // 圖形總面積
        double totalArea = circleArea + triangleArea + rectangleArea;

        System.out.println("圓形面積為：" + circleArea);
        System.out.println("三角形面積為：" + String.format("%.6f", triangleArea));
        System.out.println("長方形面積為：" + (int)rectangleArea);
        System.out.println("此圖形面積為：" + totalArea);
    }
}
