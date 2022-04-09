import java.util.ArrayList;

public class Player {
    
    private final String  name;
    private int score;
    private ArrayList<Piece> pieces      = new ArrayList<>();
    private ArrayList<Piece> takenPieces = new ArrayList<>();
    private Player opponent;
    static Player[] players = new Player[2];

    public Player(String name) {

        this.name = name;
        this.score = 0;
        if (players[0] == null) players[0] = this;
        else                    players[1] = this;
    }
    
    public void move() {
    
    
    }
    
    public void take(Piece piece) {

        piece.getPlayer().getPieces().remove(piece);
        takenPieces.add(piece);
        score += piece.getPoint();
    }

    public boolean checkmate() {

        for (Piece piece: pieces) {

            if (piece.moves().isEmpty()) return false;
        }
        return true;
    }
    
    public boolean check() {
    
        int[] kingCoords = null;
        
        for (Piece piece: pieces) {
            
            if (piece instanceof King) {
    
                kingCoords = piece.getCoords();
            }
        }
        for (Piece piece: opponent.getPieces()) {
            
            if (piece.moves().contains(kingCoords)) return true;        //to do: vérifier que .contains compare correctement
        }
        return false;
    }
    
    public int getScore() {
        
        return score;
    }

    public ArrayList<Piece> getPieces() {

        return pieces;
    }

    public ArrayList<Piece> getTakenPieces() {

        return takenPieces;
    }
}