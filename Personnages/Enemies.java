package Personnages;



public interface Enemies {

    private int id; //=matricule
    private int power; //résistance aux tirs
    private String description; //pour le différencier à l'écran
    private int health; //vie
    private int speed;//vitesse du perso
    private static ArrayList<Coordinate> path;

    public void move(){...}

    public void looseHealth(int amount) {
        if (health > 0) {
            health -= amount;
        }
    }
}
