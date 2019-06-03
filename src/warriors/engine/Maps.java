package warriors.engine;

// import com.sun.javafx.collections.MappingChange.Map;
import warriors.contracts.Map;

public class Maps implements Map {

    /**
	 * Attributs.
	 */

    private String name;
    private int numberOfCase = 64;


    /**
	 * Méthodes bind from the Map interface.
	 */

    // @Override
    // public Object map(Object original) {
    //     return null;
    // }
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name ;
    }
    
    @Override
    public int getNumberOfCase() {
        return numberOfCase;
    }

    public void setNumberOfCase(int numberOfCase) {
        this.numberOfCase = numberOfCase ;
    }

}