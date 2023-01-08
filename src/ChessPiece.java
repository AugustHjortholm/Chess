public class ChessPiece implements ChessPieceInterface{

String color;
int moves;
    public ChessPiece(String color){
        this.color = color;

    }

    public String getColor(){
        return color;
    }


    public ChessPiece returnPieceType() {
        return null;
    }
    public String[] getLegalMove() {
       return null ;
    }

    public String getPieceType() {
        return null;
    }
    public int getMoves(){
        return moves;

    }
}

