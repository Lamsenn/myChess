import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	
	private final String name;
	private int score;
	public final ArrayList<Piece> pieces      = new ArrayList<>();
	private final ArrayList<Piece> takenPieces = new ArrayList<>();
	private final Player opponent;
	static Player[] players = new Player[2];
	
	public Player(String name) {
		
		this.name = name;
		this.score = 0;
		if (players[0] == null) {
			
			players[0] = this;
			opponent = players[1];
		}
		else {
			
			players[1] = this;
			opponent = players[0];
		}
	}
	
	public void move() {
	
	
	}
	
	public void take(Piece piece) {
		
		opponent.pieces.remove(piece);
		takenPieces.add(piece);
		score += piece.point;
	}
	
	public boolean isCheckmate() {
		
		for (Piece piece: pieces) {
			
			if (piece.moves().isEmpty()) return false;
		}
		return true;
	}
	
	public boolean isCheck() {
		
		int[] kingCoords = null;
		
		for (Piece piece: pieces) {
			
			if (piece instanceof King) {
				
				kingCoords = piece.coords();
			}
		}
		for (Piece piece: opponent.pieces) {
			
			for (int[] coords: piece.moves()) {
				
				if (Arrays.equals(coords, kingCoords)) return true;
			}
		}
		return false;
	}
}