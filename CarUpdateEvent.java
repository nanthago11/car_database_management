/**
 * A basic event that is sent off to registered listeners
 * @
 *
 * PUBLIC FEATURES:
 * // Constructors
 *    public CarUpdateEvent(Object source)
 *
 * // Methods
 *
 */
public class CarUpdateEvent extends java.util.EventObject
{
	/**
	 * @param source source object of event
	 */
	public CarUpdateEvent(Object source)
	{
		super(source);
	}
}
