public class Bishop extends ChessPiece{
    public Bishop(String color) {
        super(color);
        moves = 8;
    }
@Override
    public String[] getLegalMove() {
        return new String[]{"ForwardsLeft", "ForwardRight", "BackwardsLeft", "BackwardsRight"};
    }
    @Override
    public String getPieceType(){
        return "Bishop";
    }
}
