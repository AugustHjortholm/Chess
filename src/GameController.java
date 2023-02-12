public class GameController implements GameControllerInterface{
    public void runGame(){
        //code goes here

    }
// TODO
    @Override
    public void printBoard(Board board) {

        System.out.println("   _______________________________________ ");
        System.out.println("H | "+board.getBoardState()[0][0].convertChessPieceToString()+" | "+board.getBoardState()[1][0].convertChessPieceToString()+" | "+board.getBoardState()[2][0].convertChessPieceToString()+" | "+board.getBoardState()[3][0].convertChessPieceToString()+" | "+board.getBoardState()[4][0].convertChessPieceToString()+" | "+board.getBoardState()[5][0].convertChessPieceToString()+" | "+board.getBoardState()[6][0].convertChessPieceToString()+" | "+board.getBoardState()[7][0].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("G | "+board.getBoardState()[0][1].convertChessPieceToString()+" | "+board.getBoardState()[1][1].convertChessPieceToString()+" | "+board.getBoardState()[2][1].convertChessPieceToString()+" | "+board.getBoardState()[3][1].convertChessPieceToString()+" | "+board.getBoardState()[4][1].convertChessPieceToString()+" | "+board.getBoardState()[5][1].convertChessPieceToString()+" | "+board.getBoardState()[6][1].convertChessPieceToString()+" | "+board.getBoardState()[7][1].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("F | "+board.getBoardState()[0][2].convertChessPieceToString()+" | "+board.getBoardState()[1][2].convertChessPieceToString()+" | "+board.getBoardState()[2][2].convertChessPieceToString()+" | "+board.getBoardState()[3][2].convertChessPieceToString()+" | "+board.getBoardState()[4][2].convertChessPieceToString()+" | "+board.getBoardState()[5][2].convertChessPieceToString()+" | "+board.getBoardState()[6][2].convertChessPieceToString()+" | "+board.getBoardState()[7][2].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("E | "+board.getBoardState()[0][3].convertChessPieceToString()+" | "+board.getBoardState()[1][3].convertChessPieceToString()+" | "+board.getBoardState()[2][3].convertChessPieceToString()+" | "+board.getBoardState()[3][3].convertChessPieceToString()+" | "+board.getBoardState()[4][3].convertChessPieceToString()+" | "+board.getBoardState()[5][3].convertChessPieceToString()+" | "+board.getBoardState()[6][3].convertChessPieceToString()+" | "+board.getBoardState()[7][3].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("D | "+board.getBoardState()[0][4].convertChessPieceToString()+" | "+board.getBoardState()[1][4].convertChessPieceToString()+" | "+board.getBoardState()[2][4].convertChessPieceToString()+" | "+board.getBoardState()[3][4].convertChessPieceToString()+" | "+board.getBoardState()[4][4].convertChessPieceToString()+" | "+board.getBoardState()[5][4].convertChessPieceToString()+" | "+board.getBoardState()[6][4].convertChessPieceToString()+" | "+board.getBoardState()[7][4].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("C | "+board.getBoardState()[0][5].convertChessPieceToString()+" | "+board.getBoardState()[1][5].convertChessPieceToString()+" | "+board.getBoardState()[2][5].convertChessPieceToString()+" | "+board.getBoardState()[3][5].convertChessPieceToString()+" | "+board.getBoardState()[4][5].convertChessPieceToString()+" | "+board.getBoardState()[5][5].convertChessPieceToString()+" | "+board.getBoardState()[6][5].convertChessPieceToString()+" | "+board.getBoardState()[7][5].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("B | "+board.getBoardState()[0][6].convertChessPieceToString()+" | "+board.getBoardState()[1][6].convertChessPieceToString()+" | "+board.getBoardState()[2][6].convertChessPieceToString()+" | "+board.getBoardState()[3][6].convertChessPieceToString()+" | "+board.getBoardState()[4][6].convertChessPieceToString()+" | "+board.getBoardState()[5][6].convertChessPieceToString()+" | "+board.getBoardState()[6][6].convertChessPieceToString()+" | "+board.getBoardState()[7][6].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("A | "+board.getBoardState()[0][7].convertChessPieceToString()+" | "+board.getBoardState()[1][7].convertChessPieceToString()+" | "+board.getBoardState()[2][7].convertChessPieceToString()+" | "+board.getBoardState()[3][7].convertChessPieceToString()+" | "+board.getBoardState()[4][7].convertChessPieceToString()+" | "+board.getBoardState()[5][7].convertChessPieceToString()+" | "+board.getBoardState()[6][7].convertChessPieceToString()+" | "+board.getBoardState()[7][7].convertChessPieceToString()+" |");
        System.out.println("  |____|____|____|____|____|____|____|____|");
        System.out.println("     1    2    3    4    5    6    7    8  ");




    }
    public void testMovement(){
        Board board = new Board();
        printBoard(board);
        board.moveCheck(1, 1, 1, Board.Directions.Forward);
        printBoard(board);
        board.moveCheck(1, 1, 2, Board.Directions.Forward);
        printBoard(board);
        board.moveCheck(1, 1, 3, Board.Directions.Forward);

    }

    @Override
    public String getActivePlayerName() {
        return null;
    }
}
