public class printArrays {
    // printing one-dimensional arrays
    public static void main(String[] args) {
        
        // Declare and Reference an array variable:
        int sample[] = new int[10];

        // The above line # 6 is same as following two lines: 
        // int sample[];
        // sample = new int[10];

        int i, min, max;

        for (i=0; i < sample.length; i++)
            sample[i] = i;
            System.out.println("This is sample array size: " + i);
        
            for (i=0; i<sample.length; i++)
            System.out.println("This is sample[" + i + "]: " +
                                sample[i]);

        int num[] = {99, -10, 100123, 18, -978,
                        5623, 463, -9, 287, 49 };

            min = max = num[0];
            //System.out.println("min: " + min );
            //System.out.println("max: " + max );

            for(int x=1; x < 10; x++) {
                if(num[x] < min) min = num[x]; 
                System.out.println("min value is: " + min );
                if(num[x] > max) max = num[x];
                System.out.println("max value is: " + max );
            }
            System.out.println("Min and Max: " + min + " " + max);

    }   
}
