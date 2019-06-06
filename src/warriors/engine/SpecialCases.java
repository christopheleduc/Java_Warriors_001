package warriors.engine;

import warriors.contracts.GameItem;

public class SpecialCases {

    /**
	 * Attributs.
	 */

     private int vie;
     private int attck;
     private int pos;

    /**
	 * Constructeur par defaut.
	 */
    public SpecialCases() {
        this(0, 0, 0) ;
    }

    /**
	 * Constructeurs avec paramètres.
	 */
    public SpecialCases(int pos) {
        this(pos, 0, 0) ;
    }

    public SpecialCases(int pos, int vie, int attck) {
        this.setPos(pos) ;
        this.setVie(vie) ;
        this.setAttck(attck) ;
    }
    
    /**
	 * Accesseurs.
	 */
    public int getPos() {
        return this.pos ;
    }

    public void setPos(int pos) {
        this.pos = pos ;
    }

    public int getVie() {
        return this.vie ;
    }

    public void setVie(int vie) {
        this.vie = vie ;
    }

    public int getAttck() {
        return this.attck ;
    }

    public void setAttck(int attck) {
        this.attck = attck ;
    }
     
    /**
	 * Méthodes.
	 */
    public void IsDragonCase (int des) {
        GameItem parameters = GameItem.DRAGONS; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesDrag()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsSorcierCase (int des) {
        GameItem parameters = GameItem.SORCIERS; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesSorc()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsGobelinCase (int des) {
        GameItem parameters = GameItem.GOBELINS; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesGob()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsArcCase (int des) {
        GameItem parameters = GameItem.ARCS; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesArc()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsMassueCase (int des) {
        GameItem parameters = GameItem.MASSUES; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesMass()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsEpeeCase (int des) {
        GameItem parameters = GameItem.EPEES; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesEpee()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsSortECase (int des) {
        GameItem parameters = GameItem.SORTS_ECLAIR; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesSortE()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsSortFCase (int des) {
        GameItem parameters = GameItem.SORTS_FIRE; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesSortF()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsPostionLCase (int des) {
        GameItem parameters = GameItem.POTION_LOW; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesPotionMin()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsPostionNCase (int des) {
        GameItem parameters = GameItem.POTION_NORM; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesPotionNorm()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }

    public void IsPostionHCase (int des) {
        GameItem parameters = GameItem.POTION_HIGH; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesPotionHigh()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
            }
        }
    }
    

}





