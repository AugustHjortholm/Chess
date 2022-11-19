public class Knight extends ChessPiece{
    public Knight(String color) {
        super(color);
        moves = 2;
    }
    @Override
    public String getPieceType(){
        return "Knight";
    }
}
