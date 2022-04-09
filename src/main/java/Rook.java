import java.util.ArrayList;

public class Rook extends Piece {
    
    public Rook(Player player) {

        super(player, 5);
    }
    
    @Override
    public ArrayList<int[]> moves(int[] coords) {                   //to do: implémenter le roc
    
        ArrayList<int[]> moves = new ArrayList<>();
    
        int x;
        int y;
    
        for (int i = -1; i <= 1; i++) {
        
            for (int j = -1; j <= 1; j++) {
            
                x = coords[0];
                y = coords[1];
            
                while (Math.abs(i) != Math.abs(j) && x > 0 && x < 8) {
                
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