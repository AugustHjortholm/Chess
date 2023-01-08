public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
        // if ("Turncounter" = 1 ) moves = 2;
        moves = 2;

    }
    @Override
    public String[] getLegalMove() {
        return new String[]{"Forward"};
    }
    @Override
    public String getPieceType(){
        return "Pawn";
    }



    }

