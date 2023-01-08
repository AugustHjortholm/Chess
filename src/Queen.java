public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
        moves = 8;
    }
    @Override
    public String[] getLegalMove() {
        return new String[]{"Forward", "Left", "Right", "Backwards", "ForwardsLeft", "ForwardRight", "BackwardsLeft", "BackwardsRight"};
    }
    @Override
    public String getPieceType(){
        return "Queen";
    }
}
