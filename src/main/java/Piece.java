public class Piece {
	
	private String  name;
	private Player  player;
	private int     x;
	private int     y;
	private int[][] moves;
	
	public Piece(Player player, String piece) {
		
		this.player = player;
		if      (piece.equals("Pawn"))      pawnBuilder(player);
		else if (piece.equals("Rook"))      rookBuilder(player);
		else if (piece.equals("Knight"))    knightBuilder(player);
		else if (piece.equals("Bishop"))    bishopBuilder(player);
		else if (piece.equals("Queen"))     queenBuilder(player);
		else                                kingBuilder(player);
	}
	
	private void pawnBuilder(Player player) {
		
		this.name   = "Pawn";
		this.player = player;
		if (player.equals(Player.players[0])) {
			this.moves = new int[][]{{1, 4, 1},
									 {0, 3, 0},
									 {0, 2, 0}};
		}
		else {
			this.moves = new int[][]{{0, 2, 0},
									 {0, 3, 0},
									 {1, 4, 1}};
		}
	}
	
	private void rookBuilder(Player player) {
		
		this.name   = "Rook";
		this.player = player;
		this.moves  = new int[][]{{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}};
	}
	
	private void knightBuilder(Player player) {
		
		this.name   = "Knight";
		this.player = player;
		this.moves  = new int[][]{{0, 1, 0, 1, 0},
								  {1, 0, 0, 0, 1},
								  {0, 0, 2, 0, 0},
								  {1, 0, 0, 0, 1},
								  {0, 1, 0, 1, 0}};
	}
	
	private void bishopBuilder(Player player) {
		
		this.name   = "Bishop";
		this.player = player;
		this.moves  = new int[][]{{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
								  {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
								  {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
								  {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
								  {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
								  {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
								  {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
								  {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
								  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}};
	}
	
	private void queenBuilder(Player player) {
		
		this.name   = "Queen";
		this.player = player;
		this.moves  = new int[][]{{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
								  {0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
								  {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
								  {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
								  {0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
								  {1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1},
								  {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0},
								  {0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0},
								  {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
								  {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
								  {0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
								  {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1}};
	}
	
	private void kingBuilder(Player player) {
		
		this.name   = "King";
		this.player = player;
		this.moves  = new int[][]{{1, 1, 1},
								  {1, 2, 1},
								  {1, 1, 1}};
	}
	
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