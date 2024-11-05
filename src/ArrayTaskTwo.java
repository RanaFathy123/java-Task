public class ArrayTaskTwo {
    public  static void main(String [] args){
        //        Create a Java program where you:
//  Initialize two arrays: one with 6 integer elements and another with 6 double
//        elements.
// Manually assign values to both arrays, where the double array contains values
//        that are the square roots of the corresponding integers in the integer array.
//  Print both the integer and double arrays side by side, showing the relationship
//        between each integer and its square root.
// Output Example
//        Number: 1 | Square Root: 1.0
//        Number: 4 | Square Root: 2.0
//        Number: 9 | Square Root: 3.0
//        Number: 16 | Square Root: 4.0
//        Number: 25 | Square Root: 5.0
//        Number: 36 | Square Root: 6.0

        int [] arrayOfIntegers = new int[6];
        double [] arrayOfdouble =new double[6];

        arrayOfIntegers[0] = 1;
        arrayOfIntegers[1] = 4;
        arrayOfIntegers[2] = 9;
        arrayOfIntegers[3] = 16;
        arrayOfIntegers[4] = 25;
        arrayOfIntegers[5] = 36;

        arrayOfdouble[0] = 1.0;
        arrayOfdouble[1]=2.0;
        arrayOfdouble[2]=3.0;
        arrayOfdouble[3]=4.0;
        arrayOfdouble[4]=5.0;
        arrayOfdouble[5]=6.0;


        System.out.println("Number: " + arrayOfIntegers[0] +" " + "|" + " " + "Square Root: " +arrayOfdouble[0]);
        System.out.println("Number: " + arrayOfIntegers[1] +" " + "|" + " " + "Square Root: " +arrayOfdouble[1]);
        System.out.println("Number: " + arrayOfIntegers[2]+" " + "|" + " " +"Square Root: " +arrayOfdouble[2]);
        System.out.println("Number: " + arrayOfIntegers[3] +" " + "|" + " " + "Square Root: " +arrayOfdouble[3]);
        System.out.println("Number: " + arrayOfIntegers[4] +" " + "|" + " " +"Square Root: " +arrayOfdouble[4]);
        System.out.println("Number: " + arrayOfIntegers[5] +" " + "|" + " " + "Square Root: " +arrayOfdouble[5]);

    }
}
