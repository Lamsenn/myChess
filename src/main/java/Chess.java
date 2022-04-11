public class Chess {
	
	public static void main(String[] args){
		
		Player	player0 = new Player("Lamsen"),
				player1 = new Player("Magnus");
		Plate plate = new Plate(player0, player1);
		
		System.out.println(Plate.plate);
		
		//while (!player0.isCheckmate() || !player1.isCheckmate()) {
		
		
	}
}
