public class Bishop extends ChessPiece{
    public Bishop(String color) {
        super(color);
        moves = 8;
    }
    @Override
    public String getPieceType(){
        return "Bishop";
    }
}
