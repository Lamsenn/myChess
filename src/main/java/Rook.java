import java.util.ArrayList;

public class Rook extends Piece {
    
    protected boolean hasMoved;
    protected boolean castle;
    
    private final Piece[][] plate = Plate.plate;
    
    public Rook(Player player) {

        super(player, 5);
    }
    
    @Override
    protected ArrayList<int[]> moves(int[] coords) {    //to do: implémenter le roc
    
        ArrayList<int[]> moves = new ArrayList<>();
        int x, y;
    
        for (int i = -1; i <= 1; i++) {
        
            for (int j = -1; j <= 1; j++) {
            
                x = coords[0];
                y = coords[1];
            
                while (Math.abs(i) != Math.abs(j) && x > 0 && x < 8 && y > 0 && y < 8) {
    
                    x += i;
                    y += j;
                    if (plate[x][y].getPlayer() == player) break;
                    moves.add(new int[]{x, y});
                    if (plate[x][y] != null) break;
                    
                    
                }
            }
        }
        return moves;
    }
}