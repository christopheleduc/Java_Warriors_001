package warriors.engine;

import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;

public class Game implements GameState {

    /**
	 * Attributs.
	 */
    
    private String playerName;
    private String gameId;
    private GameStatus gameStatus;
    private Hero hero;
    private Map map;
    private String lastLog;
    private int currentCase;
    private GameStatus defaut = GameStatus.FINISHED;
    
    /**
	 * Constructeurs.
	 */

    public Game() {
        //this.heroes.add(new Heros("Conan", "conan.png"));
        this("Player_1");
    }

    public Game(String playerName) {
        this(playerName, "1", defaut, "Warrior", 1);

        //this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    public Game(String playerName, String gameId, GameStatus gameStatus, Hero hero, Map map, String lastLog, int currentCase) {
        this.setPlayerName(playerName) ;
        this.setGameId(gameId) ;
        this.setGameStatus(gameStatus) ;
        this.setHero(hero) ;
        this.setMap(map) ;
        this.setLastLog(lastLog) ;
        this.setCurrentCase(currentCase) ;

        //this("Conan", "conan.png", "Guerrier", 0, 0);
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
    
}