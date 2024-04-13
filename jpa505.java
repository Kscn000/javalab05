import java.util.*;

public class jpa505 {

    // 方法一：傳入兩個整數，計算兩個整數的和
    public static int add(int a, int b) {
        System.out.println("Adding two integers: " + a + ", " + b);
        return a + b;
    }

    // 方法二：傳入兩個浮點數，計算兩個浮點數的和
    public static double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + ", " + b);
        return a + b;
    }

    // 方法三：傳入兩個字串，合併後的兩個字串
    public static String add(String a, String b) {
        System.out.println("Adding two strings: " + a + ", " + b);
        return a + b;
    }

    public static void main(String[] args) {
        // a. add(2, 3)
        int result1 = add(2, 3);
        // b. add(5.2, 4.3)
        double result2 = add(5.2, 4.3);
        // c. add("I love", "Java!!")
        String result3 = add("I love ", "Java!!");
        
        // 顯示執行結果
        System.out.printf("%.0f %.6f %s\n", (double)result1, result2, result3);
    }
}
