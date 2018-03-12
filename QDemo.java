class Queue {

    char q[]; // array to hold queue

    int putloc, getloc; // the put and get indicies

    Queue (int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put (char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // get a character from the queue
    char get () {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QDemo {

    public static void main (String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers in to the bigQ
        for (i=0; i<26; i++)
            //bigQ.put((char) ('A' + i));
            bigQ.put((char) ('Z' - i));
        
        //retreive and display elements from bigQ
        System.out.println("Contents of bigQ: ");
        for (i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        //Now, use smallQ to generate some errors
        for(i=0; i<5; i++) {
            System.out.print("Attempting to store " + 
                            (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));

            System.out.println();
            }
            System.out.println();
    
    // more erros on smallQ
    System.out.print("Continue of smallQ: ");
    for (i=0; i<5; i++) {
        ch = smallQ.get();
        if(ch != (char) 0) System.out.print(ch);
    }

    }
}