import java.util.ArrayList;

public abstract class Piece {

	private Player  player;
	private int		point;
	
	public Piece(Player player) {
		
		this.player = player;
	}

	public ArrayList<int[]> moves();
	
	public Player getPlayer() {
		
		return player;
	}
	
	public int getPoint() {
		
		if      (name.equals("Pawn"))   return 1;
		else if (name.equals("Rook"))   return 5;
        else if (name.equals("Knight")) return 3;
        else if (name.equals("Bishop")) return 3;
        else                            return 9;
	}
}