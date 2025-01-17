package william.txtgame;

import java.io.Serializable;

/**
 * Player class representing a player in the game.
 * This class holds the player's health points (HP), magic points (MP),
 * and the maximum values for both HP and MP. It also provides getters and setters
 * for these attributes with logic to ensure that HP and MP do not exceed their maximum values.
 * 
 * @author William
 */
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    // Health points of the player
    private int hp;

    /**
     * Gets the current health points of the player.
     * 
     * @return The player's current health points
     */
    public int getHp() {
        return hp;
    }

    /**
     * Sets the health points of the player.
     * If the value exceeds the maximum HP, it is capped at the max HP.
     * 
     * @param hp The health points to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    // Magic points of the player
    private int mp;

    /**
     * Gets the current magic points of the player.
     * 
     * @return The player's current magic points
     */
    public int getMp() {
        return mp;
    }

    /**
     * Sets the magic points of the player.
     * If the value exceeds the maximum MP, it is capped at the max MP.
     * 
     * @param mp The magic points to set
     */
    public void setMp(int mp) {
        this.mp = mp;
    }

    // Maximum health points the player can have
    private int maxHp;

    /**
     * Gets the maximum health points the player can have.
     * 
     * @return The player's maximum health points
     */
    public int getMaxHp() {
        return maxHp;
    }

    /**
     * Sets the maximum health points for the player.
     * If the player's current HP exceeds the new max HP, the HP is set to the new max.
     * 
     * @param maxHp The maximum health points to set
     */
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
        if (hp > this.maxHp) {
            hp = this.maxHp;
        }
    }

    // Maximum magic points the player can have
    private int maxMp;

    /**
     * Gets the maximum magic points the player can have.
     * 
     * @return The player's maximum magic points
     */
    public int getMaxMp() {
        return maxMp;
    }

    /**
     * Sets the maximum magic points for the player.
     * If the player's current MP exceeds the new max MP, the MP is set to the new max.
     * 
     * @param maxMp The maximum magic points to set
     */
    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
        if (mp > this.maxMp) {
            mp = this.maxMp;
        }
    }
}
