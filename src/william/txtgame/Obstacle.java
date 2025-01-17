package william.txtgame;

import java.io.Serializable;

/**A wrapper class to interface creatures blocking an entrance
 * 
 */
public class Obstacle<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**This is the type of obstacle, stored in an enum
	 * 
	 */
	protected ObstacleType type;
	/** This is the obstacle that is being wrapped up in this generic template class
	 * 
	 */
	protected T obstacle;
	/**
	 * 
	 */
	public enum ObstacleType {
		/**This enum case denotes a door
		 * 
		 */
		DOOR,
		/**
		 * 
		 */
		CREATURE,
		/**
		 * 
		 */
		RUBBLE,
		/**There is no obstacle here
		 * 
		 */
		NONE,
		/**Any miscelanous object
		 * 
		 */
		OBJECT
	}
	/**
	 * @return
	 */
	public ObstacleType getType() {
		return type;
	};
	/**A function to get the obstacle of type T
	 * @return The obstacle object
	 */
	public T getObstacle() {
		if(type == ObstacleType.NONE) {
			return null;
		}
		return obstacle;
	};
}
