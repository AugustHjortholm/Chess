public class King extends ChessPiece{
    public King(String color) {
        super(color);
        moves = 1;
    }
    @Override
    public String getPieceType(){
        return "King";
    }
}
