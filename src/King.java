public class King extends ChessPiece{
    public King(String color) {
        super(color);
        moves = 1;
    }
    @Override
    public String[] getLegalMove() {
        return new String[]{"Forward", "Left", "Right", "Backwards", "ForwardsLeft", "ForwardRight", "BackwardsLeft", "BackwardsRight"};
    }
    @Override
    public String getPieceType(){
        return "King";
    }
}
