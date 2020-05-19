
/**
 * 
 * Diese Klasse wird zum testen benutzt, und es gibt haupsächlich ein Test: Die Methode run()
 * In dieser Methode wird erstmal 10 hoch 6 Elemente in einer Queue hinzugefügt, und danach  
 * eine Menge davon aus der Queue ausziehen, damit es überprüft werden könnte, ob alles in 
 * Ordnung gelaufen ist.
 *
 * Esteban Castillo
 * 23.04.2020
 */

public class TestBed
{
    // static: Klassenvariable, sonst waere es ein Attribut
    // final: kann nicht im Programmablauf geaendert werden - Konstante
    // Schreibweise: haeufig nur Grossbuchstaben...
    public static final int MAX_ELEMENTS = 1000000;

    public void testQueue()
    {
        Queue tq = new Queue();
    }

    public void run()
    {
	//Erstmal und vor allem, den Console sauber zu machen...
	System.out.print('\u000C');
	
	// Erstelle zunaechst genuegend Elemente fuer den Test
        Element[] elements = new Element[MAX_ELEMENTS];

        // ... und initialisiere diese!
        for(int i=0; i< MAX_ELEMENTS; i++)
        {
            elements[i] = new Element(i,"Hugo " + i);
        }

        Queue queue = new Queue();

        // Hier fangen die Laufzeittests an...
        long timerStart = System.currentTimeMillis();
        for(int i = 0; i < MAX_ELEMENTS; i++)
        {
            queue.push(elements[i]);
        }
	long timerStop = System.currentTimeMillis();
        
        System.out.println("*****************************************************************");
        System.out.println("Time: " + (timerStop - timerStart));
        System.out.println("*****************************************************************");
        // Das hier ist noch ein Test auf Korrektheit
        for(int i=0; i< 10; i++)
        {
            // Das (Element) ist ein cast: pop() liefert ein Object zurueck, wir muessen dem Kompiler wieder beibringen, dass dieses Object ein Element ist...
            ((Element)queue.pop()).print();
        }
	System.out.println(queue.objs.length);
	System.out.println("Increased by 1.5 factor " + queue.counter + " times...");
    }
}
