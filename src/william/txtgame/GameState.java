package william.txtgame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**GameState object for storing the state of a game.
 * @author William
 * @version alpha-0.1
 * @since alpha-0.1
 */
public class GameState implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	
	/**Writes a GameState object to a file
	 * @author William
	 * @since alpha-0.1
	 * @version alpha-0.1
	 * @param state - Input {@link GameState} object. 
	 * @param filepath - Input {@link String} object referring to file. 
	 */
	public static void writeToFile(GameState state, String filepath) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath))) {
			oos.writeObject(state);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Failure in writing to file." + filepath);
		}
	}
	
	/**Reads from a file to return a GameState object
	 * @author William
	 * @since alpha-0.1
	 * @version alpha-0.1
	 * @param filepath
	 * @return a GameState object 
	 */
	public static GameState readFromFile(String filepath) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objfile.sav"))){
			return (GameState) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Failure in reading from file: " + filepath);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("This does hold an object, but it sure as heck don't actually read as a GameState, stoopid.");
		}
		return null;
	}
	
	/**
	 * Gets the player
	 * @author William
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}
	
	/**Sets the player
	 * @author William
	 * @param player
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	private Player player;
}
