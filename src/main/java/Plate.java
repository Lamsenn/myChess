public class Plate {

    private static Piece[][] plate;
    private int height;
    private int width;

    public Plate(Player player0, Player player1) {
        
        Piece p00 = new Pawn(player0);
        Piece p01 = new Pawn(player0);
        Piece p02 = new Pawn(player0);
        Piece p03 = new Pawn(player0);
        Piece p04 = new Pawn(player0);
        Piece p05 = new Pawn(player0);
        Piece p06 = new Pawn(player0);
        Piece p07 = new Pawn(player0);
        Piece r00 = new Rook(player0);
        Piece r01 = new Rook(player0);
        Piece n00 = new Knight(player0);
        Piece n01 = new Knight(player0);
        Piece b00 = new Bishop(player0);
        Piece b01 = new Bishop(player0);
        Piece q00 = new Queen(player0);
        Piece k00 = new King(player0);

        Piece p10 = new Pawn(player1);
        Piece p11 = new Pawn(player1);
        Piece p12 = new Pawn(player1);
        Piece p13 = new Pawn(player1);
        Piece p14 = new Pawn(player1);
        Piece p15 = new Pawn(player1);
        Piece p16 = new Pawn(player1);
        Piece p17 = new Pawn(player1);
        Piece r10 = new Rook(player1);
        Piece r11 = new Rook(player1);
        Piece n10 = new Knight(player1);
        Piece n11 = new Knight(player1);
        Piece b10 = new Bishop(player1);
        Piece b11 = new Bishop(player1);
        Piece q10 = new Queen(player1);
        Piece k10 = new King(player1);
    
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

        for (int x = 0; x < 8; x++) {

            System.arraycopy(plate[x], 0, plateCopy[x], 0, 8);
        }
        return plateCopy;
    }
    
    public static Piece[][] getPlate() {
        
        return plate;
    }
    
    public static void setPlate(Piece piece, int[] from, int[] to) {
        
        int x = from[0];
        int y = from[1];
        
        plate[x][y] = null;
        
        x = to[0];
        y = to[1];
        
        plate[x][y] = piece;
    }
}