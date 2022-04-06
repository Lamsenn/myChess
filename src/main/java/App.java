public class App {

    public static void main(String[] args){

		/*
		My.print("Enter Player1's name: "); Player player1 = new Player(My.inputString());
		My.print("Enter Player2's name: "); Player player1 = new Player(My.inputString());
		*/

        Player	player0 = new Player("Lamsen"),
                player1 = new Player("Magnus");
        Plate plate = new Plate(player0, player1);
        Plate.plate
    }
}