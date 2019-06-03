package warriors.engine;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;

public class Warriors implements WarriorsAPI {

    /**
	 * Attributs.
	 */
    
    private ArrayList heroes = new ArrayList<Hero>();
    private ArrayList maps = new ArrayList<Map>();

    
    /**
	 * Constructeurs.
	 */
    
    public Warriors() {
        this.heroes.add(new Heros("Conan", "conan.png"));
        //this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    public Warriors(String name) {
        this.heroes.add(new Heros(name, "conan.png"));
        //this(playerName, hero, 0, 0);
    }

    public Warriors(String name, String image, int life, int AttackLevel) {
        this.heroes.add(new Heros(name, image, life, AttackLevel));
        //heroes.add(warrior) ;
        //heroes.add(magician) ;
        // this.setPlayerName(playerName) ;
        // this.heroes.setImage(image) ;
        // this.setHero(hero) ;
        // this.setLife(r.nextInt(max - min + 1) + min) ;
        // this.heroes.setAttackLevel(r.nextInt(max - min + 1) + min) ;
    }

    /**
	 * Méthodes bind from the WarriorsAPI interface.
	 */
    
    @Override
    public List<Hero> getHeroes() {
        return heroes ;
    }

    public void setHeroes(List<Hero> heroes) {
        //this.heroes = heroes.add(heroes) ;
        //this.heroes = heroes ;
    }

    @Override
    public List<Map> getMaps() {
        return maps;
    }

    // public void setMaps(List<Map> maps) {
    //     this.maps = maps ;
    // }

    @Override
    public GameState createGame(String playerName, Hero hero, Map map) {
        this.playerName = playerName ;
        this.hero = GameState.add(hero) ;
        this.map = GameState.add(map) ;
        return GameState;
    }

    @Override
    public GameState nextTurn(String gameID) {
        return nextTurn;
    }
    
}