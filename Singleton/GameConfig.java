public class GameConfig{
    public static GameConfig instance;
    private int difficulty;
    private int lives;
    private int enemySpeed;

    private GameConfig() {
        this.difficulty = 2;
        this.lives = 5;
        this.enemySpeed = 50;
    }

    public static GameConfig getInstance() {
        if(instance == null){
            instance = new GameConfig();
        }
        return instance;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getEnemySpeed() {
        return enemySpeed;
    }

    public void setEnemySpeed(int enemySpeed) {
        this.enemySpeed = enemySpeed;
    }

    @Override
    public String toString() {
        return "GameConfig [difficulty=" + difficulty + ", lives=" + lives + ", enemySpeed=" + enemySpeed + "]";
    }
}
