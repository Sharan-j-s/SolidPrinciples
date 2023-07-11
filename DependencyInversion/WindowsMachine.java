package DependencyInversion;

public class WindowsMachine {
	public final keyboard;
	public final monitor;
	
	public WindowsMachine() {
		monitor = new monitor(); // instance of monitor class
		keyboard = new keyboard(); // instance of keyboard class
	}
}

/* The principle states that we must use abstraction (abstract classes and interfaces)
 * instead of concrete implementations. High-level modules should not depend on the low-level module but both 
 * should depend on the abstraction. Because the abstraction does not depend on detail but the detail
 * depends on abstraction.
 * 
 * It is worth, if we have not keyboard and mouse to work on Windows. To solve the problem,
 * we create a constructor of the class and add the instances of the keyboard and monitor.
 * After adding the instances, the class looks like above code written.
 * 
 * Now we can work on the Windows machine with the help of a keyboard and mouse. but we still face the problem.
 * Because we have tightly coupled the three classes together by using the new keyword. 
 * It is hard to test the class windows machine.
 * 
 * To make the code loosely coupled, we decouple the WindowsMachine from the keyboard by using the
 * Keyboard interface and this keyword. Please check DependencyInversionSolution package.
 */
