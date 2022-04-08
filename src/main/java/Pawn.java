import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pawn extends Piece {

    private Player  player;
    private int		point;

    public Pawn(Player player) {

        super(player);
        this.point = 1;
    }

    public ArrayList<int[]> moves() {

        ArrayList<int[]> moves = new ArrayList<>();

        return moves;
    }
}
