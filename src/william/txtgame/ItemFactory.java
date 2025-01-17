package william.txtgame;

import java.util.HashMap;

/**
 * 
 */
public class ItemFactory implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Item> itemDictionary = new HashMap<String, Item>();
	private ItemFactory() {}
	
	private static transient ItemFactory instance;
	
	/**Singleton instance retriever
	 * @return a Singleton instance
	 */
	public static ItemFactory getInstance() {
		if (instance == null) {
			instance = new ItemFactory();
		}
		return instance;
	}
	
	/** Allows the GameLoader to load an ItemFactory with a custom dictionary
	 * @param newInstance - The deserialized instance to replace the old instance
	 */
	public static void setInstance(ItemFactory newInstance) {
	    if (newInstance == null) {
	        throw new IllegalArgumentException("New instance cannot be null");
	    }
	    instance = newInstance;
	}
	
	/**
	 * 
	 * @param type
	 * @return an item of the type __type__
	 * @throws ItemNotFoundException
	 */
	public Item getItem(String type) throws ItemNotFoundException {
		Item item = itemDictionary.get(type.toLowerCase());
		if (item == null) {
			throw new ItemNotFoundException();
		}
		return item;
	}
}
