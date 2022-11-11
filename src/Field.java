public class Field implements FieldInterface {
    // TODO
    @Override
    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    public ChessPiece chessPiece;


    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }

    @Override
    public boolean isEmpty() {
        if (chessPiece == null){return true;}
        return false;
    }

    public String convertChessPieceToString() {
        if (getChessPiece() == null){
            return "  ";
        }

        if (chessPiece.getColor().equals("White")) {
            if (getChessPiece().getPieceType().equals("King")) {
                return "Lk";
            }
            if (getChessPiece().getPieceType().equals("Rook")) {
                return "LR";
            }
            if (getChessPiece().getPieceType().equals("Pawn")) {
                return "LP";
            }
            if (getChessPiece().getPieceType().equals("Knight")) {
                return "LH";
            }
            if (getChessPiece().getPieceType().equals("Queen")) {
                return "LQ";
            }
            if (getChessPiece().getPieceType().equals("Bishop")) {
                return "LB";
            }
        }

        if (chessPiece.getColor().equals("Black")) {
            getChessPiece().returnPieceType();
            if (getChessPiece().getPieceType().equals("King")) {
                return "DK";
            }
            if (getChessPiece().getPieceType().equals("Rook")) {
                return "DR";
            }
            if (getChessPiece().getPieceType().equals("Pawn")) {
                return "DP";
            }
            if (getChessPiece().getPieceType().equals("Knight")) {
                return "DH";
            }
            if (getChessPiece().getPieceType().equals("Queen")) {
                return "DQ";
            }
            if (getChessPiece().getPieceType().equals("Bishop")) {
                return "DB";
            }
        }
        return "  ";

    }
}







