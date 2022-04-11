import java.util.ArrayList;

public abstract class Piece {
	
	protected Player    player;
	protected int       point;
	
	public Piece(Player player, int point) {
		
		this.player = player;
		this.point = point;
		player.pieces.add(this);
	}

	protected abstract ArrayList<int[]> moves(int[] coords);
	
	public ArrayList<int[]> moves() {
		
		return moves(coords());
	}
	
	protected int[] coords() {
		
		for (int x = 0; x < 8; x++) {
			
			for (int y = 0; y < 8; y++) {
				
				if (Plate.plate[x][y] == this) {
					
					return new int[]{x, y};
				}
			}
		}
		return null;
	}
	
	public Player getPlayer() {
		
		return player;
	}
	
	public int getPoint() {
		
		return point;
	}
}