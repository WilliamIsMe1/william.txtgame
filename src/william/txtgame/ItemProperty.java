package william.txtgame;

@SuppressWarnings("javadoc")
/**This enum stores properties for items in order to allow certain behaviors to be generalized.
 * @author William
 */
public enum ItemProperty {
	/**This is for when you have a glowing item.
     * Items with this property ward away grue.
     */
	GLOWING,
	/**This is for frozen items
	 * I'm not sure what they do yet; I used ChatGPT to make these cause I was tired, and got rid of the dumb ones
     * I'm not sure if I got rid of all the dumb ones.
	 */
	FROZEN,
	FRAGILE,
	SHARP,
	HEAVY,
	LIGHT,
	TOXIC,
	MAGICAL,
	CORRODED,
	VALUABLE,
	EDIBLE,
	EXPLOSIVE,
	FLAMMABLE,
	REPAIRABLE,
	WATERPROOF,
	UNIQUE,
	CURSED
}
