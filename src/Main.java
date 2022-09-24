import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.next();
            if(command.equals("PLAY")) {
                GameController gameController = new GameController();
                gameController.runGame();
            }
            else if (command.equals("EXIT")){
                break;
            }
        }
    }
}
