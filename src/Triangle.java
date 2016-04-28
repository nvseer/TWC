

import java.util.LinkedList;

/**
 * Created by Nik on 4/25/2016.
 */
public class Triangle {


    public static void Triangle(int a, int b, int c) {

        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("One of the side values is <= 0, please correct and rerun the unit test.");
            return;
        }

    if (!((a + b) > c) || !((a + c) > b) || !((b + c) > a)) {
        System.out.println("This is not a valid triangle since the sum of any 2 sides is not greater than the third side.");
        return;
    }
    if ((a == b) && (a == c)) {
        System.out.println("Triangle is of type Equilateral.");
    }
    if (((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (b != a))) {
        System.out.println("Triangle is of type Isosceles.");
    }
    if ((a != b) && (a != c) && (b != c)) {
        System.out.println("Triangle is of type Scalene.");
    }

}



}
