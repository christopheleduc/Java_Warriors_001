package warriors.engine;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;
import warriors.engine.Game ;

public class Warriors implements WarriorsAPI {

    /**
	 * Attributs.
	 */
    
    private ArrayList<Hero> heroes = new ArrayList<Hero>();
    private ArrayList<Map> maps = new ArrayList<Map>();
    //private ArrayList<GameState> gameStatList = new ArrayList<GameState>();
    private HashMap<String, GameState> gameStatList = new HashMap<String, GameState>();
    //private gameStatList = new gameStatList();

    
    /**
	 * Constructeur par defaut.
	 */
    
    public Warriors() {
        // Création d'une liste de heros
        this.heroes.add(new Heros("Conan", "conan.png"));
        this.heroes.add(new Heros("Gandalf", "gandalf.png"));
        // Création d'une liste de map
        this.maps.add(new Maps("Mordor", 64));
        this.maps.add(new Maps("Terre du milieu", 64));
        this.maps.add(new Maps("NeverLand", 64));
    }

    /**
	 * Constructeurs avec paramètres.
	 */

    public Warriors(String name) {
        this.heroes.add(new Heros(name, "conan.png"));
        this.maps.add(new Maps("Mordor", 64));
        this.maps.add(new Maps("Terre du milieu", 64));
        this.maps.add(new Maps("NeverLand", 64));
    }

    public Warriors(String name, String image, int life, int AttackLevel, String nameMap, int numberOfCase) {
        this.heroes.add(new Heros(name, image, life, AttackLevel));
        this.maps.add(new Maps(nameMap, numberOfCase));
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

    // public void setHeroes(List<Hero> heroes) {
    //     this.heroes = heroes new Heros()) ;
    //     //this.heroes = heroes ;
    // }

    @Override
    public List<Map> getMaps() {
        return maps;
    }

    // public void setMaps(List<Map> maps) {
    //     this.maps = maps ;
    // }

    @Override
    public GameState createGame(String playerName, Hero hero, Map map) {

        // Instanciation de la partie
        GameState tour = new Game(playerName, hero, map);

        // Création du GameState
        //gameStatList.add(tour); // Ajout de l'intance de Game (interface GameState) dans la ArayList
        gameStatList.put(tour.getGameId(), tour); // Ajout de l'intance de Game (interface GameState) dans la HasMap
        System.out.println(gameStatList); // DEBUG

        // GameState tour2 = new Game(playerName, hero, map);
        // gameStatList.add(tour); 
        //gameStatList.get(1).getLastLog();
        //tour.getPlayerName(), tour.getGameId(), tour.getGameStatus(), tour.getHero(), tour.getMap(), tour.getLastLog(), tour.getCurrentCase()) ;
        //this.gameStat.add(new Game(playerName, hero, map));
        return tour; // Retourne l'instance de la partie
    }

    @Override
    public GameState nextTurn(String gameID) {
        // lancer les dés
        // recup state par rapport au gameID
        //next = this.Game.getGameId();
        //this.gameID tour.getGameId(gameID);
        // Renvoyer l'etat de la partie
        // gameStatList.get(1).getLastLog();
        System.out.println(gameStatList.get(gameID)); // DEBUG

        return gameStatList.get(gameID);
    }
    
}