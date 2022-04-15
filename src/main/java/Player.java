import java.util.ArrayList;
import java.util.Arrays;

public class Player {

	private final String name;
	private int score;
	private final ArrayList<Piece> pieces;
	private final ArrayList<Piece> taken;
	private final Player opponent;
	private final static Player[] players = new Player[2];
	
	public Player(String name) {

		this.name = name;
		this.score = 0;
		this.pieces = new ArrayList<>();
		this.taken = new ArrayList<>();

		if (players[0] == null) {
			
			players[0] = this;
			opponent = players[1];
		}
		else {
			
			players[1] = this;
			opponent = players[0];
		}
	}
	
	public void take(Piece piece) {
		
		opponent.pieces.remove(piece);
		taken.add(piece);
		score += piece.point;
	}

	//peut-être à redéfinir
	public boolean isCheckmate() {
		
		for (Piece piece: pieces) {
			
			if (piece.moves().isEmpty()) return false;
		}
		return true;
	}
	
	public boolean isCheck(int[] kingCoords) {

		if (kingCoords == null) {

			for (Piece piece: pieces) {

				if (piece instanceof King) {

					kingCoords = piece.coords();
				}
			}
		}

		for (Piece piece: opponent.pieces) {
			
			for (int[] coords: piece.moves()) {
				
				if (Arrays.equals(coords, kingCoords)) return true;
			}
		}
		return false;
	}

	public ArrayList<Piece> getPieces() {

		return pieces;
	}

	public ArrayList<Piece> getTaken() {

		return taken;
	}

	public Player getOpponent() {

		return opponent;
	}

	public static Player[] getPlayers() {

		return players;
	}
}