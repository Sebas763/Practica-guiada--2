public class Main {
    public static void main(String[] args) {
        EnemySystem enemy = new EnemySystem();
        enemy.mostrar();
        PlayerSystem player = new PlayerSystem();
        player.mostrar();
        GameConfig config = GameConfig.getInstance();
        System.out.println(config.toString());
    }
}
