public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
        moves = 8;
    }
    @Override
    public String getPieceType(){
        return "Queen";
    }
}
