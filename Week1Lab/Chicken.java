
/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chicken extends Brid 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Chicken
     */
    public Chicken()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    @Override
    public void cry() {
        System.out.println("Koohoot");
    }
}
