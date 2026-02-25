package semester2.lektion9.train;

import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain()
    {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    {

        // TODO: Assignment 1: Implement this add method...
        wagon.setNextWagon(firstWagon);
        firstWagon = wagon;

    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst()
    // TODO: Assignment 2: Implement this remove method...
    {
        if (firstWagon == null) {
            throw new NoSuchElementException();
        }
        // Giver variablen 'removed' værdien af den nuværende firstWagon
        WagonNode removed = firstWagon;
        // Giver variablen firstWagon værdien af den næste wagon.
        firstWagon = firstWagon.getNextWagon();
        // Fjerner forbindelsen mellem den gamle firstWagon og den næste wagon
        removed.setNextWagon(null);
        // Returnerer den fjernede (første) wagon
        return removed;


        // throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count()
    {
        // TODO: Assignment 3: Implement this count method...

        // Starter på nul.
        int count = 0;
        // Starter ved den første wagon
        WagonNode current = firstWagon;

        // Tæller en op hver gang wagon ikke er null
        while (current != null) {
            count++;
            current = current.getNextWagon();
        }
        return count;

        // throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon)
    {
        // TODO: Assignment 4: Implement this remove method...

        // Tjekker om listen er helt tom
        if (firstWagon == null) {
            return false;
        }

        // Tjekker om den ønskede vogn er den første
        if (firstWagon == wagon) {
            removeFirst();
            return true;
        }

        // Den første wagon er allerede håndteret, starter ved getNextWagon
        WagonNode previous = firstWagon;
        WagonNode current = firstWagon.getNextWagon();

        // Så længe vi ikke er forbi enden af listen
        while (current != null) {
            // Hvis den nuværende wagon, er den vi leder efter:
            if (current == wagon) {
                previous.setNextWagon(current.getNextWagon());
                current.setNextWagon(null);
                return true;
            }
            // Ellers går vi videre:
            previous = current;
            current = current.getNextWagon();
            // Og kør igen.
        }
        // Returnerer false hvis vi kommer igennem uden at finde den ønskede wagon
        return false;
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        // TODO: Assignment 5: Implement this insert method...

        // Hvis listen er tom indsættes wagon som den første:
        if (firstWagon == null) {
            addFirst(wagon);
            return;
        }
        WagonNode current = firstWagon;
        int index = 0;

        while (current.getNextWagon() != null && index < position -1) {
            current = current.getNextWagon();
            index++;
        }
        wagon.setNextWagon(current.getNextWagon());
        current.setNextWagon(wagon);


    }
}
