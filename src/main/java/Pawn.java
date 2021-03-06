import java.util.ArrayList;

public class Pawn extends Piece {

    private boolean moved;
    private final Piece[][] plate;
    
    public Pawn(Player player) {

        super(player, 1);
        moved = false;
        plate = Plate.getPlate();
    }

    protected ArrayList<int[]> moves(int[] coords) {    //to do: implémenter le En Passant

        ArrayList<int[]> moves = new ArrayList<>();
        int x, y, i;
        
        if (Player.getPlayers()[0] == player) i =  1;
        else                                  i = -1;
        
        for (int j = -1; j <= 1; j++) {
            
            x = coords[0] + i;
            y = coords[1] + j;
            
            if      (j == 0 && plate[x][y] != null)               break;
            else if (j != 0 && plate[x][y] == null)               break;
            else if (j != 0 && plate[x][y].getPlayer() == player) break;

            moves.add(new int[]{x, y});
        }
        if (coords[0] == 1 || coords[0] == 6) {
    
            x = coords[0] + 2 * i;
            y = coords[1];
            moves.add(new int[]{x, y});
        }
        return moves;
    }
    
    public void promotion(String name) {
        
        int x = coords()[0];
        int y = coords()[1];
        plate[x][y] = null;
        
        if      (name.equals("Rook"))   plate[x][y] = new Rook(player);
        else if (name.equals("Knight")) plate[x][y] = new Knight(player);
        else if (name.equals("Bishop")) plate[x][y] = new Bishop(player);
        else if (name.equals("Queen"))  plate[x][y] = new Queen(player);
    }
}