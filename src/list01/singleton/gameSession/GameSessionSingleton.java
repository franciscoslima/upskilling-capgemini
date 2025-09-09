package list01.singleton.gameSession;

public class GameSessionSingleton {

    private static GameSessionSingleton instance;
    private int points = 0;
    private int level = 1;
    private int lives = 1;

    private GameSessionSingleton(){}

    public static synchronized GameSessionSingleton getInstance(){
        if(instance == null)
            instance= new GameSessionSingleton();
        return instance;
    }

    @Override
    public String toString() {
        return "GameSessionSingleton{" +
                "points=" + points +
                ", level=" + level +
                ", lives=" + lives +
                '}';
    }

    public synchronized void getActualState(){
        System.out.println(this);;
    }

    public synchronized void updateState(int points, int level, int lives){
        this.points = points;
        this.level = level;
        this.lives = lives;
    }

    public static synchronized void resetInstance(){
        instance = null;
    }
}
