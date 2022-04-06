public class Player {
    
    private String  name;
    private int     score;
    private Piece[] takenPieces = new Piece[15];
    static Player[] players = new Player[2];

    public Player(String name) {

        this.name = name;
        this.score = 0;
        if (players[0] == null) players[0] = this;
        else                    players[1] = this;
    }
    
    public void take(Piece piece) {
        
        int i = 0;
        while (takenPieces[i] != null) i++;
        takenPieces[i] = piece;
        score += piece.getPoint();
    }
    
    public Piece getTakenPieces(int i) {
        
        return takenPieces[i];
    }
    
    public int getScore() {
        
        return score;
    }
}