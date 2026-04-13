public class PlayerSystem {
    private GameConfig configP;

    public PlayerSystem() {
        configP = GameConfig.getInstance();
    }

    public void mostrar(){
        System.out.println("Lives: " + configP.getLives());
    }  
}
