package warriors.engine;

import java.util.Random;
import warriors.contracts.Hero;

public class Heros implements Hero {

    
    private int min = 5;
    private int max = 10;
    private Random r = new Random();
    private String name;
    private String image;
    private int life;
    private int attackLevel;
    private String warrior = ("Guerrier");
    private String magician = ("Magicien");
    
    
    /**
	 * Constructeurs.
	 */
    
    public Heros() {
        this("Conan", "conan.png");

        //this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    public Heros(String name, String image) {
        this(name, image, 0, 0);

        //this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    public Heros(String name, String image, int life, int attackLevel) {
        this.setName(name) ;
        this.setImage(image) ;
        this.setLife(r.nextInt(max - min + 1) + min) ;
        this.setAttackLevel(r.nextInt(max - min + 1) + min) ;

        //this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    /**
	 * Méthodes bind from the Hero interface.
     * and Map interface for "getName()".
	 */
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    @Override
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image ;
    }

    @Override
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life ;
    }

    @Override
    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel ;
    }

}