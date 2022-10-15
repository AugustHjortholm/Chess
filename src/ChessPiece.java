public class ChessPiece implements ChessPieceInterface{
String color;
    public ChessPiece(String color){
        this.color = color;

    }

    public String getColor(){
        return color;
    }

    @Override
    public ChessPiece returnPieceType() {
        return null;
    }

    public String getPieceType() {
        return null;
    }
}

