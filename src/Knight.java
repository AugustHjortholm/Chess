public class Knight extends ChessPiece{
    public Knight(String color) {
        super(color);
        moves = 3;
    }
@Override
    public String[] getLegalMove() {
        return new String[]{"Forward", "Right", "Left", "Backwards"};
    }
    @Override
    public String getPieceType(){
        return "Knight";
    }
}
