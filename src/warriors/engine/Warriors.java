package warriors.engine;

import java.util.List;
import java.util.ArrayList;

import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;

public class Warriors implements GameState, WarriorsAPI, Hero, Map {

    private ArrayList list = new ArrayList<Object>();
    private String playerName;
    private String image;
    private String hero;
    private String gameId;
    
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

    @Override
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName ;
    }

    @Override
    public String getGameId() {
        return null;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId ;
    }

    @Override
    public GameStatus getGameStatus() {
        return null;
    }

    @Override
    public Hero getHero() {
        return hero;
    }

    @Override
    public Map getMap() {
        return null;
    }

    @Override
    public String getLastLog() {
        return null;
    }

    @Override
    public int getCurrentCase() {
        return 0;
    }

    @Override
    public List<Hero> getHeroes() {
        return null;
    }

    @Override
    public List<Map> getMaps() {
        return null;
    }

    @Override
    public GameState createGame(String playerName, Hero hero, Map map) {
        return null;
    }

    @Override
    public GameState nextTurn(String gameID) {
        return null;
    }

    @Override
    public int getNumberOfCase() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getImage() {
        return null;
    }

    public void setImage(String image) {
        this.image = image ;
    }

    @Override
    public int getLife() {
        return 0;
    }

    @Override
    public int getAttackLevel() {
        return 0;
    }
    
}