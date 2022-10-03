public class Field implements FieldInterface{
    // TODO
    @Override
    public ChessPiece getChessPiece() {
        return null;
    }
    public ChessPiece chessPiece;


    public void setChessPiece(ChessPiece chessPiece){
        this.chessPiece = chessPiece;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
