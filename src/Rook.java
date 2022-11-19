public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
        moves = 8;
    }
    @Override
    public String getPieceType(){
        return "Rook";
    }
}
