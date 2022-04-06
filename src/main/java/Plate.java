public class Plate {

    private Piece	p00, p01, p02, p03, p04, p05, p06, p07, r00, r01, n00, n01, b00, b01, q00, k00;
    private Piece	p10, p11, p12, p13, p14, p15, p16, p17, r10, r11, n10, n11, b10, b11, q10, k10;
    public static Piece[][] plate;

    public Plate(Player player0, Player player1) {
    
        p00 = new Piece(player0, "Pawn");
        p01 = new Piece(player0, "Pawn");
        p02 = new Piece(player0, "Pawn");
        p03 = new Piece(player0, "Pawn");
        p04 = new Piece(player0, "Pawn");
        p05 = new Piece(player0, "Pawn");
        p06 = new Piece(player0, "Pawn");
        p07 = new Piece(player0, "Pawn");
        r00 = new Piece(player0, "Rook");
        r01 = new Piece(player0, "Rook");
        n00 = new Piece(player0, "Knight");
        n01 = new Piece(player0, "Knight");
        b00 = new Piece(player0, "Bishop");
        b01 = new Piece(player0, "Bishop");
        q00 = new Piece(player0, "Queen");
        k00 = new Piece(player0, "King");
    
        p10 = new Piece(player1, "Pawn");
        p11 = new Piece(player1, "Pawn");
        p12 = new Piece(player1, "Pawn");
        p13 = new Piece(player1, "Pawn");
        p14 = new Piece(player1, "Pawn");
        p15 = new Piece(player1, "Pawn");
        p16 = new Piece(player1, "Pawn");
        p17 = new Piece(player1, "Pawn");
        r10 = new Piece(player1, "Rook");
        r11 = new Piece(player1, "Rook");
        n10 = new Piece(player1, "Knight");
        n11 = new Piece(player1, "Knight");
        b10 = new Piece(player1, "Bishop");
        b11 = new Piece(player1, "Bishop");
        q10 = new Piece(player1, "Queen");
        k10 = new Piece(player1, "King");
    
        plate = new Piece[][]{{ r10, n10, b10, q10, k10, b11, n11, r11},
                              { p10, p11, p12, p13, p14, p15, p16, p17},
                              {null,null,null,null,null,null,null,null},
                              {null,null,null,null,null,null,null,null},
                              {null,null,null,null,null,null,null,null},
                              {null,null,null,null,null,null,null,null},
                              { p00, p01, p02, p03, p04, p05, p06, p07},
                              { r00, n00, b00, q00, k00, b01, n01, r01}};
    }
    
    public Piece[][] copy() {
    
        Piece[][] plateCopy = new Piece[8][8];

        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 8; j++) {
    
                plateCopy[i][j] = plate[i][j];
            }
        }
        return plateCopy;
    }
    
    public Piece[][] getPlate() {
        
        return plate;
    }
}