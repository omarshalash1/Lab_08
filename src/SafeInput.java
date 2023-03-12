import java.util.Scanner;

/**
 *
 * @author Tom.Wulf@uc.edu
 */
public class SafeInput 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for(int x = 1; x <= 12; x++)
        {
            System.out.printf("%5d%7d\n", x, squareIt(x));
        }
    }
    /**
     * Returns the square of the operand
     * @param base the number to square
     * @return the squared value
     */
    private static int squareIt(int base)
    {
        return base * base;
    }
	public String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void prettyHeader(String message) {
		// TODO Auto-generated method stub
		
	}
	public static String getNonZeroLenString(Scanner in, String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
