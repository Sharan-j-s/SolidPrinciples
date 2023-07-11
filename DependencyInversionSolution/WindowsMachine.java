package DependencyInversionSolution;

public class WindowsMachine {
	private final Keyboard keyboard;
	private final Monitor monitor;
	
	public WindowsMachine(Keyboard keyboard, Monitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
}

/* In the above code, we have used the dependency injection to add the keyboard dependency in the
 * WindowsMachine class. Therefore, we have decoupled the classes.
 */
