package william.txtgame;

import java.io.Serializable;

/**Contains the target for the room and the entrance that gets in the way
 * @author William
 */
public class Connection implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Room target;
	Entrance entrance;
}
