import java.util.ArrayList;

public class Knight extends Piece {
    
    public Knight(Player player) {

        super(player, 3);
    }
    
    @Override
    protected ArrayList<int[]> moves(int[] coords) {
        
        ArrayList<int[]> moves = new ArrayList<>();
        int x, y;
        
        for (int i = -2; i <= 2; i++) {
            
            for (int j = -2; j <=2; j++) {
    
                x = coords[0] + i;
                y = coords[1] + j;
                
                if (Math.abs(i) + Math.abs(j) == 3 && x > 0 && x < 8 && y > 0 && y < 8) {
                    
                    moves.add(new int[]{x, y});
                }
            }
        }
        return moves;
    }
}