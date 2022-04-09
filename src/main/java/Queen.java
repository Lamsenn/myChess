import java.util.ArrayList;

public class Queen extends Piece {
    
    public Queen(Player player) {

        super(player, 9);
    }
    
    @Override
    protected ArrayList<int[]> moves(int[] coords) {
        
        ArrayList<int[]> moves = new ArrayList<>();
    
        moves.addAll(new Rook(player).moves(coords));
        moves.addAll(new Bishop(player).moves(coords));
        
        return moves;
    }
}