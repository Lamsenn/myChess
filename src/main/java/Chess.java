public class Chess {
	
	public static void main(String[] args){
		
		Player	player0 = new Player("Lamsen"),
				player1 = new Player("Magnus");
		Plate plate = new Plate(player0, player1);
		
		while (!player0.checkmate() || !player1.checkmate()) {
		
		
		}
	}
}
