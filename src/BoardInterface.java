public interface BoardInterface {
    public ChessPiece[][] getBoardState();
    public boolean isCheck();
    public boolean isCheckMate();
}
