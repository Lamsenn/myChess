import java.util.ArrayList;

public class King extends Piece {

    public King(Player player) {

        super(player, 0);
    }
    
    @Override
    public ArrayList<int[]> moves(int[] coords) {
        
        ArrayList<int[]> moves = new ArrayList<>();
        
        int x;
        int y;
        
        for (int i = -1; i <= 1; i++) {
            
            for (int j = -1; j <= 1; j++) {
                
                x = coords[0] + i;
                y = coords[1] + j;
                
                if (i != 0 && j != 0) moves.add(new int[]{x, y});
            }
        }
        return moves;
    }
}