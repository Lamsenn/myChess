import java.util.ArrayList;

public class Bishop extends Piece {

    public Bishop(Player player) {

        super(player, 3);
    }
    
    @Override
    public ArrayList<int[]> moves(int[] coords) {
    
        ArrayList<int[]> moves = new ArrayList<>();
    
        int x;
        int y;
    
        for (int i = -1; i < 2; i++) {
        
            for (int j = -1; j < 2; j++) {
            
                x = coords[0];
                y = coords[1];
            
                while (Math.abs(i) == Math.abs(j) && i != 0 && x > 0 && x < 8) {
                
                    if (Plate.plate[x][y].getPlayer() == player) break;
                    moves.add(new int[]{x, y});
                    if (Plate.plate[x][y] != null) break;
                    x += i;
                    y += j;
                }
            }
        }
        return moves;
    }
}