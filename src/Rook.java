public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
        moves = 8;
    }
    @Override
    public String[] getLegalMove() {
        return new String[]{"Forward", "Left", "Right", "Backwards"};
    }
    @Override
    public String getPieceType(){
        return "Rook";
    }
}
