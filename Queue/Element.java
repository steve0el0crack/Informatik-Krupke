
/**
 * Der Konstruktor dieser Klasse wird mit zwei Werte gerufen: Ein "integer" (index) und ein "string" (prop).
 * Dann werden diese zwei Variabeln auf zwei andere innere Variabeln umgesetzt: index -> num und prop -> property.
 * Dann gibt es noch die Methode print(), die etwas auf der Console printen wird.
 *
 * Esteban Castillo 
 * 14.05.2020
 */

public class Element
{
    private int num;
    private String property;
    
    public Element(int index, String prop)
    {
        num = index;
        property = prop;
    }
    
    public void print()
    {
        System.out.printf("Element> Number: %5d; Property: " + property + "\n", num);
    }
}
