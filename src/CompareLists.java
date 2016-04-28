import java.util.List;

/**
 * Created by Nik on 4/28/2016.
 */
public class CompareLists {

    // Method to compare two lists for the same integer elements regardless of order
    public static void CompareLists(List one, List two){
        if (one.containsAll(two)){
            System.out.println("Both lists contain all the same elements.");
        } else {
            System.out.println("Both lists do not contain all the same elements.");
        }
    }
}
