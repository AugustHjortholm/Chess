public interface GameControllerInterface{
    void runGame();
    void printBoard(Board board);
    String getActivePlayerName(); //if the players aren't able to set a custom name, then "player 1" or "player 2" will be returned

}
