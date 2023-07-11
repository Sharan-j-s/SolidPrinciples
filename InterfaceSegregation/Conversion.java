package InterfaceSegregation;

public interface Conversion { //bad coding practice
	
	public void intToDouble();
	public void intToChar();
	public void charToString();
}

/* The principle states that the larger interfaces split into smaller ones. Because the implementation
 * classes use only the methods that required. We should not force the client to use the methods that
 * they do not want to use.
 * 
 * The above interface has 3 methods. If we want to use only a method intToChar(), we have no choice
 * to implement the single method. To overcome the problem, the principle allows us to split the interface
 * into three seperate ones.
 */

public interface ConvertIntToDouble{ // good coding practice
	public void intToDouble();
}

public interface ConvertIntToChar{
	public void intToChar();
}

public interface ConvertCharToString{
	public void charToString();
}

/* Now we can use only the methods that is required. Suppose, we want to convert the integer to double 
 * and character to string then, we will use only the methods intToDouble() and charToString().
 * Check DataTypeConversion class in this package.
 */
 
