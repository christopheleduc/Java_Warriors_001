package warriors.engine;

import java.util.List;
import java.util.ArrayList;

import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;

public class Warriors implements GameState, WarriorsAPI, Hero, Map {

    private ArrayList heroes = new ArrayList<Object>();
    private ArrayList maps = new ArrayList<Object>();
    private String playerName;
    private String gameId;
    private GameStatus gameStatus;
    private Hero hero;
    private Map map;
    private String lastLog;
    private int currentCase;
    //private List<Hero> heroes;
    //private List<Map> maps;
    private int numberOfCase;
    private String name;
    private String image;
    private int life;
    private int attackLevel;

    
    
    public Warriors() {
        this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    public Warriors(String playerName, String image, String hero) {
        this(playerName, image, hero, 0, 0);
    }

    public Warriors(String playerName, String image, String hero, int life, int force) {
        this.setPlayerName(playerName) ;
        this.setImage(image) ;
        this.setHero(hero) ;
        this.setLife(r.nextInt(max - min + 1) + min) ;
        this.setForce(r.nextInt(max - min + 1) + min) ;
    }

    /**
	 * Méthodes bind from the GameState interface.
	 */
    
    @Override
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName ;
    }

    @Override
    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId ;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus ;
    }

    @Override
    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero ;
    }

    @Override
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map ;
    }

    @Override
    public String getLastLog() {
        return lastLog;
    }

    public void setLastLog(String lastLog) {
        this.lastLog = lastLog ;
    }

    @Override
    public int getCurrentCase() {
        return currentCase;
    }

    public void setCurrentCase(int currentCase) {
        this.currentCase = currentCase ;
    }

    /**
	 * Méthodes bind from the WarriorsAPI interface.
	 */
    
    @Override
    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes ;
    }

    @Override
    public List<Map> getMaps() {
        return maps;
    }

    public void setMaps(List<Map> maps) {
        this.maps = maps ;
    }

    @Override
    public GameState createGame(String playerName, Hero hero, Map map) {
        return createGame;
    }

    @Override
    public GameState nextTurn(String gameID) {
        return nextTurn;
    }

    /**
	 * Méthodes bind from the Map interface.
	 */
    
    @Override
    public int getNumberOfCase() {
        return numberOfCase;
    }

    public void setNumberOfCase(int numberOfCase) {
        this.numberOfCase = numberOfCase ;
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