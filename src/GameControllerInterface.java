public interface GameControllerInterface{
    public void runGame();
    public void printBoard(BoardInterface board);
    public String getActivePlayerName(); //if the players aren't able to set a custom name, then "player 1" or "player 2" will be returned

}
