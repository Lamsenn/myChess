import java.util.ArrayList;

public class King extends Piece {

    protected boolean hasMoved;
    
    public King(Player player) {

        super(player, 0);
        this.hasMoved = false;
    }
    
    @Override
    protected ArrayList<int[]> moves(int[] coords) {    //to do: implémenter le roc
        
        ArrayList<int[]> moves = new ArrayList<>();
        int x, y;
        
        for (int i = -1; i <= 1; i++) {
            
            for (int j = -1; j <= 1; j++) {
                
                x = coords[0] + i;
                y = coords[1] + j;
                
                if (i != 0 && j != 0 && x > 0 && x < 8 && y > 0 && y < 8) {
                    
                    moves.add(new int[]{x, y});
                }
            }
        }
        return moves;
    }
}