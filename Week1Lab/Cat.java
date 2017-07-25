
/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat implements Animal
{
    private String name;
    private int legs;
    public Cat() {
        this.name = "Unknow name cat";
        this.legs = 4;
    }
    public Cat(String name) {
        this.name = name;
        this.legs = 4;
    }
    
    @Override
    public void cry() {
        System.out.println("Myeee");
    }
    
    @Override
    public String toString() {
        return "Cat name: " + name + "\nCat has " + this.legs + " legs";
    }
    
    public static void main(String[] args) {
        System.out.println(new Cat());
    }
}
