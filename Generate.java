import java.lang.Math;

class Generate {
    // Java program to generate random numbers from 1 to 6

    // Defining the range
    private int min = 1;
    private int max = 6;
    private int range = max - min + 1;

    // Generate random number
    public int getNumber() {
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
}