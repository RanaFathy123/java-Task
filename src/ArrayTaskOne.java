public class ArrayTaskOne {
    public  static  void main(String[] args){
//  Create a Java program where you:
//  Initialize an array of 5 integers.
// Assign specific values to each index of the array manually.
//  Print each value of the array individually, by directly accessing each index

        int [] arrayOfIntegers = new int[5];
        arrayOfIntegers[0] =5;
        arrayOfIntegers[1]=10;
        arrayOfIntegers[2]=20;
        arrayOfIntegers[3]=30;
        arrayOfIntegers[4]=40;
        System.out.println("first Element is " + arrayOfIntegers[0]);
        System.out.println("second Element is " + arrayOfIntegers[1]);
        System.out.println("third Element is " + arrayOfIntegers[2]);
        System.out.println("fourth Element is " + arrayOfIntegers[3]);
        System.out.println("fifth Element is " + arrayOfIntegers[4]);
    }
}
