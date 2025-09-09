package list01.singleton.gameSession;

public class App {
    public static void main(String[] args) {
        GameSessionSingleton gameSessionSingleton = GameSessionSingleton.getInstance();

        gameSessionSingleton.getActualState();
        gameSessionSingleton.updateState(10, 02, 03);
        gameSessionSingleton.getActualState();

    }
}
