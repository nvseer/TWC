import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Nik on 4/27/2016.
 */
public class Tests {

    @Test
    public void TriangleTest(){
        // Input the 3 side lengths of a triangle which are > 0 and reports what type of triangle it is
        Triangle.Triangle(90,5,6);
    }

    @Test
    public void LinkedListFifthFromEndTest(){
        // Create a linked list and add elements
        LinkedList linkedList = new LinkedList();
        linkedList.add("3");
        linkedList.add("5");
        linkedList.add("8");
        linkedList.add("10");
        linkedList.add("14");
        linkedList.add("19");
        linkedList.add("23");
        LinkedList.findFifthElementFromEnd(linkedList);
    }

    @Test
    public void ListComparison(){
        // Create two integer lists and compare the elements regardless of order
        Integer [] listOne = new Integer[] {1,2,3,5};
        Integer [] listTwo = new Integer[] {5,2,3,1};
        List<Integer> one = new ArrayList<>(Arrays.asList(listOne));
        List<Integer> two = new ArrayList<>(Arrays.asList(listTwo));
        CompareLists.CompareLists(one,two);
    }

}