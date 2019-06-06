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
                System.out.println("Avec [ " + parameters.getLife() + " ] de Vie, et [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
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
                System.out.println("Avec [ " + parameters.getLife() + " ] de Vie, et [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
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
                System.out.println("Avec [ " + parameters.getLife() + " ] de Vie, et [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
            }
        }
    }

    public int IsArcCase (int des, int power) {
        GameItem parameters = GameItem.ARCS; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesArc()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
                return (parameters.getAttack() + power) ; // Renvoi le total des points d'attaque'.
            }
        }
        return 0 ; // renvoi 0 !!!
    }

    public int IsMassueCase (int des) {
        GameItem parameters = GameItem.MASSUES; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesMass()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
                return parameters.getAttack() ; // Renvoi les points d'attaque'.
            }
        }
        return 0 ; // renvoi 0 !!!
    }

    public int IsEpeeCase (int des) {
        GameItem parameters = GameItem.EPEES; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesEpee()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
                return parameters.getAttack() ; // Renvoi les points d'attaque'.
            }
        }
        return 0 ; // renvoi 0 !!!
    }

    public int IsSortECase (int des) {
        GameItem parameters = GameItem.SORTS_ECLAIR; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesSortE()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
                return parameters.getAttack() ; // Renvoi les points d'attaque'.
            }
        }
        return 0 ; // renvoi 0 !!!
    }

    public int IsSortFCase (int des) {
        GameItem parameters = GameItem.SORTS_FIRE; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesSortF()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getAttack() + " ] d'attack !"); // Détails.
                return parameters.getAttack() ; // Renvoi les points d'attaque'.
            }
        }
        return 0 ; // renvoi 0 !!!
    }

    public int IsPostionLCase (int des) {
        GameItem parameters = GameItem.POTION_LOW; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesPotionMin()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getLife() + " ] de Vie !"); // Détails.
                return parameters.getLife() ; // Renvoi les points de vie.
            }
        }
        return 0 ; // renvoi 0 !!!
    }

    public int IsPostionNCase (int des) {
        GameItem parameters = GameItem.POTION_NORM; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesPotionNorm()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getLife() + " ] de Vie !"); // Détails.
                return parameters.getLife() ; // Renvoi les points de vie.
            }
        }
        return 0 ; // renvoi 0 !!!
    }

    public int IsPostionHCase (int des) {
        GameItem parameters = GameItem.POTION_HIGH; // Utilise ENUM.
        // Teste si sur une case spécial.
        for (int position : parameters.getCasesPotionHigh()){
            if(position == des) {
                System.out.println("!!! ATTENTION !!!"); // Avertissement.
                System.out.println("Vous etes en présence d'" + parameters.getNom() + " !"); // Description.
                System.out.println("Avec [ " + parameters.getLife() + " ] de Vie !"); // Détails.
                return parameters.getLife() ; // Renvoi les points de vie.
            }
        }
        return 0 ; // renvoi 0 !!!
    }
    

}





