class printAlpha{

    public static void main(String[] args) {
        int i;
        System.out.println("Print Alphabets: ");
        for(i=0; i < 26; i++) {
            System.out.print((char) ('A' + i));
        }
        System.out.println(" \n");
        System.out.println("Print Reverse Order: ");

        for(i=0; i<26; i++){
            System.out.print((char) ('Z' - i));
        }
        System.out.println(" \n");
    }

}