public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
       moves = 2;

    }
    @Override
    public String getPieceType(){
        return "Pawn";
    }



    }

