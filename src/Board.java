public class Board implements BoardInterface{
    Field[][] board = new Field[8][8];
    public Board() {
        board[0][0].setChessPiece(new Rook("White"));
        board[1][0].setChessPiece(new Knight("White"));
        board[2][0].setChessPiece(new Bishop("White"));
        board[3][0].setChessPiece(new Queen("White"));
        board[4][0].setChessPiece(new King("White"));
        board[5][0].setChessPiece(new Bishop("White"));
        board[6][0].setChessPiece(new Knight("White"));
        board[7][0].setChessPiece(new Rook("White"));

        board[0][1].setChessPiece(new Pawn("White"));
        board[1][1].setChessPiece(new Pawn("White"));
        board[2][1].setChessPiece(new Pawn("White"));
        board[3][1].setChessPiece(new Pawn("White"));
        board[4][1].setChessPiece(new Pawn("White"));
        board[5][1].setChessPiece(new Pawn("White"));
        board[6][1].setChessPiece(new Pawn("White"));
        board[7][1].setChessPiece(new Pawn ("White"));

        board[0][7].setChessPiece(new Rook("Black"));
        board[1][7].setChessPiece(new Knight("Black"));
        board[2][7].setChessPiece(new Bishop("Black"));
        board[3][7].setChessPiece(new Queen("Black"));
        board[4][7].setChessPiece(new King("Black"));
        board[5][7].setChessPiece(new Bishop("Black"));
        board[6][7].setChessPiece(new Knight("Black"));
        board[7][7].setChessPiece(new Rook("Black"));

        board[0][6].setChessPiece(new Pawn("Black"));
        board[1][6].setChessPiece(new Pawn("Black"));
        board[2][6].setChessPiece(new Pawn("Black"));
        board[3][6].setChessPiece(new Pawn("Black"));
        board[4][6].setChessPiece(new Pawn("Black"));
        board[5][6].setChessPiece(new Pawn("Black"));
        board[6][6].setChessPiece(new Pawn("Black"));
        board[7][6].setChessPiece(new Pawn ("Black"));

    }
    private void movePiece (int xFrom, int yFrom, int xTo, int yTo){
        ChessPiece hand = board[xFrom][yFrom].getChessPiece();
        board[xFrom][yFrom] = null;
        board[xTo][yTo].setChessPiece(hand);




    }

    // TODO
    @Override
    public Field[][] getBoardState() {
        return new Field[0][];
    }
}
