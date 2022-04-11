import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args){
    
        ArrayList<int[]> moves = new ArrayList<>();
        moves.add(new int[]{0, 1});
        moves.add(new int[]{1, 8});
        moves.add(new int[]{8, 1});
        moves.add(new int[]{2, 2});
        
        for (int[] tab: moves) {
            
            if (Arrays.equals(tab, new int[]{2, 2})) {
    
                System.out.println("print");
            }
        }
    }
}