package william.txtgame;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**Represents an item in the game with various attributes such as names, weight, dimensions, and properties.
 * @author William
 */
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] names;
    private int weight;
    private int width; 
    private int height;
    private ItemProperty[] properties;

    /**
     * Constructs a new Item with the specified attributes.
     *
     * @param names      the names or aliases of the item
     * @param weight     the weight of the item
     * @param width      the width of the item
     * @param height     the height of the item
     * @param properties the properties of the item
     */
    protected Item(String[] names, int weight, int width, int height, ItemProperty[] properties) {
        this.names = names;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.properties = properties;
    }

    /**
     * Gets the width of the item.
     *
     * @return the width of the item
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width of the item.
     *
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets the height of the item.
     *
     * @return the height of the item
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the item.
     *
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the properties of the item.
     *
     * @return an array of properties associated with the item
     */
    public ItemProperty[] getProperties() {
        return properties;
    }

    /**
     * Sets the properties of the item.
     *
     * @param properties the properties to set
     */
    public void setProperties(ItemProperty[] properties) {
        this.properties = properties;
    }

    /**
     * Gets the names or aliases of the item.
     *
     * @return an array of names
     */
    public String[] getNames() {
        return names;
    }

    /**
     * Sets the names or aliases of the item.
     *
     * @param names the names to set
     */
    public void setNames(String[] names) {
        this.names = names;
    }

    /**
     * Gets the weight of the item.
     *
     * @return the weight of the item
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the item.
     *
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Creates a new ItemBuilder instance for building Item objects.
     *
     * @return a new ItemBuilder instance
     */
    public static ItemBuilder getBuilder() {
        return new ItemBuilder();
    }

    /**
     * Builder class for constructing Item objects.
     */
    public static class ItemBuilder {
        private List<String> names = new ArrayList<>();
        private int weight;
        private int width;
        private int height;
        private List<ItemProperty> properties = new ArrayList<>();
        
        /**Just your standard run-of-the-mill empty protected contructor.
         * @author William
         */
        protected ItemBuilder() {}

        /**
         * Adds a name or alias to the item.
         *
         * @param name the name or alias to add
         * @return the current ItemBuilder instance
         */
        public ItemBuilder name(String name) {
            this.names.add(name);
            return this;
        }

        /**
         * Sets the weight of the item.
         *
         * @param weight the weight to set
         * @return the current ItemBuilder instance
         */
        public ItemBuilder weight(int weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Sets the dimensions of the item.
         *
         * @param width  the width to set
         * @param height the height to set
         * @return the current ItemBuilder instance
         */
        public ItemBuilder dimensions(int width, int height) {
            this.width = width;
            this.height = height;
            return this;
        }

        /**
         * Adds a property to the item.
         *
         * @param property the property to add
         * @return the current ItemBuilder instance
         */
        public ItemBuilder property(ItemProperty property) {
            this.properties.add(property);
            return this;
        }

        /**
         * Builds and returns a new Item instance based on the provided attributes.
         *
         * @return a new Item instance
         */
        public Item build() {
            return new Item(
                names.toArray(new String[0]),
                weight,
                width,
                height,
                properties.toArray(new ItemProperty[0])
            );
        }
    }
}
