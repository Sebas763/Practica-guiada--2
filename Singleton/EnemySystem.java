public class EnemySystem {
    private GameConfig config;
    
    public EnemySystem() {
        config = GameConfig.getInstance();
    }

    public void mostrar(){
        System.out.println("Enemy Speed: " + config.getEnemySpeed());
    }  
}
