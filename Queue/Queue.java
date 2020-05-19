/**
 * 
 * Diese Klasse ist die genaue Umsetzung des Konzeptes *Queue*.
 * Das wurde mithilfe von Arrays gemacht (*objs* Attribute).
 * Auch wurden die häufigste Funktionen für diese Dathenstruktur
 * umgesetzt: push und pop.
 *
 * Esteban Castillo 
 * 14.05.2020
 */

public class Queue
{
    // Umsetzung intern mit Array...
    Object[] objs;
    // Anzahl der Elemente, die sich gerade in der Queue befinden
    int numElements;
    // Groesse des Arrays
    int maxNumElements;

    // Zeiger auf erstes bzw. letztes Element - start ist das aelteste Element
    int start, end;

    public static int counter = 0;

    public Queue()
    {
        numElements = 0;
        start = 0;
        end = 0;
        maxNumElements = 10;
        objs = new Object[maxNumElements];
    }

    /**
     * Schiebt ein neues Element in die Queue
     */
    public void push(Object obj)
    {
        if(numElements == maxNumElements)
        {
            increaseArraysize();
        }

        numElements++;
        objs[end++] = obj;

        if(end == maxNumElements)
        {
            end = 0;
        }
    }

    /**
     * Holt das aelteste Element aus der Queue und liefert es zurueck, oder 
     * liefert null, wenn es keines mehr gibt...
     */
    public Object pop()
    {
        if(numElements > 0 )
        {
            if(start == maxNumElements)
            {
                start = 0;
            }
            numElements--;
            return objs[start++];
        }
        else
        {
            return null;
        }
    }

    /**
     * Hilfsmethode: Wenn das Array volllaeuft, muss ein groesseres angelegt
     * werden, in das die vorhandenen Elemente kopiert werden...
     */
    private void increaseArraysize()
    {
        // ... die Maximalgroesse muss sich aendern...
        int temp = maxNumElements;
        int fillIndex = 0;
        maxNumElements *= 1.5;

        // ... ein neues Array mit mehr Platz ...
        Object[] temps = new Object[maxNumElements];

        // Array kopieren - dabei darauf achten, ob und wie wir schon 
        // mit dem Index von end zum Anfang gesprungen sind.
        if(start < end)
        {
            for(int i = start; i< end; i++)
            {
                temps[fillIndex++] = objs[i];   
            }
        }
        else
        {
            for(int i = start; i< temp; i++)
            {
                temps[fillIndex++] = objs[i];   
            }
            for(int i = 0; i< end; i++)
            {
                temps[fillIndex++] = objs[i];   
            }
        }

        start = 0;
        end = fillIndex;

        // ... Referenz von objs umbiegen
        objs = temps;

	System.out.println("INCREASED! " + temp + " -> " + maxNumElements);
	counter = counter + 1;
    }
}
