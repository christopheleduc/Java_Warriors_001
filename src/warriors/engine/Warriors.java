package warriors.engine;

import java.util.List;

import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;

public class Warriors implements GameState, WarriorsAPI {

    @Override
    public String getPlayerName() {
        return null;
    }

    @Override
    public String getGameId() {
        return null;
    }

    @Override
    public GameStatus getGameStatus() {
        return null;
    }

    @Override
    public Hero getHero() {
        return null;
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

    
}