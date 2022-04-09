import java.util.ArrayList;

public class Plate {

    public static Piece	p00, p01, p02, p03, p04, p05, p06, p07, r00, r01, n00, n01, b00, b01, q00, k00;
    public static Piece	p10, p11, p12, p13, p14, p15, p16, p17, r10, r11, n10, n11, b10, b11, q10, k10;
    public static Piece[][] plate;

    public Plate(Player player0, Player player1) {
    
        p00 = new Pawn(player0);
        p01 = new Pawn(player0);
        p02 = new Pawn(player0);
        p03 = new Pawn(player0);
        p04 = new Pawn(player0);
        p05 = new Pawn(player0);
        p06 = new Pawn(player0);
        p07 = new Pawn(player0);
        r00 = new Rook(player0);
        r01 = new Rook(player0);
        n00 = new Knight(player0);
        n01 = new Knight(player0);
        b00 = new Bishop(player0);
        b01 = new Bishop(player0);
        q00 = new Queen(player0);
        k00 = new King(player0);

        p10 = new Pawn(player1);
        p11 = new Pawn(player1);
        p12 = new Pawn(player1);
        p13 = new Pawn(player1);
        p14 = new Pawn(player1);
        p15 = new Pawn(player1);
        p16 = new Pawn(player1);
        p17 = new Pawn(player1);
        r10 = new Rook(player1);
        r11 = new Rook(player1);
        n10 = new Knight(player1);
        n11 = new Knight(player1);
        b10 = new Bishop(player1);
        b11 = new Bishop(player1);
        q10 = new Queen(player1);
        k10 = new King(player1);
    
        plate = new Piece[][]{{ r10, n10, b10, q10, k10, b11, n11, r11},
                              { p10, p11, p12, p13, p14, p15, p16, p17},
                              {null,null,null,null,null,null,null,null},
                              {null,null,null,null,null,null,null,null},
                              {null,null,null,null,null,null,null,null},
                              {null,null,null,null,null,null,null,null},
                              { p00, p01, p02, p03, p04, p05, p06, p07},
                              { r00, n00, b00, q00, k00, b01, n01, r01}};
    }

    public int[] find(Piece piece) {

        for (int x = 0; x < plate.length; x++) {

            for (int y = 0; y < plate.length; y++) {

                if (plate[x][y] == piece) return new int[]{x,y};
            }
        }
        return null;
    }
    
    public Piece[][] copy() {
    
        Piece[][] plateCopy = new Piece[8][8];

        for (int x = 0; x < 8; x++) {

            System.arraycopy(plate[x], 0, plateCopy[x], 0, 8);
        }
        return plateCopy;
    }
    
    public Piece[][] getPlate() {
        
        return plate;
    }
}